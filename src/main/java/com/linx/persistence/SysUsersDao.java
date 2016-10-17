package com.linx.persistence;

import com.linx.model.SysUsersDo;
import com.linx.model.SysUsersQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersDao {
    /**
     * sys_users
     */
    int countByQuery(SysUsersQuery example);

    /**
     * sys_users
     */
    int deleteByQuery(SysUsersQuery example);

    /**
     * sys_users
     */
    int deleteByPrimaryKey(String userId);

    /**
     * sys_users
     */
    int insert(SysUsersDo record);

    /**
     * sys_users
     */
    int insertSelective(SysUsersDo record);

    /**
     * sys_users
     */
    List<SysUsersDo> selectByQuery(SysUsersQuery example);

    /**
     * sys_users
     */
    SysUsersDo selectByPrimaryKey(String userId);

    /**
     * sys_users
     */
    int updateByQuerySelective(@Param("record") SysUsersDo record, @Param("example") SysUsersQuery example);

    /**
     * sys_users
     */
    int updateByQuery(@Param("record") SysUsersDo record, @Param("example") SysUsersQuery example);

    /**
     * sys_users
     */
    int updateByPrimaryKeySelective(SysUsersDo record);

    /**
     * sys_users
     */
    int updateByPrimaryKey(SysUsersDo record);
}