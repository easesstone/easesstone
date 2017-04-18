# Sparing MVC 工程简介和知识点：  
## springmvc helloworld 入门配置  
### 1，创建一个maven的web 工程  
file--> new --> project-->create from archtype -->
  org.apache.maven.archtypes:maven-archtype-webapp  
### 2，配置pom 文件  
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>${spring.version}</version>
</dependency>
```
此处${spring.version} 为4.3.5.RELEASE，具体设置，参见maven 的官方文档和说明  
### 3，配置web.xml,设置DispatcherServlet  
```xml
<servlet>
    <servlet-name>dispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <!--如果没有配置有init-param 则默认找WEB-INF 下面的 dispatcherServlet-servlet.xml -->
    <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:springmvc/application.xml</param-value>
    </init-param>
<servlet>
<!--当前应用被加载的时候，即初始化dispatchServlet 的时候就进行创建-->
<servlet-mapping>
    <servlet-name>dispatcherServlet</servlet-name>
    <url-pattern>/</url-pattern>
</servlet-mapping>
```
### 4,配置 Handler，相当于一个Controller  
```java
package com.sydney.dream.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sydney on 2017/4/12.
 */
@Controller
@RequestMapping("/helloworld")
public class Helloworld
{
    /**
     * 使用@RequestMapping 处理请求的URL
     * 既可以修饰方法，也可以修饰类
     * 在类定义出的RequestMapping 是相对于根路径的，
     * 在方法定义处的RequestMapping 是相对于类路径的。
     * @return
     */
    @RequestMapping("/helloworld.do")
    public String helloworld()
    {
        System.out.println("hello,world");
        return "success";
    }
}

```

### 5,配置视图解析器，自动扫描的包。
主要有自动扫描的包，以及视图解析器。
```xml
<context:component-scan base-package="com.sydney.dream" />
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" >
    <property name="prefix" value="/WEB-INF/views/"></property>
    <property name="suffix"  value=".jsp" ></property>
</bean>
```

### 6,配置相应的界面。
在WEB-INF 下面建立一个views 目录，建立一个success.jsp 文件。  
OK，done now。  

## @RequestMapping
### 1，@RequestMapping 通用作用
处理请求的URL，通常作为匹配URL 地址。可以修饰类，也可以修饰方法：  
```java
@Controller
@RequestMapping("/helloworld") ///默认属性，所以可以不加value
public class Helloworld
{
    @RequestMapping("/helloworld.do")
    public String helloworld()
    {
        System.out.println("hello,world");
        return "success";
    }
}
```
### 2，设置请求的方式。 
```java
@Controller
@RequestMapping(value="/helloworld",)
public class Helloworld
{
    //使用method属性指定请求的参数。
    @RequestMapping("/helloworld.do",method=RequestMethod.POST) 
    public String helloworld()
    {
        System.out.println("hello,world");
        return "success";
    }
}
```

### 3，参数设置和header 的规定
```java 
@Controller
@RequestMapping(value="/helloworld",)
public class Helloworld
{
    // 无论是params，还是headers，都可以包含多个参数，以逗号相隔就行，
    //如果不满足写了的条件，则就会报错，不允许请求资源。其次这两个属性还支持一些简单的表达式：\
    //user  表示请求中，必须包含user的参数
    //!user 表示请求中，不能包含user的参数
    //user!=admin    表示请示中，user参数不能为admin
    //user,age=10    表示请求中必须包含user,age这两个参数，而且age要等于10
    @RequestMapping("/helloworld.do",method=RequestMethod.POST,
    params={"username","age!=10"},headers={"Accept-Language=zh-CN,zh;q=0.8"}) 
    
    public String helloworld()
    {
        System.out.println("hello,world");
        return "success";
    }
}
```

### 4,@RequestMapping 中的通配符
```
通配符
?        匹配url中的任意一个字符
*        匹配url中的任意多个字符
**       匹配url中的多层路径
例如：
/user/*/createUser    匹配/user/abcd/createUser
/user/**/createUser   匹配/user/aa/bb/cc/createUser
/user/?/createUser    匹配/user/a/createUser
```

### 5,@PathVariable 配合  @RequestMapping 一起使用
```java
@Controller
@RequestMapping(value="/helloworld",)
public class Helloworld
{
    //URL使用占位符传递参数，
    //通过@PathVariable 来获取URL 中的参数，即占位符的值。
    @RequestMapping("/helloworld.do/{id}") 
    public String helloworld(@PathVariable("id") Integer id)
    {
        System.out.println("hello,world");
        return "success";
    }
}
```

### 6,REST 风格的URL
Spring MVC 支持把post 请求方式的URL 映射为PUT,DELETE,POST 这三种范式，而get 的请求方式，映射为Sparing MVC 中的GET 请求。  
要实现这个方式的内容:  
首先，需要把web.xml 中加一个filter，如下：  
```xml
<!-- 配置org.springframework.web.filter.HiddenHttpMethodFilter，可以把post请求转为delete或put请求 -->
<filter>
    <filter-name>HiddenHttpMethodFilter</filter-name>
    <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
</filter>
<filter-mapping>
    <filter-name>HiddenHttpMethodFilter</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```

可以看到HiddenHttpMethodFiter 的主要代码如下： 
```java
protected void doFilterInternal(HttpServletRequest request,
            HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String paramValue = request.getParameter(this.methodParam);//this.methodParam是一个final常量，为_method
        if (("POST".equals(request.getMethod()))  
                && (StringUtils.hasLength(paramValue))) {
            String method = paramValue.toUpperCase(Locale.ENGLISH);
            HttpServletRequest wrapper = new HttpMethodRequestWrapper(request,
                    method);
            filterChain.doFilter(wrapper, response);
        } else {
            filterChain.doFilter(request, response);
        }
    }
```
```
当这个过滤器拦截到一个请求时，就会先拿到这个请求的参数,它要满足两个条件，
第一，浏览器发出的请求为post请示，
第二，它还要有一个参数，参数名为 _method，而它的值，则可以为get,post,delete,put，
此时过滤器就会把post请求转换成相应的请求，不然的话就不进行转换，直接请求。  
至于添加_method参数的话，则可以使用hidden隐藏域，或者使用?拼接参数都可以。
```

如下是一个简单的例子：
```java
@RequestMapping(value="/testRest/{id}",method=RequestMethod.DELETE)
    public String testRestDelete(@PathVariable("id") Integer id){
        System.out.println("test DELETE:"+id);
        return "spring";
    }
    @RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
    public String testRestPut(@PathVariable("id") Integer id){
        System.out.println("test put:"+id);
        return "spring";
    }
```




