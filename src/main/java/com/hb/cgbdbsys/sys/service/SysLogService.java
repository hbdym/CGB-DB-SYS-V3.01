package com.hb.cgbdbsys.sys.service;


import com.hb.cgbdbsys.common.vo.PageObject;
import com.hb.cgbdbsys.sys.entity.SysLog;

import java.rmi.ServerException;

public interface SysLogService {
    PageObject<SysLog> findPageObjects(String username, Integer pageCurrent) throws ServerException;

    int deleteObjects(long...ids);
}


