package com.linx.persistence;

import com.linx.model.SysUsersRolesDo;
import com.linx.model.SysUsersRolesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersRolesDao {
    /**
     * sys_users_roles
     */
    int countByQuery(SysUsersRolesQuery example);

    /**
     * sys_users_roles
     */
    int deleteByQuery(SysUsersRolesQuery example);

    /**
     * sys_users_roles
     */
    int deleteByPrimaryKey(String id);

    /**
     * sys_users_roles
     */
    int insert(SysUsersRolesDo record);

    /**
     * sys_users_roles
     */
    int insertSelective(SysUsersRolesDo record);

    /**
     * sys_users_roles
     */
    List<SysUsersRolesDo> selectByQuery(SysUsersRolesQuery example);

    /**
     * sys_users_roles
     */
    SysUsersRolesDo selectByPrimaryKey(String id);

    /**
     * sys_users_roles
     */
    int updateByQuerySelective(@Param("record") SysUsersRolesDo record, @Param("example") SysUsersRolesQuery example);

    /**
     * sys_users_roles
     */
    int updateByQuery(@Param("record") SysUsersRolesDo record, @Param("example") SysUsersRolesQuery example);

    /**
     * sys_users_roles
     */
    int updateByPrimaryKeySelective(SysUsersRolesDo record);

    /**
     * sys_users_roles
     */
    int updateByPrimaryKey(SysUsersRolesDo record);
}