package com.linx.model;

import java.io.Serializable;

/**
 * sys_roles_authorities
 */
public class SysRolesAuthoritiesDo implements Serializable {
    /**
     * sys_roles_authorities.ID
     */
    private String id;

    /**
     * sys_roles_authorities.AUTHORITY_ID
     */
    private String authorityId;

    /**
     * sys_roles_authorities.ROLE_ID
     */
    private String roleId;

    /**
     * sys_roles_authorities
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_roles_authorities.ID
     * @return the value of sys_roles_authorities.ID
     */
    public String getId() {
        return id;
    }

    /**
     * sys_roles_authorities.ID
     * @param id the value for sys_roles_authorities.ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * sys_roles_authorities.AUTHORITY_ID
     * @return the value of sys_roles_authorities.AUTHORITY_ID
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * sys_roles_authorities.AUTHORITY_ID
     * @param authorityId the value for sys_roles_authorities.AUTHORITY_ID
     */
    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }

    /**
     * sys_roles_authorities.ROLE_ID
     * @return the value of sys_roles_authorities.ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * sys_roles_authorities.ROLE_ID
     * @param roleId the value for sys_roles_authorities.ROLE_ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * sys_roles_authorities
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
        SysRolesAuthoritiesDo other = (SysRolesAuthoritiesDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAuthorityId() == null ? other.getAuthorityId() == null : this.getAuthorityId().equals(other.getAuthorityId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    /**
     * sys_roles_authorities
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }
}