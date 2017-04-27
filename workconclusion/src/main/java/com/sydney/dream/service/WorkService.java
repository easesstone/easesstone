package com.sydney.dream.service;

import com.sydney.dream.dao.WorkDao;
import com.sydney.dream.module.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by lWX355499 on 2017/4/25.
 */

@Service
public class WorkService {

    @Autowired
    private WorkDao workDao;

    public List<Work> getAll(){
        return workDao.selectAll();
    }

    public void addWork(Work work){
        workDao.addWork(work);
    }
}