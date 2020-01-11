package com.wgx;

import com.wgx.config.MainConfig01;
import com.wgx.config.MainConfig02;
import com.wgx.config.MainConfig03;
import com.wgx.pojo.Cat;
import com.wgx.pojo.Dog;
import com.wgx.pojo.component.Person;
import com.wgx.pojo.component.UserController;
import com.wgx.pojo.component.UserDao;
import com.wgx.pojo.component.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        test03();
    }

    public static void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig01.class);
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);

        System.out.println(context.getBean("dog11", Dog.class));

        MainConfig01 mainConfig = context.getBean("mainConfig", MainConfig01.class);
        System.out.println(mainConfig);
    }

    public static void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig02.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    public static void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig03.class);
//        System.out.println(context.getBean(UserController.class));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserDao.class));
    }
}
