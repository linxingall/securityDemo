package com.linx.persistence;

import com.linx.model.SysRolesDo;
import com.linx.model.SysRolesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesDao {
    /**
     * sys_roles
     */
    int countByQuery(SysRolesQuery example);

    /**
     * sys_roles
     */
    int deleteByQuery(SysRolesQuery example);

    /**
     * sys_roles
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * sys_roles
     */
    int insert(SysRolesDo record);

    /**
     * sys_roles
     */
    int insertSelective(SysRolesDo record);

    /**
     * sys_roles
     */
    List<SysRolesDo> selectByQuery(SysRolesQuery example);

    /**
     * sys_roles
     */
    SysRolesDo selectByPrimaryKey(String roleId);

    /**
     * sys_roles
     */
    int updateByQuerySelective(@Param("record") SysRolesDo record, @Param("example") SysRolesQuery example);

    /**
     * sys_roles
     */
    int updateByQuery(@Param("record") SysRolesDo record, @Param("example") SysRolesQuery example);

    /**
     * sys_roles
     */
    int updateByPrimaryKeySelective(SysRolesDo record);

    /**
     * sys_roles
     */
    int updateByPrimaryKey(SysRolesDo record);
}