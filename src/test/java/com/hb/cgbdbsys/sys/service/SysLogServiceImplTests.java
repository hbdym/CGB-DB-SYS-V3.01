package com.hb.cgbdbsys.sys.service;

import com.hb.cgbdbsys.common.vo.PageObject;
import com.hb.cgbdbsys.sys.dao.SysLogDao;
import com.hb.cgbdbsys.sys.entity.SysLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.rmi.ServerException;

@SpringBootTest
public class SysLogServiceImplTests {
    @Autowired
    private SysLogServiceImpl sysLogServiceImpl;

    @Test
    public void testFindPageObjects() throws ServerException {
        PageObject<SysLog> testFindPageObjects = sysLogServiceImpl.findPageObjects("admin", 2);

        System.out.println(testFindPageObjects.toString());

    }



}
