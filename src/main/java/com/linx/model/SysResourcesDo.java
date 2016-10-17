package com.linx.model;

import java.io.Serializable;

/**
 * sys_resources
 */
public class SysResourcesDo implements Serializable {
    /**
     * sys_resources.RESOURCE_ID
     */
    private String resourceId;

    /**
     * sys_resources.RESOURCE_TYPE
     */
    private String resourceType;

    /**
     * sys_resources.RESOURCE_NAME
     */
    private String resourceName;

    /**
     * sys_resources.RESOURCE_DESC
     */
    private String resourceDesc;

    /**
     * sys_resources.RESOURCE_PATH
     */
    private String resourcePath;

    /**
     * sys_resources.PRIORITY
     */
    private String priority;

    /**
     * sys_resources.ENABLE
     */
    private Integer enable;

    /**
     * sys_resources.ISSYS
     */
    private Integer issys;

    /**
     * sys_resources.MODULE_ID
     */
    private String moduleId;

    /**
     * sys_resources
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_resources.RESOURCE_ID
     * @return the value of sys_resources.RESOURCE_ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * sys_resources.RESOURCE_ID
     * @param resourceId the value for sys_resources.RESOURCE_ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * sys_resources.RESOURCE_TYPE
     * @return the value of sys_resources.RESOURCE_TYPE
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * sys_resources.RESOURCE_TYPE
     * @param resourceType the value for sys_resources.RESOURCE_TYPE
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * sys_resources.RESOURCE_NAME
     * @return the value of sys_resources.RESOURCE_NAME
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * sys_resources.RESOURCE_NAME
     * @param resourceName the value for sys_resources.RESOURCE_NAME
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * sys_resources.RESOURCE_DESC
     * @return the value of sys_resources.RESOURCE_DESC
     */
    public String getResourceDesc() {
        return resourceDesc;
    }

    /**
     * sys_resources.RESOURCE_DESC
     * @param resourceDesc the value for sys_resources.RESOURCE_DESC
     */
    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc == null ? null : resourceDesc.trim();
    }

    /**
     * sys_resources.RESOURCE_PATH
     * @return the value of sys_resources.RESOURCE_PATH
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * sys_resources.RESOURCE_PATH
     * @param resourcePath the value for sys_resources.RESOURCE_PATH
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath == null ? null : resourcePath.trim();
    }

    /**
     * sys_resources.PRIORITY
     * @return the value of sys_resources.PRIORITY
     */
    public String getPriority() {
        return priority;
    }

    /**
     * sys_resources.PRIORITY
     * @param priority the value for sys_resources.PRIORITY
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /**
     * sys_resources.ENABLE
     * @return the value of sys_resources.ENABLE
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * sys_resources.ENABLE
     * @param enable the value for sys_resources.ENABLE
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * sys_resources.ISSYS
     * @return the value of sys_resources.ISSYS
     */
    public Integer getIssys() {
        return issys;
    }

    /**
     * sys_resources.ISSYS
     * @param issys the value for sys_resources.ISSYS
     */
    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    /**
     * sys_resources.MODULE_ID
     * @return the value of sys_resources.MODULE_ID
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * sys_resources.MODULE_ID
     * @param moduleId the value for sys_resources.MODULE_ID
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    /**
     * sys_resources
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
        SysResourcesDo other = (SysResourcesDo) that;
        return (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getResourceName() == null ? other.getResourceName() == null : this.getResourceName().equals(other.getResourceName()))
            && (this.getResourceDesc() == null ? other.getResourceDesc() == null : this.getResourceDesc().equals(other.getResourceDesc()))
            && (this.getResourcePath() == null ? other.getResourcePath() == null : this.getResourcePath().equals(other.getResourcePath()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getIssys() == null ? other.getIssys() == null : this.getIssys().equals(other.getIssys()))
            && (this.getModuleId() == null ? other.getModuleId() == null : this.getModuleId().equals(other.getModuleId()));
    }

    /**
     * sys_resources
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        result = prime * result + ((getResourceDesc() == null) ? 0 : getResourceDesc().hashCode());
        result = prime * result + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getIssys() == null) ? 0 : getIssys().hashCode());
        result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
        return result;
    }
}