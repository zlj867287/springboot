<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Spring Security Example </title>
</head>
<body>
</div>
<!-- 表单页面可以根据后台初始化数据也可以将数据发送到后台， 自己上网看看form如何提交数据我这个是最基础的还可
以自动封装对象提交的希望你可以自己琢磨遇到困难联系我吧，login/check请留意MyTemplateController中的代码 -->
<form action="login/check" method="post">
    <div><label> 用户名 : <input type="text" name="username" value=${username} /> </label></div>
    <div><label> 密  码 : <input type="password" name="password" value=${password} /> </label></div>
    <div><input type="submit" value="登录"/></div>
</form>
</body>
</html>