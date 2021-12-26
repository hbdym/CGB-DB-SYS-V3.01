package com.hb.cgbdbsys.sys.dao;

import com.hb.cgbdbsys.sys.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysLogDao {

    int getRowCount(@Param("username") String username);

    List<SysLog> findPageObjects (
             String username,
             int startIndex,
             int pageSize
    );

    // 根据id执行删除业务
    int deleteObjects(long... ids);
}
