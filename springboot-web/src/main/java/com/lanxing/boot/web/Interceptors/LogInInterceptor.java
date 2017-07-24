package com.lanxing.boot.web.Interceptors;

import com.lanxing.boot.web.annotation.LoginCheck;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/21 下午7:51
 * @desc 登录拦截器,需要增加新的拦截器 {@link com.lanxing.boot.web.Application#addInterceptors(InterceptorRegistry)}
 */
public class LogInInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println(request.getRequestURL().toString());
        System.out.println("LogInInterceptor");
        System.out.println(handler instanceof HandlerMethod);

        if (handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod)handler;
            Method method = handlerMethod.getMethod();
            if(method.isAnnotationPresent(LoginCheck.class)){
                String token = request.getHeader("t");
                if(!StringUtils.isEmpty(token)){
//                    从缓存读取
                    request.setAttribute("userId", 1000L);
                }
            }
        }
        return true;
    }
}
