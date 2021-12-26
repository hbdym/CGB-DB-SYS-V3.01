package com.hb.cgbdbsys.sys.service;

import com.hb.cgbdbsys.sys.dao.SysMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysMenuServiceImpl implements SysMenuService{

    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public List<Map<String, Object>> findObjects() {
        return sysMenuDao.findObjects();
    }
}
