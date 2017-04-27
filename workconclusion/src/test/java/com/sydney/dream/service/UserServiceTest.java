package com.sydney.dream.service;

import com.sydney.dream.commonTestUtils.SpringTestCase;
import com.sydney.dream.module.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Sydney on 2017/1/10.
 */
public class UserServiceTest extends SpringTestCase{
    @Autowired
    private UserService userService;
    //log4j 的监听器。
    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Test
    public void testSelectUserById(){
        User user = userService.selectUserById(5);
        logger.debug("查找结果=====================" + user);
    }

    @Test
    public void testSelectUserByName(){
        User user = userService.selectUserByUserName("kaka");
        logger.debug("查找结果========================" + user);
    }
}
