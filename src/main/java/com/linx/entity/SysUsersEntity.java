package com.linx.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * sys_users
 */
public class SysUsersEntity implements UserDetails, Serializable {
    /**
     * sys_users.USER_ID
     */
    private String userId;

    /**
     * sys_users.USERNAME
     */
    private String username;

    /**
     * sys_users.NAME
     */
    private String name;

    /**
     * sys_users.PASSWORD
     */
    private String password;

    /**
     * sys_users.DT_CREATE
     */
    private Date dtCreate;

    /**
     * sys_users.LAST_LOGIN
     */
    private Date lastLogin;

    /**
     * sys_users.DEADLINE
     */
    private Date deadline;

    /**
     * sys_users.LOGIN_IP
     */
    private String loginIp;

    /**
     * sys_users.V_QZJGID
     */
    private String vQzjgid;

    /**
     * sys_users.V_QZJGMC
     */
    private String vQzjgmc;

    /**
     * sys_users.DEP_ID
     */
    private String depId;

    /**
     * sys_users.DEP_NAME
     */
    private String depName;

    /**
     * sys_users.ENABLED
     */
    private Integer enabled;

    /**
     * sys_users.ACCOUNT_NON_EXPIRED
     */
    private Integer accountNonExpired;

    /**
     * sys_users.ACCOUNT_NON_LOCKED
     */
    private Integer accountNonLocked;

    /**
     * sys_users.CREDENTIALS_NON_EXPIRED
     */
    private Integer credentialsNonExpired;

    private Collection<GrantedAuthority> authorities;

    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked==1?true:false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * sys_users
     */
    private static final long serialVersionUID = 1L;

    /**
     * sys_users.USER_ID
     * @return the value of sys_users.USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * sys_users.USER_ID
     * @param userId the value for sys_users.USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * sys_users.USERNAME
     * @return the value of sys_users.USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * sys_users.USERNAME
     * @param username the value for sys_users.USERNAME
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * sys_users.NAME
     * @return the value of sys_users.NAME
     */
    public String getName() {
        return name;
    }

    /**
     * sys_users.NAME
     * @param name the value for sys_users.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * sys_users.PASSWORD
     * @return the value of sys_users.PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * sys_users.PASSWORD
     * @param password the value for sys_users.PASSWORD
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * sys_users.DT_CREATE
     * @return the value of sys_users.DT_CREATE
     */
    public Date getDtCreate() {
        return dtCreate;
    }

    /**
     * sys_users.DT_CREATE
     * @param dtCreate the value for sys_users.DT_CREATE
     */
    public void setDtCreate(Date dtCreate) {
        this.dtCreate = dtCreate;
    }

    /**
     * sys_users.LAST_LOGIN
     * @return the value of sys_users.LAST_LOGIN
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * sys_users.LAST_LOGIN
     * @param lastLogin the value for sys_users.LAST_LOGIN
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * sys_users.DEADLINE
     * @return the value of sys_users.DEADLINE
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * sys_users.DEADLINE
     * @param deadline the value for sys_users.DEADLINE
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * sys_users.LOGIN_IP
     * @return the value of sys_users.LOGIN_IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * sys_users.LOGIN_IP
     * @param loginIp the value for sys_users.LOGIN_IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * sys_users.V_QZJGID
     * @return the value of sys_users.V_QZJGID
     */
    public String getvQzjgid() {
        return vQzjgid;
    }

    /**
     * sys_users.V_QZJGID
     * @param vQzjgid the value for sys_users.V_QZJGID
     */
    public void setvQzjgid(String vQzjgid) {
        this.vQzjgid = vQzjgid == null ? null : vQzjgid.trim();
    }

    /**
     * sys_users.V_QZJGMC
     * @return the value of sys_users.V_QZJGMC
     */
    public String getvQzjgmc() {
        return vQzjgmc;
    }

    /**
     * sys_users.V_QZJGMC
     * @param vQzjgmc the value for sys_users.V_QZJGMC
     */
    public void setvQzjgmc(String vQzjgmc) {
        this.vQzjgmc = vQzjgmc == null ? null : vQzjgmc.trim();
    }

