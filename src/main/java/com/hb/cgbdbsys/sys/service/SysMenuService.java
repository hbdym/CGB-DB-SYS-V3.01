package com.hb.cgbdbsys.sys.service;

import com.hb.cgbdbsys.common.vo.Node;
import com.hb.cgbdbsys.sys.entity.SysMenu;

import java.util.List;
import java.util.Map;

public interface SysMenuService {

    List<Map<String, Object>> findObjects();
    List<Node> findZtreeMenuNodes();
    void saveObject(SysMenu entity);
}
