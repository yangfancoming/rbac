package com.goat.rbac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.goat.rbac.dao") // sos 不用在每个mapper上添加@Mapper注解
public class RbacApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacApplication.class, args);
    }

}
