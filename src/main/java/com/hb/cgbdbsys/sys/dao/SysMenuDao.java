package com.hb.cgbdbsys.sys.dao;

import com.hb.cgbdbsys.common.vo.Node;
import com.hb.cgbdbsys.sys.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysMenuDao {
    // 获取所有菜单信息，包扩当前菜单对应的上级菜单的菜单名称
    List<Map<String, Object>> findObjects() ;
/*
* 查询菜单的id，name 以及parentId*/
    @Select("select id,name,parentId from sys_menus")
    List<Node> findZtreeMenuNodes();


    int insertObject(SysMenu entity);

}
