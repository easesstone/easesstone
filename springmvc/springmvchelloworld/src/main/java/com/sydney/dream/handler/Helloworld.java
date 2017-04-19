package com.sydney.dream.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    /**
     * @RequestMapping 可以映射请求参数，请求方法，请求头，URL 信息等，
     * 从而可以更加精确地确认请求的信息。
     * value 对应的是url 信息，相对的url
     * mothod 字段表示映射请求方法，请求方法必须是POST 方式。
     * params
     * @return
     */
//    @RequestMapping(value = "/testMethod.do", method = RequestMethod.POST,
//            params = {"username", "age != 10"})
    @RequestMapping(value = "/testMethod.do", method = RequestMethod.POST)
    public String testMethod()
    {
        System.out.println("hello,world");
        return "method";
    }

    /**
     * params 和 headers 的用处不多，只需要了解即可
     * @return
     */
    @RequestMapping(value = "/testParamsAndHeads.do", params = {"username", "age != 10"},
            headers = {"Accept-Language=zh-CN,zh;q=0.8"})
    public String testParamsAndHeads()
    {
        System.out.println("test Params and Heads");
        return "testParamsAndHeads";
    }

    /**
     * RequestMapping 支持正则表达式的风格。
     * ？表示匹配一个字符，
     * * 表示任意字符
     * ** 表示多层路径
     * @return
     */
    @RequestMapping(value = "/testzhengze*")
    public String testZhengze()
    {
        System.out.println("hello,ant");
        return "zhengze";
    }

    /**
     * 例如请求是
     * http://localhost:8080/springmvchelloworld%20Maven%20Webapp/
     * helloworld/testPathVariable/1
     * 则传进来的id则是 1，如下
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id)
    {
        System.out.println("id is " + id);
        return "success";
    }

    /// 以下是测试REST 风格的URL,
    /**
     * Rest 风格的 URL. 以 CRUD 为例:
     * 新增: /order POST
     * 修改: /order/1 PUT update?id=1
     * 获取: /order/1 GET get?id=1
     * 删除: /order/1 DELETE delete?id=1
     * 如何发送 PUT 请求和 DELETE 请求呢 ?
     * 1. 需要配置 HiddenHttpMethodFilter
     * 2. 需要发送 POST 请求
     * 3. 需要在发送 POST 请求时携带一个 name="_method" 的隐藏域,
     * 值为 DELETE 或 PUT
     * 在 SpringMVC 的目标方法中如何得到 id 呢? 使用 @PathVariable 注解
     *
     */
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRESTGET(@PathVariable Integer id)
    {
        System.out.println("helloworld, Rest Get" + id);
        return "success";
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRESTPOST()
    {
        System.out.println("helloworld, Rest Get");
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRESDelete(@PathVariable Integer id)
    {
        System.out.println("helloworld, Rest Get");
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRESPut(@PathVariable Integer id)
    {
        System.out.println("helloworld, Rest Get");
        return "success";
    }



    /**
     * RequestHeader
     * 获取请求头的信息
     */
    @RequestMapping("/testRequestHeadeer")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language")
                                                String acceptLanguage)
    {
        System.out.println("success , RequestHeader");
        return "success";
    }

    /**
     * CookieValue
     * 获取请求头的信息
     */
    @RequestMapping("/testRequestHeadeer")
    public String testCokieValue(@CookieValue("username") String username)
    {
        System.out.println("success , username" + username);
        return "success";
    }


    /**
     * Sparing MVC 中获取请求参数。
     * 1，@RequestParam,其中有一个属性required 默认是true, 可以设置成false
     * 还有一个设置默认属性的值 defaultValue,
     *
     * 2,Spring 可以把表单中的值，映射成POJO 对象，支持级联属性。
     */
    @RequestMapping(value = "/requestParam")
    public String testRequestParam(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "age", required = false,
                                           defaultValue = "0") Integer age)
    {
        System.out.println("test Request Params");
        System.out.println(username + " " + age);
        return "success";
    }


    /**
     * 此种情况下，如果user 或者dog 中存在非string 类型的值，如int 类型的，而传过来的却是string 的值，
     * @param user
     * @return
     */
    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user)
    {
        System.out.println(user);
        return "success";
    }

}
