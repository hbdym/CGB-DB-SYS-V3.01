package com.hb.cgbdbsys.common.web;

import com.hb.cgbdbsys.common.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandRuntimeException(RuntimeException e){
        e.printStackTrace();
        return new JsonResult(e);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public JsonResult doHandRuntimeException(IllegalArgumentException e){
        e.printStackTrace();
        return new JsonResult(e);
    }

}
