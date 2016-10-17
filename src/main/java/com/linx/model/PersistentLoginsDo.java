package com.linx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * persistent_logins
 */
public class PersistentLoginsDo implements Serializable {
    /**
     * persistent_logins.SERIES
     */
    private String series;

    /**
     * persistent_logins.USERNAME
     */
    private String username;

    /**
     * persistent_logins.TOKEN
     */
    private String token;

    /**
     * persistent_logins.LAST_USED
     */
    private Date lastUsed;

    /**
     * persistent_logins
     */
    private static final long serialVersionUID = 1L;

    /**
     * persistent_logins.SERIES
     * @return the value of persistent_logins.SERIES
     */
    public String getSeries() {
        return series;
    }

    /**
     * persistent_logins.SERIES
     * @param series the value for persistent_logins.SERIES
     */
    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    /**
     * persistent_logins.USERNAME
     * @return the value of persistent_logins.USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * persistent_logins.USERNAME
     * @param username the value for persistent_logins.USERNAME
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * persistent_logins.TOKEN
     * @return the value of persistent_logins.TOKEN
     */
    public String getToken() {
        return token;
    }

    /**
     * persistent_logins.TOKEN
     * @param token the value for persistent_logins.TOKEN
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * persistent_logins.LAST_USED
     * @return the value of persistent_logins.LAST_USED
     */
    public Date getLastUsed() {
        return lastUsed;
    }

    /**
     * persistent_logins.LAST_USED
     * @param lastUsed the value for persistent_logins.LAST_USED
     */
    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }

    /**
     * persistent_logins
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
        PersistentLoginsDo other = (PersistentLoginsDo) that;
        return (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getLastUsed() == null ? other.getLastUsed() == null : this.getLastUsed().equals(other.getLastUsed()));
    }

    /**
     * persistent_logins
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getLastUsed() == null) ? 0 : getLastUsed().hashCode());
        return result;
    }
}