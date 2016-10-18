package com.linx.persistence;

import com.linx.entity.SysResourceAuth;
import com.linx.model.SysResourcesDo;
import com.linx.model.SysResourcesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourcesDao {
    List<SysResourceAuth> getURLResourceMapping();
    /**
     * sys_resources
     */
    int countByQuery(SysResourcesQuery example);

    /**
     * sys_resources
     */
    int deleteByQuery(SysResourcesQuery example);

    /**
     * sys_resources
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     * sys_resources
     */
    int insert(SysResourcesDo record);

    /**
     * sys_resources
     */
    int insertSelective(SysResourcesDo record);

    /**
     * sys_resources
     */
    List<SysResourcesDo> selectByQuery(SysResourcesQuery example);

    /**
     * sys_resources
     */
    SysResourcesDo selectByPrimaryKey(String resourceId);

    /**
     * sys_resources
     */
    int updateByQuerySelective(@Param("record") SysResourcesDo record, @Param("example") SysResourcesQuery example);

    /**
     * sys_resources
     */
    int updateByQuery(@Param("record") SysResourcesDo record, @Param("example") SysResourcesQuery example);

    /**
     * sys_resources
     */
    int updateByPrimaryKeySelective(SysResourcesDo record);

    /**
     * sys_resources
     */
    int updateByPrimaryKey(SysResourcesDo record);
}