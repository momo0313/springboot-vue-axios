package com.study.test.service.impl;

import com.study.test.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019-10-26.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "hello world";
    }
}
