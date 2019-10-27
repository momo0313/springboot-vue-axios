package com.study.test.controller;

import com.study.test.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019-10-26.
 */
@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String hello() {
        return helloWorldService.hello();
    }
}
