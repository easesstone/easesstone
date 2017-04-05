package com.sydney.dream.spring.iocModelAndClassConcept;

/**
 * Created by Sydney on 2017/3/31.
 */
public class HelloWorldTest {
    public static void main(String []args){
        new HelloWorldService(new HelloWorldSpring()).provideHelloWorldService().sayHello();
        new HelloWorldService(new HelloWorldStrut()).provideHelloWorldService().sayHello();
    }
}
