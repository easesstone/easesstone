package com.sydney.dream.base_test;

import org.slf4j.Logger;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Sydney on 2017/1/10.
 */
@ContextConfiguration(locations = { "classpath:application.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests {
    protected  Logger logger = LoggerFactory.getLogger(getClass());
}
