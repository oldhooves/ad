package com.sunda.ad.service;

import com.sunda.ad.exception.AdException;
import com.sunda.ad.vo.CreateUserRequest;
import com.sunda.ad.vo.CreateUserResponse;

/**
 * Created by 老蹄子 on 2019/5/9 下午9:28
 */
public interface IUserService {
    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
