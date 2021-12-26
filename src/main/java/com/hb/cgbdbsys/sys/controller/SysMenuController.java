package com.hb.cgbdbsys.sys.controller;

import com.hb.cgbdbsys.common.vo.JsonResult;
import com.hb.cgbdbsys.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//
//
@RestController
@RequestMapping("/menu/")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("doFindObjects")
    public JsonResult doFindObjects(){
        return new JsonResult(sysMenuService.findObjects());
    }


}
