package com.wgx.xmlAop.log;

public class Log {

    public void before() {
        System.out.println("--------------前置log----------------");
    }

    public void after() {
        System.out.println("--------------后置log----------------");
    }
}
