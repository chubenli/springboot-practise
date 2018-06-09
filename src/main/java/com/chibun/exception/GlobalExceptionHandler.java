package com.chibun.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//全局异常类
@ControllerAdvice//aop的异常通知注解
public class GlobalExceptionHandler {
    //指定捕获异常类型
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody//json返回
    public Map<String, String> errorResult(){
        Map<String ,String> error = new HashMap<>();
        error.put("errorCode", "500");
        error.put("errorMsg", "系统异常!");
        return  error;
    }
}
