package com.sys.amq.consumer;

/**
 * @author ：yangsong
 * @date ：Created in 2019年6月17日 0017 00:24
 * @description：${description}
 * @modified By：
 * @version: $version$
 */

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Consumer {

    /**
     * 增加对应处理的监听器工程 containerFactory
     * @param text
     * @throws Exception
     */
    @JmsListener(destination = "test.queue",containerFactory="queueListenerFactory")
    public void receiveQueue(TextMessage text) throws Exception {
        System.out.println(Thread.currentThread().getName()+":Consumer收到的报文为:"+text.getText());
    }

    @JmsListener(destination="test.topic",containerFactory="topicListenerFactory")
    public void receiveTopicA(TextMessage text) throws JMSException {
        System.out.println("A----"+text.getText());
    }

    @JmsListener(destination="test.topic",containerFactory="topicListenerFactory")
    public void receiveTopicB(TextMessage text) throws JMSException {
        System.out.println("B----"+text.getText());
    }

}
