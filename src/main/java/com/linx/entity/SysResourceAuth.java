package com.linx.entity;

/**
 * Created by linx on 2016/10/17.
 */
public class SysResourceAuth {
    private String resourcePath;
    private String authorityMark;

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getAuthorityMark() {
        return authorityMark;
    }

    public void setAuthorityMark(String authorityMark) {
        this.authorityMark = authorityMark;
    }
}
