package com.sydney.dream.springsimpleapp.test;

import com.sydney.dream.spring.iocModelAndClassConcept.HelloWorldService;
import com.sydney.dream.spring.iocModelAndClassConcept.HelloWorldSpring;
import com.sydney.dream.spring.iocModelAndClassConcept.HelloWorldStrut;
import org.junit.Test;

/**
 * Created by Sydney on 2017/3/31.
 */
public class HelloWorldTest {
    @Test
    public void testHelloWorld(){
        new HelloWorldService(new HelloWorldSpring()).provideHelloWorldService().sayHello();
        new HelloWorldService(new HelloWorldStrut()).provideHelloWorldService().sayHello();
    }
}
