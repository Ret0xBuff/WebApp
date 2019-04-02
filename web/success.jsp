<%--
  Created by IntelliJ IDEA.
  User: Tang
  Date: 2019/4/2
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>消息</title>
</head>
<body>
    ${xiaoxi}<br>
    <a href="SearchallServlet">查看所有用户</a>
</body>
</html>
