## Sparing MVC 工程简介和知识点：  
### springmvc helloworld 入门配置  
#### 1，创建一个maven的web 工程  
file--> new --> project-->create from archtype -->
  org.apache.maven.archtypes:maven-archtype-webapp  
#### 2，配置pom 文件  
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>${spring.version}</version>
</dependency>
```
此处${spring.version} 为4.3.5.RELEASE，具体设置，参见maven 的官方文档和说明  
#### 3，配置web.xml,设置DispatcherServlet  
```xml
<servlet>
    <servlet-name>dispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
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
#### 4,配置 Handler，相当于一个Controller  
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

#### 5,配置视图解析器，自动扫描的包。
主要有自动扫描的包，以及视图解析器。
```xml
<context:component-scan base-package="com.sydney.dream" />
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" >
    <property name="prefix" value="/WEB-INF/views/"></property>
    <property name="suffix"  value=".jsp" ></property>
</bean>
```

#### 6,配置相应的界面。
在WEB-INF 下面建立一个views 目录，建立一个success.jsp 文件。  
OK，done now。

