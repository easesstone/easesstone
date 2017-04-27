<%--
  Created by IntelliJ IDEA.
  User: Sydney
  Date: 2017/4/19
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
index,welcome,
${user.userId}<br>
${user.userName}<br>
${user.userPassword}<br>
${user.userEmail}<br>
<form action="" method="post">
    今日计划：<br><textarea rows="6" cols="180" name="workContent" ></textarea><br>
    进    展：<br><textarea rows="6" cols="180" name="workStatus"></textarea><br>
    明日计划：<br> <textarea rows="6" cols="180" name="nextPlan"></textarea><br>
    风险和总结：<br><textarea rows="6" cols="180" name="conclusion"></textarea><br>
    <input type="submit" value="submit">
</form>
</body>
</html>