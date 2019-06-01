package com.sunda.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 老蹄子 on 2019/6/1 下午9:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitDistrictTable {


    private Long unitId;
    private String province;
    private String city;
}
