# 解决GBK 编码问题：
parent 的pom文件中添加如下内容，以及build 目录下的插件如下：
```xml
<properties>
    <!-- 指明编译源代码时使用的字符编码，maven编译的时候默认使用的GBK编码，
    通过project.build.sourceEncoding属性设置字符编码，告诉maven这个项目使用UTF-8来编译 -->
    <!-- 文件拷贝时的编码 -->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
</properties>


<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.5.1</version>
    <configuration>
        <source>1.7</source>
        <target>1.7</target>
        <compilerArgument>-Xlint:all</compilerArgument>
        <showWarnings>true</showWarnings>
        <encoding>utf-8</encoding>
         <showDeprecation>true</showDeprecation>
     </configuration>
</plugin>
```
