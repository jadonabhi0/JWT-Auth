package com.abhi.auth.controller;/*
    @author jadon
*/

import com.abhi.auth.modals.User;
import com.abhi.auth.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/test")
public class TestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> test(){
        System.out.println("Hello");
        logger.info("Hello form controller");
        return userService.getAllUser();
    }



}
