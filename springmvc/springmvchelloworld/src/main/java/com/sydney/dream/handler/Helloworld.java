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
