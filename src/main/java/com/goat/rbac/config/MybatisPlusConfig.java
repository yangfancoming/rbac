package com.goat.rbac.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");//设置方言类型
        return page;
    }

    @Bean
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(1000); // ms
        return performanceInterceptor;
    }

    @Bean
    public SqlExplainInterceptor sqlExplainInterceptor(){
        return new SqlExplainInterceptor();
    }

    @Bean
    public OptimisticLockerInterceptor optimisticLoker() {
        return new OptimisticLockerInterceptor();
    }

}