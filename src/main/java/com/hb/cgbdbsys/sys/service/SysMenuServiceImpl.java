package com.hb.cgbdbsys.sys.service;

import com.hb.cgbdbsys.common.exception.ServiceException;
import com.hb.cgbdbsys.common.vo.Node;
import com.hb.cgbdbsys.sys.dao.SysMenuDao;
import com.hb.cgbdbsys.sys.entity.SysMenu;
import io.micrometer.core.instrument.util.StringUtils;
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

    @Override
    public List<Node> findZtreeMenuNodes() {
        return sysMenuDao.findZtreeMenuNodes();
    }

    @Override
    public void saveObject(SysMenu entity) {
        //1.合法验证
        if(entity==null)
            throw new ServiceException("保存对象不能为空");
        if(StringUtils.isEmpty(entity.getName()))
            throw new ServiceException("菜单名不能为空");
        //2.保存数据
        try{
            sysMenuDao.insertObject(entity);

        }catch(Exception e){
            e.printStackTrace();
            throw new ServiceException("保存失败");
        }


    }


}
