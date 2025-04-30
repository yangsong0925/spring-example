package com.ss;

import com.ss.service.OrderService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStatemachineApplicationTests {

    @Resource
    private OrderService orderService;

    @Test
    public void orderStatus() throws InterruptedException {
        Thread.currentThread().setName("主线程");
        orderService.create();
//        orderService.create();
        orderService.pay(1);
        Thread thread = new Thread("客户线程") {
            @Override
            public void run() {
//                orderService.deliver(1);
                orderService.receive(1);
            }
        };
        thread.start();
        thread.join();
//        orderService.pay(2);
//        orderService.deliver(2);
//        orderService.receive(2);

        System.out.println("全部订单状态：" + orderService.getOrders());
    }

}
