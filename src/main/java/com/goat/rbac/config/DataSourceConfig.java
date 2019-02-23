package com.goat.rbac.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl("jdbc:mysql://172.16.163.135:3306/rabc?Unicode=true&characterEncoding=utf8");
        ds.setUsername("root");
        ds.setPassword("12345");
        ds.setInitialSize(5);
        ds.setMinIdle(5);
        ds.setMaxActive(10);
        ds.setMaxWait(6000);
        ds.setValidationQuery("SELECT 1 FROM DUAL");
        return ds;
    }


}
