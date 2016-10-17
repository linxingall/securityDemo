<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<form action="login.do" method="post">
    用户名：<input type="text" name="j_username" />
    密码：<input type="password" name="j_password" />
    <button type="submit">登录</button>
</form>
${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}
