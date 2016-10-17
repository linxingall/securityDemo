package com.linx.model;

import java.io.Serializable;

/**
 * sys_roles_moudles
 */
public class SysRolesMoudlesDo implements Serializable {
    /**
     * sys_roles_moudles.ID
     */
    private String id;

    /**
     * sys_roles_moudles.MODULE_ID
     */
    private String moduleId;

    /**
     * sys_roles_moudles.ROLE_ID
     */
    private String roleId;

    /**
     * sys_roles_moudles
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_roles_moudles.ID
     * @return the value of sys_roles_moudles.ID
     */
    public String getId() {
        return id;
    }

    /**
     * sys_roles_moudles.ID
     * @param id the value for sys_roles_moudles.ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * sys_roles_moudles.MODULE_ID
     * @return the value of sys_roles_moudles.MODULE_ID
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * sys_roles_moudles.MODULE_ID
     * @param moduleId the value for sys_roles_moudles.MODULE_ID
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    /**
     * sys_roles_moudles.ROLE_ID
     * @return the value of sys_roles_moudles.ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * sys_roles_moudles.ROLE_ID
     * @param roleId the value for sys_roles_moudles.ROLE_ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * sys_roles_moudles
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
        SysRolesMoudlesDo other = (SysRolesMoudlesDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getModuleId() == null ? other.getModuleId() == null : this.getModuleId().equals(other.getModuleId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    /**
     * sys_roles_moudles
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }
}