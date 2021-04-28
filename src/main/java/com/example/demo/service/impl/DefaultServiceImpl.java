package com.example.demo.service.impl;

import com.example.demo.entity.DefaultRequest;
import com.example.demo.service.DefaultService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/4/25 15:13
 * @Description:
 */
@Service
@Validated
public class DefaultServiceImpl implements DefaultService {
    @Override
    public void defaultService(DefaultRequest request) {

    }
}