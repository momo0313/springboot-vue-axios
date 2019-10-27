package com.study.test.controller;

import com.study.test.vo.UserRequestVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019-10-27.
 */
@RestController
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestBody UserRequestVo vo) {
        System.out.println(vo.getUsername() + ": " + vo.getPassword());
        return "shen";
    }
}