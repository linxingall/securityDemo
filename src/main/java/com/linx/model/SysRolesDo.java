package com.linx.model;

import java.io.Serializable;

/**
 * sys_roles
 */
public class SysRolesDo implements Serializable {
    /**
     * sys_roles.ROLE_ID
     */
    private String roleId;

    /**
     * sys_roles.ROLE_NAME
     */
    private String roleName;

    /**
     * sys_roles.ROLE_DESC
     */
    private String roleDesc;

    /**
     * sys_roles.ENABLE
     */
    private Integer enable;

    /**
     * sys_roles.ISSYS
     */
    private Integer issys;

    /**
     * sys_roles.MODULE_ID
     */
    private String moduleId;

    /**
     * sys_roles
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_roles.ROLE_ID
     * @return the value of sys_roles.ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * sys_roles.ROLE_ID
     * @param roleId the value for sys_roles.ROLE_ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * sys_roles.ROLE_NAME
     * @return the value of sys_roles.ROLE_NAME
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * sys_roles.ROLE_NAME
     * @param roleName the value for sys_roles.ROLE_NAME
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * sys_roles.ROLE_DESC
     * @return the value of sys_roles.ROLE_DESC
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * sys_roles.ROLE_DESC
     * @param roleDesc the value for sys_roles.ROLE_DESC
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * sys_roles.ENABLE
     * @return the value of sys_roles.ENABLE
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * sys_roles.ENABLE
     * @param enable the value for sys_roles.ENABLE
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * sys_roles.ISSYS
     * @return the value of sys_roles.ISSYS
     */
    public Integer getIssys() {
        return issys;
    }

    /**
     * sys_roles.ISSYS
     * @param issys the value for sys_roles.ISSYS
     */
    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    /**
     * sys_roles.MODULE_ID
     * @return the value of sys_roles.MODULE_ID
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * sys_roles.MODULE_ID
     * @param moduleId the value for sys_roles.MODULE_ID
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    /**
     * sys_roles
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
        SysRolesDo other = (SysRolesDo) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleDesc() == null ? other.getRoleDesc() == null : this.getRoleDesc().equals(other.getRoleDesc()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getIssys() == null ? other.getIssys() == null : this.getIssys().equals(other.getIssys()))
            && (this.getModuleId() == null ? other.getModuleId() == null : this.getModuleId().equals(other.getModuleId()));
    }

    /**
     * sys_roles
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleDesc() == null) ? 0 : getRoleDesc().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getIssys() == null) ? 0 : getIssys().hashCode());
        result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
        return result;
    }
}