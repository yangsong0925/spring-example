package com.sys;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author ：yangsong
 * @date ：Created in 2019年6月23日 0023 23:18
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootAmqApplication.class);
    }

}
