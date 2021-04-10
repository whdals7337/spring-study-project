package com.spring.study.project.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("CustomFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("CustomFilter doFilter start");
        chain.doFilter(request, response);
        log.info("CustomFilter doFilter end");
    }

    @Override
    public void destroy() {
        log.info("CustomFilter destroy");
    }
}
