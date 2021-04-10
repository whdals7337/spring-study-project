package com.spring.study.project.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns= "/*")
public class Custom2Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("Custom2Filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("Custom2Filter doFilter start");
        chain.doFilter(request, response);
        log.info("Custom2Filter doFilter end");
    }

    @Override
    public void destroy() {
        log.info("Custom2Filter destroy");
    }
}
