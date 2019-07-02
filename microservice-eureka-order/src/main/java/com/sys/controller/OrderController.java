package com.sys.controller;

import com.sys.po.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yangsong
 * @date ：Created in 2019年6月30日 0030 03:57
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("find/{id}")
    public Order findOrderById(@PathVariable String id){
        Order order = new Order();
        order.setId(id);
        order.setPrice(23.5);
        order.setReceiverAddress("四川");
        order.setReceiverName("杨松");
        order.setReceiverPhone("13980152803");
        return order;
    }

}
