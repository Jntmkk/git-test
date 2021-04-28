package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.entity.DefaultRequest;
import com.example.demo.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/3/23 15:33
 * @Description:
 */
@RestController
public class DefaultController {
    @Autowired
    DefaultService defaultService;

    @GetMapping("/add_age")
    boolean addAge(Integer age) {
        return false;
    }

    @PostMapping("/validator")
    public Boolean validator(@Validated @RequestBody User user) {
        return false;
    }

    @GetMapping("/")
    public Boolean index(DefaultRequest request) {
        defaultService.defaultService(request);
        return Boolean.TRUE;
    }

}