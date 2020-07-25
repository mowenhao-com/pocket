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
<html>
<head>
    <meta charset="utf-8">
    <title>小刀登录</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<link type="text/css" rel="styleSheet"  href="../css/login.css" />
<script src="../js/login.js"></script>
<body>



<ul>
    <li id="phone"><input type="button" value="手机验证码登录   " class="loginButt" /></li>
    <li id="userName"><input type="button" value="账号密码登录" class="loginButt"/></li>
    <li id="register"><input type="button" value="注册" class="loginButt"/></li>
</ul>
<!--账号密码登录 -->
<div class="div1">
    <form>
        <h3 style="font-size: 20px; text-align:center; font-style:italic;">pocket&nbsp;knife</h3>
        <label>账号：</label><input type="text"  name="userName" class="inputClass"/>
        <br />
        <label>密码：</label><input type="password"  name="password" class="inputClass"/>
        <br />
        <input type="button" value="登录" class="submit" id="UserNameLogin"/>
    </form>
</div>
<!--手机号登录 -->
<div class="div2">
    <form>
        <h3 style="font-size: 20px; text-align:center; font-style:italic;">pocket&nbsp;knife</h3>
        <label>手机号：</label><input type="text"  name="phone" class="inputClass"/>
        <br />
        <label>验证码：&nbsp;  </label><input type="text"  name="password" class="duanxininp"/>
        <input type="button" value="获取验证码" id="getdx" style="outline:none;width: 90px;height: 30px;position: absolute;top: 55%;left: 60%; 	border-radius: 25px;background-color: #eee8fa;border:none;margin margin-top: 2px;"/>
        <br />
        <input type="button" value="登录" class="submit"/>
    </form>
</div>
<!--注册 -->
<div class="div3">
    <form>
        <h3 style="font-size: 20px; text-align:center; font-style:italic;">pocket&nbsp;knife</h3>
        <label>手机号：&nbsp;&nbsp;  </label><input type="text"  name="phone" class="inputClass"/>
        <br />
        <label>登录密码：</label><input type="text"  name="password" class="inputClass"/>
        <br />
        <label>确认密码：</label><input type="text"  name="password" class="inputClass"/>
        <br />
        <label>验证码：&nbsp; &nbsp; &nbsp; </label><input type="text"  name="password" class="duanxininp"/>
        <input type="button" value="获取验证码" class="duanxin" id="getdx"/>
        <br />
        <input value="注册" class="submit" type="button"/>
    </form>
</div>
</body>
</html>
