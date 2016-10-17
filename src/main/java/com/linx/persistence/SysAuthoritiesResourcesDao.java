package com.linx.persistence;

import com.linx.model.SysAuthoritiesResourcesDo;
import com.linx.model.SysAuthoritiesResourcesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthoritiesResourcesDao {
    /**
     * sys_authorities_resources
     */
    int countByQuery(SysAuthoritiesResourcesQuery example);

    /**
     * sys_authorities_resources
     */
    int deleteByQuery(SysAuthoritiesResourcesQuery example);

    /**
     * sys_authorities_resources
     */
    int deleteByPrimaryKey(String id);

    /**
     * sys_authorities_resources
     */
    int insert(SysAuthoritiesResourcesDo record);

    /**
     * sys_authorities_resources
     */
    int insertSelective(SysAuthoritiesResourcesDo record);

    /**
     * sys_authorities_resources
     */
    List<SysAuthoritiesResourcesDo> selectByQuery(SysAuthoritiesResourcesQuery example);

    /**
     * sys_authorities_resources
     */
    SysAuthoritiesResourcesDo selectByPrimaryKey(String id);

    /**
     * sys_authorities_resources
     */
    int updateByQuerySelective(@Param("record") SysAuthoritiesResourcesDo record, @Param("example") SysAuthoritiesResourcesQuery example);

    /**
     * sys_authorities_resources
     */
    int updateByQuery(@Param("record") SysAuthoritiesResourcesDo record, @Param("example") SysAuthoritiesResourcesQuery example);

    /**
     * sys_authorities_resources
     */
    int updateByPrimaryKeySelective(SysAuthoritiesResourcesDo record);

    /**
     * sys_authorities_resources
     */
    int updateByPrimaryKey(SysAuthoritiesResourcesDo record);
}