    /**
     * sys_users.DEP_ID
     * @return the value of sys_users.DEP_ID
     */
    public String getDepId() {
        return depId;
    }

    /**
     * sys_users.DEP_ID
     * @param depId the value for sys_users.DEP_ID
     */
    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
    }

    /**
     * sys_users.DEP_NAME
     * @return the value of sys_users.DEP_NAME
     */
    public String getDepName() {
        return depName;
    }

    /**
     * sys_users.DEP_NAME
     * @param depName the value for sys_users.DEP_NAME
     */
    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    /**
     * sys_users.ENABLED
     * @return the value of sys_users.ENABLED
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * sys_users.ENABLED
     * @param enabled the value for sys_users.ENABLED
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * sys_users.ACCOUNT_NON_EXPIRED
     * @return the value of sys_users.ACCOUNT_NON_EXPIRED
     */
    public Integer getAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * sys_users.ACCOUNT_NON_EXPIRED
     * @param accountNonExpired the value for sys_users.ACCOUNT_NON_EXPIRED
     */
    public void setAccountNonExpired(Integer accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    /**
     * sys_users.ACCOUNT_NON_LOCKED
     * @return the value of sys_users.ACCOUNT_NON_LOCKED
     */
    public Integer getAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * sys_users.ACCOUNT_NON_LOCKED
     * @param accountNonLocked the value for sys_users.ACCOUNT_NON_LOCKED
     */
    public void setAccountNonLocked(Integer accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    /**
     * sys_users.CREDENTIALS_NON_EXPIRED
     * @return the value of sys_users.CREDENTIALS_NON_EXPIRED
     */
    public Integer getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * sys_users.CREDENTIALS_NON_EXPIRED
     * @param credentialsNonExpired the value for sys_users.CREDENTIALS_NON_EXPIRED
     */
    public void setCredentialsNonExpired(Integer credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    /**
     * sys_users
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
        SysUsersEntity other = (SysUsersEntity) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getDtCreate() == null ? other.getDtCreate() == null : this.getDtCreate().equals(other.getDtCreate()))
            && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getvQzjgid() == null ? other.getvQzjgid() == null : this.getvQzjgid().equals(other.getvQzjgid()))
            && (this.getvQzjgmc() == null ? other.getvQzjgmc() == null : this.getvQzjgmc().equals(other.getvQzjgmc()))
            && (this.getDepId() == null ? other.getDepId() == null : this.getDepId().equals(other.getDepId()))
            && (this.getDepName() == null ? other.getDepName() == null : this.getDepName().equals(other.getDepName()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getAccountNonExpired() == null ? other.getAccountNonExpired() == null : this.getAccountNonExpired().equals(other.getAccountNonExpired()))
            && (this.getAccountNonLocked() == null ? other.getAccountNonLocked() == null : this.getAccountNonLocked().equals(other.getAccountNonLocked()))
            && (this.getCredentialsNonExpired() == null ? other.getCredentialsNonExpired() == null : this.getCredentialsNonExpired().equals(other.getCredentialsNonExpired()));
    }

    /**
     * sys_users
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getDtCreate() == null) ? 0 : getDtCreate().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getvQzjgid() == null) ? 0 : getvQzjgid().hashCode());
        result = prime * result + ((getvQzjgmc() == null) ? 0 : getvQzjgmc().hashCode());
        result = prime * result + ((getDepId() == null) ? 0 : getDepId().hashCode());
        result = prime * result + ((getDepName() == null) ? 0 : getDepName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getAccountNonExpired() == null) ? 0 : getAccountNonExpired().hashCode());
        result = prime * result + ((getAccountNonLocked() == null) ? 0 : getAccountNonLocked().hashCode());
        result = prime * result + ((getCredentialsNonExpired() == null) ? 0 : getCredentialsNonExpired().hashCode());
        return result;
    }
}