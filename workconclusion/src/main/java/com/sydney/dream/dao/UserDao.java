package com.sydney.dream.dao;

import com.sydney.dream.module.User;

/**
 * Created by Sydney on 2017/1/10.
 */
public interface UserDao {
    public User selectUserById(Integer userId);
}
