<%--
  Created by IntelliJ IDEA.
  User: 庹庹庹庹庹庹明炜
  Date: 2020/11/13
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>

<html>
<head><title>登录页面</title></head>
<body>
<form action="login.do" method="get">
    <table>
        <tr><td>用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr><td>密&nbsp;&nbsp;码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr><td><input type="submit" value="登录"/></td>
            <td><input type="reset" value="取消"/></td>
        </tr>
    </table>
</form>
</body>
</html>



