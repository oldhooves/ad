package com.sunda.ad.conf;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Created by 老蹄子 on 2019/5/6 下午8:23
 */
public class WebConfiguration implements WebMvcConfigurer{

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>>
                                                   converters) {

        converters.clear();
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
