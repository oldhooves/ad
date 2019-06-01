package com.sunda.ad.controller;

import com.alibaba.fastjson.JSON;
import com.sunda.ad.annotation.IgnoreResponseAdvice;
import com.sunda.ad.client.SponsorClient;
import com.sunda.ad.client.vo.AdPlan;
import com.sunda.ad.client.vo.AdPlanGetRequest;
import com.sunda.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by 老蹄子 on 2019/6/1 下午9:26
 */
@Slf4j
@RestController
public class SearchController {


    private final SponsorClient sponsorClient;
    private final RestTemplate restTemplate;

    @Autowired
    public SearchController(RestTemplate restTemplate, SponsorClient sponsorClient) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }

    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("/getAdPlansByRibbon")
    public CommonResponse<List<AdPlan>> getAdPlansByRebbon(@RequestBody AdPlanGetRequest request) {
        log.info("ad-search: getAdPlansByRebbon -> {}", JSON.toJSONString(request));
        return restTemplate.postForEntity(
                "http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan",
                request,
                CommonResponse.class
        ).getBody();
    }
}
