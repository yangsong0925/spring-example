package com.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：yangsong
 * @date ：Created in 2019年6月30日 0030 03:57
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("find/{id}")
    public String findOrder(@PathVariable String id){
        int old = 123;
        return this.restTemplate.getForObject("http://127.0.0.1:7900/order/find/"+ old,String.class);
    }

    @GetMapping("find1/{id}")
    public String test(@PathVariable String id){
        int old = 123;
        return this.restTemplate.getForObject("http://eureka-order/order/find/"+ old,String.class);
    }


}
