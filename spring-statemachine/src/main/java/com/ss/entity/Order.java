package com.ss.entity;

import com.ss.eums.OrderStatus;
import lombok.Data;

/**
 * @author yangsong
 * @date 2024/6/7 下午4:47
 * @Description: 订单
 * @version 1.0
 */
@Data
public class Order {

    private int id;
    private OrderStatus status;

}
