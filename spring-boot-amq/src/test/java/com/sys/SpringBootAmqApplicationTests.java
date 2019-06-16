package com.sys;

import com.sys.amq.producer.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAmqApplicationTests {

    @Autowired
    private Producer producer;
    @Resource(name = "testQueue")
    private Queue    queue;
    @Resource(name = "testTopic")
    private Topic    topic;

    @Test
    public void contextLoads() {
        System.out.println(topic);
//        while(true){
            for(int i=0; i<10; i++){
                producer.sendMessage(queue, "myname is chhliu!!!"+i);
                producer.sendMessage(topic, "i'm the king of the world!");
            }
//        }
    }

}
