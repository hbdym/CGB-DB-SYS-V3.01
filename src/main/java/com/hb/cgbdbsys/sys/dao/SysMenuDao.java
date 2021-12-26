package com.hb.cgbdbsys.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysMenuDao {
    // 获取所有菜单信息，包扩当前菜单对应的上级菜单的菜单名称
    List<Map<String, Object>> findObjects() ;
}
