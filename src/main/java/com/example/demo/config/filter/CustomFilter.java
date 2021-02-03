package com.example.demo.config.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("################## CustomFilter Start ##################");

        chain.doFilter(request,response);

        log.info("################## CustomFilter End ##################");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("################## CustomFilter init ##################");
    }

    @Override
    public void destroy() {

    }
}
