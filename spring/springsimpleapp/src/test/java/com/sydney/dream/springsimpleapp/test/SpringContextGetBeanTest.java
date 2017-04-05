package com.sydney.dream.springsimpleapp.test;

import com.sydney.dream.springsimpleapp.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sydney on 2017/4/2.
 */
public class SpringContextGetBeanTest {
    @org.junit.Test
    public void testGetDogBean(){
        //容器初始化的过程，将会用反射的方式，调用类的构造函数来创建类，然后
        //调用类的setter 方法，对类的属性赋值。
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-test.xml");
        /*Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);*/
    }
}
