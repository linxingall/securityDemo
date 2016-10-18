package com.linx.web;

import com.linx.entity.SysResourceAuth;
import com.linx.persistence.SysResourcesDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by linx on 2016/10/17.
 */
public class URLFilterInvocationSecurityMetadataSource implements
        FilterInvocationSecurityMetadataSource,InitializingBean {
    protected final Log logger = LogFactory.getLog(getClass());

    private final static List<ConfigAttribute> NULL_CONFIG_ATTRIBUTE = Collections.emptyList();
    //权限集合
    private Map<RequestMatcher, Collection<ConfigAttribute>> requestMap;

    @Autowired
    private SysResourcesDao sysResourcesDao;

    /* (non-Javadoc)
     * @see org.springframework.security.access.SecurityMetadataSource#getAttributes(java.lang.Object)
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object)
            throws IllegalArgumentException {
        final HttpServletRequest request = ((FilterInvocation) object).getRequest();

        Collection<ConfigAttribute> attrs = NULL_CONFIG_ATTRIBUTE;

        for (Map.Entry<RequestMatcher, Collection<ConfigAttribute>> entry : requestMap.entrySet()) {
            if (entry.getKey().matches(request)) {
                attrs =  entry.getValue();
                break;
            }
        }
        logger.info("URL资源："+request.getRequestURI()+ " -> " + attrs);
        return attrs;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.access.SecurityMetadataSource#getAllConfigAttributes()
     */
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        Set<ConfigAttribute> allAttributes = new HashSet<ConfigAttribute>();

        for (Map.Entry<RequestMatcher, Collection<ConfigAttribute>> entry : requestMap.entrySet()) {
            allAttributes.addAll(entry.getValue());
        }

        return allAttributes;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.access.SecurityMetadataSource#supports(java.lang.Class)
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }

    private Map<String,String> loadResuorce(){
        Map<String,String> map = new LinkedHashMap<String,String>();


//        public List<Map<String,String>> getURLResourceMapping(){
//            String sql = "SELECT S3.RESOURCE_PATH,S2.AUTHORITY_MARK FROM SYS_AUTHORITIES_RESOURCES S1 "+
//                    "JOIN SYS_AUTHORITIES S2 ON S1.AUTHORITY_ID = S2.AUTHORITY_ID "+
//                    "JOIN SYS_RESOURCES S3 ON S1.RESOURCE_ID = S3.RESOURCE_ID S3.RESOURCE_TYPE='URL' ORDER BY S3.PRIORITY DESC";
//
//            List<Map<String,String>> list = new ArrayList<Map<String,String>>();
//
//            Query query = this.entityManager.createNativeQuery(sql);
//            List<Object[]> result = query.getResultList();
//            Iterator<Object[]> it = result.iterator();
//
//            while(it.hasNext()){
//                Object[] o = it.next();
//                Map<String,String> map = new HashMap<String,String>();
//                map.put("resourcePath", (String)o[0]);
//                map.put("authorityMark", (String)o[1]);
//                list.add(map);
//            }
//
//            return list;
//        }
        List<SysResourceAuth> list = sysResourcesDao.getURLResourceMapping();
        for (SysResourceAuth sysResourceAuth : list) {
            if(map.containsKey(sysResourceAuth.getResourcePath())){
                map.put(sysResourceAuth.getResourcePath(), sysResourceAuth.getResourcePath()+","+sysResourceAuth.getAuthorityMark());
            }else{
                map.put(sysResourceAuth.getResourcePath(), sysResourceAuth.getAuthorityMark());
            }
        }
        return map;
    }

    protected Map<RequestMatcher, Collection<ConfigAttribute>> bindRequestMap(){
        Map<RequestMatcher, Collection<ConfigAttribute>> map =
                new LinkedHashMap<RequestMatcher, Collection<ConfigAttribute>>();

        Map<String,String> resMap = this.loadResuorce();
        for(Map.Entry<String,String> entry:resMap.entrySet()){
            String key = entry.getKey();
            Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
            atts = SecurityConfig.createListFromCommaDelimitedString(entry.getValue());
            map.put(new AntPathRequestMatcher(key), atts);
        }

        return map;
    }

    /* (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        this.requestMap = this.bindRequestMap();
        logger.info("资源权限列表"+this.requestMap);
    }

    public void refreshResuorceMap(){
        this.requestMap = this.bindRequestMap();
    }
}
