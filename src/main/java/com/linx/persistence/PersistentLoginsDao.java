package com.linx.persistence;

import com.linx.model.PersistentLoginsDo;
import com.linx.model.PersistentLoginsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersistentLoginsDao {
    /**
     * persistent_logins
     */
    int countByQuery(PersistentLoginsQuery example);

    /**
     * persistent_logins
     */
    int deleteByQuery(PersistentLoginsQuery example);

    /**
     * persistent_logins
     */
    int deleteByPrimaryKey(String series);

    /**
     * persistent_logins
     */
    int insert(PersistentLoginsDo record);

    /**
     * persistent_logins
     */
    int insertSelective(PersistentLoginsDo record);

    /**
     * persistent_logins
     */
    List<PersistentLoginsDo> selectByQuery(PersistentLoginsQuery example);

    /**
     * persistent_logins
     */
    PersistentLoginsDo selectByPrimaryKey(String series);

    /**
     * persistent_logins
     */
    int updateByQuerySelective(@Param("record") PersistentLoginsDo record, @Param("example") PersistentLoginsQuery example);

    /**
     * persistent_logins
     */
    int updateByQuery(@Param("record") PersistentLoginsDo record, @Param("example") PersistentLoginsQuery example);

    /**
     * persistent_logins
     */
    int updateByPrimaryKeySelective(PersistentLoginsDo record);

    /**
     * persistent_logins
     */
    int updateByPrimaryKey(PersistentLoginsDo record);
}