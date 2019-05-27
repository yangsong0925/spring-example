package com.sys.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月27日 0027 23:38
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class CustomHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 一定得为true，否则拦截器就无法生效了
        // 当然可以随意各种对url的拦截处理
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            // 防止出现空指针
            // 在springboot中如果是错误页肯定不会出现mv为null的情况
            modelAndView.setViewName("/err");
            // 注意：该请求只是测试试用，并没有实际的意义
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
    }
}

