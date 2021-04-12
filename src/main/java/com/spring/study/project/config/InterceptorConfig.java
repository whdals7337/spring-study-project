package com.spring.study.project.config;

import com.spring.study.project.interceptor.Common2Interceptor;
import com.spring.study.project.interceptor.CommonInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    CommonInterceptor commonInterceptor;

    @Autowired
    Common2Interceptor common2Interceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor).addPathPatterns("/*").order(Ordered.HIGHEST_PRECEDENCE); // HIGHEST_PRECEDENCE = -2147483648
        registry.addInterceptor(common2Interceptor).addPathPatterns("/*").order(Ordered.LOWEST_PRECEDENCE); // LOWEST_PRECEDENCE = 2147483648
    }
}
