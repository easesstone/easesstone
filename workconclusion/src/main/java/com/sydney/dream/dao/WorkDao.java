package com.sydney.dream.dao;

import com.sydney.dream.module.Work;

import java.util.List;

/**
 * Created by lWX355499 on 2017/4/25.
 */
public interface WorkDao {
    public List<Work> selectAll();
    public void addWork(Work work);
}