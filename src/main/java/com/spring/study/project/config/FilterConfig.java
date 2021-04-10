package com.spring.study.project.config;

import com.spring.study.project.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter> customFilterRegister() {
        FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomFilter()); // 필터 등록
        registrationBean.setOrder(1); // 필터 수행 순서 작을수록 먼저
        registrationBean.addUrlPatterns("/*"); // 필터가 수행될 요청의 URL 패턴
        return registrationBean;
    }
}
