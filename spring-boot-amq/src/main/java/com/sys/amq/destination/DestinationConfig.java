package com.sys.amq.destination;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author ：yangsong
 * @date ：Created in 2019年6月16日 0016 13:07
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Configuration
public class DestinationConfig {

    @Bean("testQueue")
    public Queue queueTest(){
        Queue queueTest = new ActiveMQQueue("test.queue");
        return queueTest;
    }

    @Bean("testTopic")
    public Topic topicTest(){
        Topic topicTest = new ActiveMQTopic("test.topic");
        return topicTest;
    }

}
