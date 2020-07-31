<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/13 0013
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>第一个HTML页面</title>
</head>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
自定义表单验证:
<!--<form name="f" action="/login" method="post">-->
<form name="f" action="/andy/login" method="post">
    <br/>
    用户名:
    <input type="text" name="userName" placeholder="name"><br/>
    密码:
    <input type="password" name="password" placeholder="password"><br/>
    <input name="submit" type="submit" value="提交">
</form>
</body>
</html>