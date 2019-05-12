package com.sunda.ad.constant;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2019/5/9 下午8:28
 */
@Getter
public enum CreativeType {

    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
