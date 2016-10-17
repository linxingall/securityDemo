package com.linx.persistence;

import com.linx.model.SysRolesMoudlesDo;
import com.linx.model.SysRolesMoudlesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesMoudlesDao {
    /**
     * sys_roles_moudles
     */
    int countByQuery(SysRolesMoudlesQuery example);

    /**
     * sys_roles_moudles
     */
    int deleteByQuery(SysRolesMoudlesQuery example);

    /**
     * sys_roles_moudles
     */
    int deleteByPrimaryKey(String id);

    /**
     * sys_roles_moudles
     */
    int insert(SysRolesMoudlesDo record);

    /**
     * sys_roles_moudles
     */
    int insertSelective(SysRolesMoudlesDo record);

    /**
     * sys_roles_moudles
     */
    List<SysRolesMoudlesDo> selectByQuery(SysRolesMoudlesQuery example);

    /**
     * sys_roles_moudles
     */
    SysRolesMoudlesDo selectByPrimaryKey(String id);

    /**
     * sys_roles_moudles
     */
    int updateByQuerySelective(@Param("record") SysRolesMoudlesDo record, @Param("example") SysRolesMoudlesQuery example);

    /**
     * sys_roles_moudles
     */
    int updateByQuery(@Param("record") SysRolesMoudlesDo record, @Param("example") SysRolesMoudlesQuery example);

    /**
     * sys_roles_moudles
     */
    int updateByPrimaryKeySelective(SysRolesMoudlesDo record);

    /**
     * sys_roles_moudles
     */
    int updateByPrimaryKey(SysRolesMoudlesDo record);
}