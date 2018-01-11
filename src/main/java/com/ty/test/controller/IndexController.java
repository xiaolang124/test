package com.ty.test.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.ty.test.service.StudentService;
import com.ty.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private StudentService studentService;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        logger.info("处理IndexController");
        return "StudentNum:"
                +studentService.countStudentNum()
                +"<br/>UserNum:"+userService.countUserNum();
    }
}
