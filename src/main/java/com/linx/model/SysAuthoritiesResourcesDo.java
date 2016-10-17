package com.linx.model;

import java.io.Serializable;

/**
 * sys_authorities_resources
 */
public class SysAuthoritiesResourcesDo implements Serializable {
    /**
     * sys_authorities_resources.ID
     */
    private String id;

    /**
     * sys_authorities_resources.RESOURCE_ID
     */
    private String resourceId;

    /**
     * sys_authorities_resources.AUTHORITY_ID
     */
    private String authorityId;

    /**
     * sys_authorities_resources
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_authorities_resources.ID
     * @return the value of sys_authorities_resources.ID
     */
    public String getId() {
        return id;
    }

    /**
     * sys_authorities_resources.ID
     * @param id the value for sys_authorities_resources.ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * sys_authorities_resources.RESOURCE_ID
     * @return the value of sys_authorities_resources.RESOURCE_ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * sys_authorities_resources.RESOURCE_ID
     * @param resourceId the value for sys_authorities_resources.RESOURCE_ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * sys_authorities_resources.AUTHORITY_ID
     * @return the value of sys_authorities_resources.AUTHORITY_ID
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * sys_authorities_resources.AUTHORITY_ID
     * @param authorityId the value for sys_authorities_resources.AUTHORITY_ID
     */
    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }

    /**
     * sys_authorities_resources
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
        SysAuthoritiesResourcesDo other = (SysAuthoritiesResourcesDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()))
            && (this.getAuthorityId() == null ? other.getAuthorityId() == null : this.getAuthorityId().equals(other.getAuthorityId()));
    }

    /**
     * sys_authorities_resources
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
        return result;
    }
}