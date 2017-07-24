package com.lanxing.boot.web.annotation;

import java.lang.annotation.*;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/24 下午2:38
 * @desc 登录注解，在需要登录的url上进行注解即可，会在url拦截器中进行拦截
 * @see com.lanxing.boot.web.Interceptors.LogInInterceptor
 */
@Documented
//@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginCheck {
}
