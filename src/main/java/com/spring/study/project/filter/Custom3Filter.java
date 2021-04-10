package com.spring.study.project.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
@Component
@Order(0)
public class Custom3Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("Custom3Filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("Custom3Filter doFilter start");
        chain.doFilter(request, response);
        log.info("Custom3Filter doFilter end");
    }

    @Override
    public void destroy() {
        log.info("Custom3Filter destroy");
    }
}
