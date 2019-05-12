package com.sunda.ad.service.impl;

import com.sunda.ad.dao.CreativeRepository;
import com.sunda.ad.entity.Creative;
import com.sunda.ad.service.ICreativeService;
import com.sunda.ad.vo.CreativeRequest;
import com.sunda.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 老蹄子 on 2019/5/9 下午9:41
 */
@Service
public class CreativeServiceImpl implements ICreativeService{

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(request.convertToEntity());

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
