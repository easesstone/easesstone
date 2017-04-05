package com.sydney.dream.service;

import com.sydney.dream.dao.UserDao;
import com.sydney.dream.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sydney on 2017/1/10.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }
}
