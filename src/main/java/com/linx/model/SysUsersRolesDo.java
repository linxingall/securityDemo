package com.linx.model;

import java.io.Serializable;

/**
 * sys_users_roles
 */
public class SysUsersRolesDo implements Serializable {
    /**
     * sys_users_roles.ID
     */
    private String id;

    /**
     * sys_users_roles.ROLE_ID
     */
    private String roleId;

    /**
     * sys_users_roles.USER_ID
     */
    private String userId;

    /**
     * sys_users_roles
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_users_roles.ID
     * @return the value of sys_users_roles.ID
     */
    public String getId() {
        return id;
    }

    /**
     * sys_users_roles.ID
     * @param id the value for sys_users_roles.ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * sys_users_roles.ROLE_ID
     * @return the value of sys_users_roles.ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * sys_users_roles.ROLE_ID
     * @param roleId the value for sys_users_roles.ROLE_ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * sys_users_roles.USER_ID
     * @return the value of sys_users_roles.USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * sys_users_roles.USER_ID
     * @param userId the value for sys_users_roles.USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * sys_users_roles
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
        SysUsersRolesDo other = (SysUsersRolesDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * sys_users_roles
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}