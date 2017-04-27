package com.sydney.dream.controller;

import com.sydney.dream.module.User;
import com.sydney.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Sydney on 2017/1/11.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 功能：验证用户登录
     * 详细：用户请求登录，发送用户名和密码到服务器，服务器响应请求，
     * 1，从数据库中查找是否有此用户，如果没有此用户，登录失败。
     * 2，如果有此用户，验证此用户的密码是否正确，若果不正确，则登录失败。
     * 3，如果前两步验证还没有问题则验证失败。
     * user 使用POJO 的形式，把页面上穿过来的值获取到，即，获取用户名和密码。
     * @param user
     * @return
     * 说明：重大bug ，一，密码明文，二，没有验证码等的实现。
     * 补充：后续可以尝试扩展，手机登录，邮箱登录，微信，QQ ，新浪微博，等第三方账户登录。
     */
    @RequestMapping("/Login/login")
    public String doLogin(User user){
        System.out.println("============user_from_pages" + user + "=================");
        User user_database = userService.selectUserByUserName(user.getUserName());
        System.out.println("============user_from_databases" + user_database + "=================");
        if (user_database != null){
            if(user.getUserPassword().equals(user_database.getUserPassword())){
                return "main";
            }
        }
        return "login";

    }
}