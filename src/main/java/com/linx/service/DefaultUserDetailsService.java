package com.linx.service;

import com.linx.entity.SysUsersEntity;
import com.linx.model.SysAuthoritiesDo;
import com.linx.model.SysUsersDo;
import com.linx.model.SysUsersQuery;
import com.linx.persistence.SysAuthoritiesDao;
import com.linx.persistence.SysUsersDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by linx on 2016/10/17.
 */
public class DefaultUserDetailsService implements UserDetailsService {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    SysUsersDao sysUsersDao;
    @Autowired
    SysAuthoritiesDao sysAuthoritiesDao;
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        SysUsersQuery sysUsersQuery = new SysUsersQuery();
        sysUsersQuery.createCriteria().andUsernameEqualTo(username);
        List<SysUsersDo> users = sysUsersDao.selectByQuery(sysUsersQuery);
        SysUsersDo user = users.get(0);
        List<String> list = sysAuthoritiesDao.getSysAuthoritiesByUserId(user.getUserId());

        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        for (String authority : list) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority);
            auths.add(grantedAuthority);
        }
        SysUsersEntity usersEntity = new SysUsersEntity();
        BeanUtils.copyProperties(user,usersEntity);
        usersEntity.setAuthorities(auths);
        logger.info("***********"+username+"*************");
        logger.info(usersEntity.getAuthorities());
        logger.info("****************************");
        return usersEntity;
    }

}
