package com.sunda.ad.sender;

import com.sunda.ad.mysql.dto.MySqlRowData;

/**
 * Created by 老蹄子 on 2019/6/9 下午9:30
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}