package com.ty.test;

import com.ty.test.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TestApplication {

//    @Bean
//	public ServletRegistrationBean servletRegistrationBean(){
//        //添加自定义Servlet
//	    return new ServletRegistrationBean(new MyServlet(), "/ms/*");
//    }

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
