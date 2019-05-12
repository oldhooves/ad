package com.sunda.ad.service;

import com.sunda.ad.vo.CreativeRequest;
import com.sunda.ad.vo.CreativeResponse;

/**
 * Created by 老蹄子 on 2019/5/9 下午9:27
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);

}
