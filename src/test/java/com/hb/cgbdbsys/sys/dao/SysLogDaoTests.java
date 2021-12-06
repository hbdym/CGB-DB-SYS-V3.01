package com.hb.cgbdbsys.sys.dao;

import com.hb.cgbdbsys.sys.entity.SysLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SysLogDaoTests {
    @Autowired
    private SysLogDao sysLogDao;

    @Test
    public void testGetRowCount(){
        int i = sysLogDao.getRowCount("admin");
        System.out.println("rows = \t" + i);
    }

    @Test
    public void testfindPageObjects(){
        List<SysLog> list =
                sysLogDao.findPageObjects(null,0,3);
        for(SysLog syslog : list){
            System.out.println(syslog);
        }
    }

}
