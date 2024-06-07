package com.ss.eums;

/**
 * @author yangsong
 * @date 2024/6/7 下午4:47
 * @Description: 订单状态
 * @version 1.0
 */
public enum OrderStatus {
    // 待支付，待发货，待收货，已完成
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH;
}
