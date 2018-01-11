package com.ty.test.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class MyListener implements ServletContextListener{

    private static final Logger logger = LoggerFactory.getLogger(MyListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Listener启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
