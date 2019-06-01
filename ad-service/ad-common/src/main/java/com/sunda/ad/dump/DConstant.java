package com.sunda.ad.dump;

/**
 * Created by 老蹄子 on 2019/6/1 下午9:31
 */
public class DConstant {

    // 数据文件存储目录
    public static final String DATA_ROOT_DIR = "/Users/laotizi/code/git_pro/ad-spring-cloud/mysql_data/";

    // 各个数据表的文件名称
    public static final String AD_PLAN = "ad_plan.data";
    public static final String AD_UNIT = "ad_unit.data";
    public static final String AD_CREATIVE = "ad_creative.data";
    public static final String AD_CREATIVE_UNIT = "ad_creative_unit.data";
    public static final String AD_UNIT_IT = "ad_unit_it.data";
    public static final String AD_UNIT_DISTRICT = "ad_unit_district.data";
    public static final String AD_UNIT_KEYWORD = "ad_unit_keyword.data";


    public static void main(String[] args) {
        System.out.println(String.format("%s%s", DConstant.DATA_ROOT_DIR, DConstant.AD_PLAN));
    }

}
