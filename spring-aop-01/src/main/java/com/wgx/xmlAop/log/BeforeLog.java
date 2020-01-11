package com.wgx.xmlAop.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "---" + method.getName() + "前置log");
    }
}


//public class BeforeLog implements BeforeAdvice {
//
//    public void before(Method method, Object[] args, Object target) throws Throwable {
//        System.out.println(target.getClass().getName() + "---" + method.getName() + "前置log");
//    }
//}
