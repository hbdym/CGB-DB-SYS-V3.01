package com.hb.cgbdbsys.sys.controller;

import com.hb.cgbdbsys.common.vo.JsonResult;
import com.hb.cgbdbsys.common.vo.PageObject;
import com.hb.cgbdbsys.sys.entity.SysLog;
import com.hb.cgbdbsys.sys.service.SysLogService;
import com.hb.cgbdbsys.sys.service.SysLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.rmi.ServerException;

@Controller
@RequestMapping("/log/")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @ResponseBody
    @RequestMapping("doFindPageObjects")
    public JsonResult doFindPageObjects(String username, Integer pageCurrent) throws ServerException {
        PageObject<SysLog> pageObject =
            sysLogService.findPageObjects(username,pageCurrent);

        return new JsonResult(pageObject);

    }

    @ResponseBody
    @RequestMapping("doDeleteObjects")
    public JsonResult doDeleteObjects(long... ids){
        sysLogService.deleteObjects(ids);
        return new JsonResult("delete ok");
    }


}
