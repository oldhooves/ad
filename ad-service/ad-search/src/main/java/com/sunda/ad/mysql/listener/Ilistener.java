package com.sunda.ad.mysql.listener;

import com.sunda.ad.mysql.dto.BinlogRowData;

/**
 * Created by 老蹄子 on 2019/6/9 下午9:21
 */
public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
