# 问题描述：

## 使用Maven创建Web项目，无法识别内置JSP内置对象。
例如：${pageContext.request.contextPath }本应获取Web应用上下文，结果却将普通文本输出。  
如下:  
Hello World！！  
${user}  

## 经查询，得知，Maven创建的web.xml修引入的web2.3的规范,如下：
```xml
<?xml version="1.0" encoding="UTF-8"?>  
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
    xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_3.xsd"  
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_3.xsd"  
    version="2.5">  
</web-app>
```

## 而2.3的规范默认是不解析EL表达式的

## 解决方案：
### 1. 在JSP页面顶部增加 <%@ page isELIgnored="false" %>

### 2. 将web.xml规范修改为2.3之上的版本
示例：  
```xml
<?xml version="1.0" encoding="UTF-8"?>  
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
    xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"  
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"  
    version="2.5">  
</web-app>
```

