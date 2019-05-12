package com.sunda.ad.service;

import com.sunda.ad.entity.AdPlan;
import com.sunda.ad.exception.AdException;
import com.sunda.ad.vo.AdPlanGetRequest;
import com.sunda.ad.vo.AdPlanRequest;
import com.sunda.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * Created by 老蹄子 on 2019/5/9 下午9:25
 */
public interface IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
