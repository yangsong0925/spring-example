package com.sys;

import com.sys.interceptor.CustomHandlerInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication()
public class SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

//    @Bean
//    public WebMvcConfigurerAdapter customMvcConfigurerAdapter (){
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new CustomHandlerInterceptor()).addPathPatterns("/**");
//                // 添加拦截器
//                super.addInterceptors(registry);
//            }
//        };
//    }

}
