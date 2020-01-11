package com.wgx;

import com.wgx.component.Cat;
import com.wgx.config.MainConfig01;
import com.wgx.config.MainConfig02;
import com.wgx.config.MainConfig03;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {


    
    public static void main(String[] args) {
        test03();
    }

    public static void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig01.class);
        System.out.println(context.getBean(Cat.class));
    }

    public static void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig02.class);
    }

    public static void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig03.class);
    }
}
