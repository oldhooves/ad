package com.sunda.ad.constant;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2019/5/9 下午8:22
 */
@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
