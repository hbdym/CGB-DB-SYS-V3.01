package com.hb.cgbdbsys.sys.service;


import com.hb.cgbdbsys.common.vo.PageObject;
import com.hb.cgbdbsys.common.exception.ServiceException;
import com.hb.cgbdbsys.sys.dao.SysLogDao;
import com.hb.cgbdbsys.sys.entity.SysLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class SysLogServiceImpl implements SysLogService{

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public PageObject<SysLog> findPageObjects(String username, Integer pageCurrent) {
        //验证参数合法性，当前页面
        if (pageCurrent==null || pageCurrent<1)
            throw new IllegalArgumentException("当前页码不正确");

        int rowCount = sysLogDao.getRowCount(username);
        if (rowCount==0)
            throw new ServiceException("系统没有查到对应记录");

        //3.基于条件查询当前页记录(pageSize定义为2)
        //3.1)定义pageSize
        int pageSize=10;

        int startIndex = (pageCurrent-1)*pageSize;
        List<SysLog> records =
                sysLogDao.findPageObjects(username,startIndex,pageSize);

        return new PageObject<>(records, rowCount,  pageSize,  pageCurrent);
    }

    @Override
    public int deleteObjects(long...ids) {
        if (ids==null || ids.length < 0)
            throw new IllegalArgumentException("请先选择删除的数据");
        int rows = sysLogDao.deleteObjects(ids);

        if (rows==0)
            throw new NoSuchElementException("记录已经不存在");

        return rows;
    }

}
