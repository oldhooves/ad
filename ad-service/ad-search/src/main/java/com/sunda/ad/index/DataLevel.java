package com.sunda.ad.index;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2019/5/31 下午8:43
 */
@Getter
public enum DataLevel {

    LEVEL2("2", "level 2"),
    LEVEL3("3", "level 3"),
    LEVEL4("4", "level 4");

    private String level;
    private String desc;

    DataLevel(String level, String desc) {
        this.level = level;
        this.desc = desc;
    }
}
