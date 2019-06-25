package com.sunda.ad.search;

import com.sunda.ad.search.vo.SearchRequest;
import com.sunda.ad.search.vo.SearchResponse;

/**
 * Created by 老蹄子 on 2019/6/25 上午9:47
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
