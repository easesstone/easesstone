<html>
<body>
<h2>Hello World!</h2>


<form action="helloworld/testPOJO" method="post">
    username:<input type="text" name="username">
    userAge:<input type="text" name="userAge">
    dogName:<input type="text" name="dog.dogName">
    dogAge<input type="text" name="dog.dogAge">
    <input type="submit" value="test Pojo">
</form>


<a href="helloworld/requestParam?username=nihaoma&age=10">hello world</a>
<br>
<%--
    Spring mvc 的简单例子
--%>
<a href="helloworld/helloworld.do">test RequestParm</a>
<br />

<%--
    为了测试params 和headers 着两个参数
--%>
<a href="helloworld/testParamsAndHeads.do?username=nimaenha&age=11">testParamsAndHeads</a>
<br />

<%--为了测试method 这个属性值，--%>
<form action="helloworld/testMethod.do" method="post">
    <input type="text" name="usename" value="PUT">
    <input type="text" name="age" value="11">
    <input type="submit" value="submit">
</form>



<%--
    以下对应的是REST 风格的增删改查，分别对应着，POST，DELETE，PUT，GET
--%>
<%--增加--%>
<form action="helloworld/testRest" method="post">
    <input type="submit" value="test Rest">
</form>


<%--删除--%>
<form action="helloworld/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="test Rest">
</form>


<%--修改--%>
<form action="helloworld/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="test Rest">
</form>


<%--查询--%>
<a href="helloworld/testRest/1">Test Get</a>
<br />

</body>
</html>
