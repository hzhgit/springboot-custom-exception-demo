package com.zach.springbootcustomexceptiondemo.config;

import com.zach.springbootcustomexceptiondemo.excepetion.CustomException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(CustomException.class)
    public Map<String,Object> handleCustomException(CustomException customException){
        Map<String,Object> errorResultMap = new HashMap<>();
        errorResultMap.put("code",customException.getCode());
        errorResultMap.put("message",customException.getMessage());
        return  errorResultMap;
    }
}
