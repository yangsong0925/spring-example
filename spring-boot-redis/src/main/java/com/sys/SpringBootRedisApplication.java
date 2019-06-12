package com.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 *
 * @EnableCaching 开启缓存
 *
 */
@SpringBootApplication
@MapperScan("com.sys.mybatis.mapper")
@EnableCaching
public class SpringBootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisApplication.class, args);
    }


}
