package com.sunda.ad.service.impl;

import com.sunda.ad.constant.Constants;
import com.sunda.ad.dao.AdUserRepository;
import com.sunda.ad.entity.AdUser;
import com.sunda.ad.exception.AdException;
import com.sunda.ad.service.IUserService;
import com.sunda.ad.utils.CommonUtils;
import com.sunda.ad.vo.CreateUserRequest;
import com.sunda.ad.vo.CreateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 老蹄子 on 2019/5/9 下午9:40
 */
@Service
public class UserServiceImpl implements IUserService{

    private final AdUserRepository userRepository;

    @Autowired
    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {

        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdUser oldUser = userRepository.findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser newUser = userRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())
        ));

        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
    }
}
