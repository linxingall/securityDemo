package com.linx.persistence;

import com.linx.model.SysRolesAuthoritiesDo;
import com.linx.model.SysRolesAuthoritiesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesAuthoritiesDao {
    /**
     * sys_roles_authorities
     */
    int countByQuery(SysRolesAuthoritiesQuery example);

    /**
     * sys_roles_authorities
     */
    int deleteByQuery(SysRolesAuthoritiesQuery example);

    /**
     * sys_roles_authorities
     */
    int deleteByPrimaryKey(String id);

    /**
     * sys_roles_authorities
     */
    int insert(SysRolesAuthoritiesDo record);

    /**
     * sys_roles_authorities
     */
    int insertSelective(SysRolesAuthoritiesDo record);

    /**
     * sys_roles_authorities
     */
    List<SysRolesAuthoritiesDo> selectByQuery(SysRolesAuthoritiesQuery example);

    /**
     * sys_roles_authorities
     */
    SysRolesAuthoritiesDo selectByPrimaryKey(String id);

    /**
     * sys_roles_authorities
     */
    int updateByQuerySelective(@Param("record") SysRolesAuthoritiesDo record, @Param("example") SysRolesAuthoritiesQuery example);

    /**
     * sys_roles_authorities
     */
    int updateByQuery(@Param("record") SysRolesAuthoritiesDo record, @Param("example") SysRolesAuthoritiesQuery example);

    /**
     * sys_roles_authorities
     */
    int updateByPrimaryKeySelective(SysRolesAuthoritiesDo record);

    /**
     * sys_roles_authorities
     */
    int updateByPrimaryKey(SysRolesAuthoritiesDo record);
}