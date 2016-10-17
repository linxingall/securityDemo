package com.linx.model;

import java.io.Serializable;

/**
 * sys_authorities
 */
public class SysAuthoritiesDo implements Serializable {
    /**
     * sys_authorities.AUTHORITY_ID
     */
    private String authorityId;

    /**
     * sys_authorities.AUTHORITY_MARK
     */
    private String authorityMark;

    /**
     * sys_authorities.AUTHORITY_NAME
     */
    private String authorityName;

    /**
     * sys_authorities.AUTHORITY_DESC
     */
    private String authorityDesc;

    /**
     * sys_authorities.MESSAGE
     */
    private String message;

    /**
     * sys_authorities.ENABLE
     */
    private Integer enable;

    /**
     * sys_authorities.ISSYS
     */
    private Integer issys;

    /**
     * sys_authorities.MODULE_ID
     */
    private String moduleId;

    /**
     * sys_authorities
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_authorities.AUTHORITY_ID
     * @return the value of sys_authorities.AUTHORITY_ID
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * sys_authorities.AUTHORITY_ID
     * @param authorityId the value for sys_authorities.AUTHORITY_ID
     */
    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }

    /**
     * sys_authorities.AUTHORITY_MARK
     * @return the value of sys_authorities.AUTHORITY_MARK
     */
    public String getAuthorityMark() {
        return authorityMark;
    }

    /**
     * sys_authorities.AUTHORITY_MARK
     * @param authorityMark the value for sys_authorities.AUTHORITY_MARK
     */
    public void setAuthorityMark(String authorityMark) {
        this.authorityMark = authorityMark == null ? null : authorityMark.trim();
    }

    /**
     * sys_authorities.AUTHORITY_NAME
     * @return the value of sys_authorities.AUTHORITY_NAME
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * sys_authorities.AUTHORITY_NAME
     * @param authorityName the value for sys_authorities.AUTHORITY_NAME
     */
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    /**
     * sys_authorities.AUTHORITY_DESC
     * @return the value of sys_authorities.AUTHORITY_DESC
     */
    public String getAuthorityDesc() {
        return authorityDesc;
    }

    /**
     * sys_authorities.AUTHORITY_DESC
     * @param authorityDesc the value for sys_authorities.AUTHORITY_DESC
     */
    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc == null ? null : authorityDesc.trim();
    }

    /**
     * sys_authorities.MESSAGE
     * @return the value of sys_authorities.MESSAGE
     */
    public String getMessage() {
        return message;
    }

    /**
     * sys_authorities.MESSAGE
     * @param message the value for sys_authorities.MESSAGE
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * sys_authorities.ENABLE
     * @return the value of sys_authorities.ENABLE
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * sys_authorities.ENABLE
     * @param enable the value for sys_authorities.ENABLE
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * sys_authorities.ISSYS
     * @return the value of sys_authorities.ISSYS
     */
    public Integer getIssys() {
        return issys;
    }

    /**
     * sys_authorities.ISSYS
     * @param issys the value for sys_authorities.ISSYS
     */
    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    /**
     * sys_authorities.MODULE_ID
     * @return the value of sys_authorities.MODULE_ID
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * sys_authorities.MODULE_ID
     * @param moduleId the value for sys_authorities.MODULE_ID
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    /**
     * sys_authorities
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysAuthoritiesDo other = (SysAuthoritiesDo) that;
        return (this.getAuthorityId() == null ? other.getAuthorityId() == null : this.getAuthorityId().equals(other.getAuthorityId()))
            && (this.getAuthorityMark() == null ? other.getAuthorityMark() == null : this.getAuthorityMark().equals(other.getAuthorityMark()))
            && (this.getAuthorityName() == null ? other.getAuthorityName() == null : this.getAuthorityName().equals(other.getAuthorityName()))
            && (this.getAuthorityDesc() == null ? other.getAuthorityDesc() == null : this.getAuthorityDesc().equals(other.getAuthorityDesc()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getIssys() == null ? other.getIssys() == null : this.getIssys().equals(other.getIssys()))
            && (this.getModuleId() == null ? other.getModuleId() == null : this.getModuleId().equals(other.getModuleId()));
    }

    /**
     * sys_authorities
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
        result = prime * result + ((getAuthorityMark() == null) ? 0 : getAuthorityMark().hashCode());
        result = prime * result + ((getAuthorityName() == null) ? 0 : getAuthorityName().hashCode());
        result = prime * result + ((getAuthorityDesc() == null) ? 0 : getAuthorityDesc().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getIssys() == null) ? 0 : getIssys().hashCode());
        result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
        return result;
    }
}