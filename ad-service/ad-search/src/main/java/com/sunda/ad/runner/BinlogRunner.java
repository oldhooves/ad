package com.sunda.ad.runner;

import com.sunda.ad.mysql.BinlogClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 老蹄子 on 2019/6/9 下午9:31
 */
@Slf4j
@Component
public class BinlogRunner implements CommandLineRunner {

    private final BinlogClient client;

    @Autowired
    public BinlogRunner(BinlogClient client) {
        this.client = client;
    }

    @Override
    public void run(String... strings) throws Exception {

        log.info("Coming in BinlogRunner...");
        client.connect();
    }
}
