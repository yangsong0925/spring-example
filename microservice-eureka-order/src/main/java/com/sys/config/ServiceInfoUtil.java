package com.sys.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：yangsong
 * @date ：Created in 2019年7月3日 0003 21:14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Configuration
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {

    /**
     * 声明 event 对象，该对象用于获取运行服务器的本地端口
     */
    private static WebServerInitializedEvent event;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        ServiceInfoUtil.event = webServerInitializedEvent;
    }

    /**
     * 获取端口
     * @return
     */
    public  static int getPort(){
        int port = event.getWebServer().getPort();
        return port;
    }

}
