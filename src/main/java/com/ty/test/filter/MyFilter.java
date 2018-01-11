package com.ty.test.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter{

    private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("启动Filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        class org.apache.catalina.connector.RequestFacade
//        System.out.println(request.getClass());
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        logger.info("Filter拦截"+httpServletRequest.getRequestURI());
        chain.doFilter(request,response);
        logger.info("Filter处理response");
    }

    @Override
    public void destroy() {

    }
}
