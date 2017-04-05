package com.sydney.dream.controller;

import com.sydney.dream.module.User;
import com.sydney.dream.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Sydney on 2017/1/11.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        User user = userService.selectUserById(1);
        mav.addObject("user", user);
        return mav;
    }
}
