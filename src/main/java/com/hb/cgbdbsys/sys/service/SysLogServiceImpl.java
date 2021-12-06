package com.hb.cgbdbsys.sys.service;


import com.hb.cgbdbsys.common.vo.PageObject;
import com.hb.cgbdbsys.sys.dao.SysLogDao;
import com.hb.cgbdbsys.sys.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;
import java.rmi.server.ServerCloneException;
import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService{

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public PageObject<SysLog> findPageObjects(String username, Integer pageCurrent) throws ServerException {
        //验证参数合法性，当前页面
        if (pageCurrent==null || pageCurrent<1)
            throw new IllegalArgumentException("当前页码不正确");

        int rowCount = sysLogDao.getRowCount(username);
        if (rowCount==0)
            throw new ServerException("系统没有查到对应记录");

        //3.基于条件查询当前页记录(pageSize定义为2)
        //3.1)定义pageSize
        int pageSize=17;

        int startIndex = (pageCurrent-1)*pageSize;
        List<SysLog> records =
                sysLogDao.findPageObjects(username,startIndex,pageSize);

        return new PageObject<>(records, rowCount,  pageSize,  pageCurrent);
    }
}
