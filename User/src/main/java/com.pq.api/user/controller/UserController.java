package com.pq.api.user.controller;

import com.pq.api.user.bean.UserBean;
import com.pq.api.user.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@EnableAutoConfiguration
public class UserController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<UserBean> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping("/User/test")
    public String test(){
        return "hello world ";
    }

    @RequestMapping("/")
    public String hello(){

        return "hello world ";
    }




}