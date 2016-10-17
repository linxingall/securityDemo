package com.linx.persistence;

import com.linx.model.SysAuthoritiesDo;
import com.linx.model.SysAuthoritiesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthoritiesDao {
    List<String> getSysAuthoritiesByUserId(String userId);
    /**
     * sys_authorities
     */
    int countByQuery(SysAuthoritiesQuery example);

    /**
     * sys_authorities
     */
    int deleteByQuery(SysAuthoritiesQuery example);

    /**
     * sys_authorities
     */
    int deleteByPrimaryKey(String authorityId);

    /**
     * sys_authorities
     */
    int insert(SysAuthoritiesDo record);

    /**
     * sys_authorities
     */
    int insertSelective(SysAuthoritiesDo record);

    /**
     * sys_authorities
     */
    List<SysAuthoritiesDo> selectByQuery(SysAuthoritiesQuery example);

    /**
     * sys_authorities
     */
    SysAuthoritiesDo selectByPrimaryKey(String authorityId);

    /**
     * sys_authorities
     */
    int updateByQuerySelective(@Param("record") SysAuthoritiesDo record, @Param("example") SysAuthoritiesQuery example);

    /**
     * sys_authorities
     */
    int updateByQuery(@Param("record") SysAuthoritiesDo record, @Param("example") SysAuthoritiesQuery example);

    /**
     * sys_authorities
     */
    int updateByPrimaryKeySelective(SysAuthoritiesDo record);

    /**
     * sys_authorities
     */
    int updateByPrimaryKey(SysAuthoritiesDo record);
}