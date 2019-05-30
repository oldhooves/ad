package com.sunda.ad.client;

import com.sunda.ad.client.vo.AdPlan;
import com.sunda.ad.client.vo.AdPlanGetRequest;
import com.sunda.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 老蹄子 on 2019/5/30 下午7:56
 */
@Component
public class SponsorClientHystrix implements SponsorClient{
    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
