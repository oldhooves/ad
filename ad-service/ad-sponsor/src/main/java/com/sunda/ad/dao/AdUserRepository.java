package com.sunda.ad.dao;

import com.sunda.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 老蹄子 on 2019/5/9 下午9:15
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    AdUser findByUsername(String username);
}
