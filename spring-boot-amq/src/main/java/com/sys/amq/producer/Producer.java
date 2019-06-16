package com.sys.amq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @author ：yangsong
 * @date ：Created in 2019年6月17日 0017 00:48
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Component("producer")
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    public void sendMessage(Destination destination, final String message){
        jmsTemplate.convertAndSend(destination, message);
    }

}
