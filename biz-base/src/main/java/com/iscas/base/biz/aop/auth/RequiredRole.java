package com.iscas.base.biz.aop.auth;

import java.lang.annotation.*;
import java.util.List;
import java.util.Set;

/**
 * 注解权限控制
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2018/7/18 15:29
 * @since jdk1.8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface RequiredRole {
    String[] value() default {"manager"};
}
