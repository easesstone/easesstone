package com.sydney.dream.service;

import com.sydney.dream.commonTestUtils.SpringTestCase;
import com.sydney.dream.module.Work;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Sydney on 2017/4/27.
 */
public class WorkServiceTest extends SpringTestCase{

    @Autowired
    WorkService workService;
    Logger logger = Logger.getLogger(WorkService.class);

    @Test
    public void testSelectAll(){
        List<Work> works = workService.getAll();
        for(Work work:works){
            System.out.println(work);
        }
//        logger.debug(works);
    }
}
