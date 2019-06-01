package com.sunda.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by 老蹄子 on 2019/6/1 下午9:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanTable {


    private Long id;
    private Long userId;
    private Integer planStatus;
    private Date startDate;
    private Date endDate;
}