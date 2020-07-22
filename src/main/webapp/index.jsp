<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/7/22
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/findAll">测试</a>
<form action="${pageContext.request.contextPath}/user/save" method="post">
    姓名：<input type="text" name="name">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
