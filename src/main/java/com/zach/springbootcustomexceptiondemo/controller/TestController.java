package com.zach.springbootcustomexceptiondemo.controller;

import com.zach.springbootcustomexceptiondemo.entity.ResultStatusEnum;
import com.zach.springbootcustomexceptiondemo.excepetion.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1")
    public Object testError1(){
        throw new CustomException(ResultStatusEnum.PASSWORD_NOT_MATCHING);
    }

    @GetMapping("/test2")
    public Object testError2(){
        throw new CustomException(400,"系统异常");
    }
}
