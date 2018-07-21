package com.pq.api.user.controller;

import com.pq.api.common.BaseResult;
import com.pq.api.user.bean.UserBean;
import com.pq.api.user.db.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@EnableAutoConfiguration
public class ControllerUser {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user/add")
    public String addUser(@RequestParam(value="name", defaultValue="test") String name,@RequestParam(value="password") String password) {
        UserBean n = new UserBean();
        n.setName(name);
        n.setEmail(password);
        userRepository.save(n);
        return "Saved";
    }

    @RequestMapping("/user/test")
    public BaseResult<String> login(){

        return new BaseResult<>();
    }




}