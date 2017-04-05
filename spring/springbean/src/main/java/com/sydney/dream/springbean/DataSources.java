package com.sydney.dream.springbean;

import java.util.Properties;

/**
 * Created by Sydney on 2017/4/3.
 */
public class DataSources {
    private Properties properties;

    public DataSources(Properties properties) {
        this.properties = properties;
    }

    public DataSources() {
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
