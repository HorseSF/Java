package com.tlias.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {

    // 初始化方法，只调用一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ...");
    }

    // 拦截到请求之后调用，调用多次
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Demo_doFilter ...放行前");

        // 放行
        chain.doFilter(request, response);

        System.out.println("Demo_doFilter ...放行后");
    }

    // 销毁方法，只调用一次
    @Override
    public void destroy() {
        System.out.println("destroy ...");
    }
}
