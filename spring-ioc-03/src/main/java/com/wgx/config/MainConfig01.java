package com.wgx.config;

import com.wgx.pojo.Cat;
import com.wgx.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig01 {

    @Bean(name = "cat")
    public Cat cat() {
        return new Cat();
    }

    /**
     * 默认是以方法名来确定方法名
     *
     * @return
     */
    @Bean
    public Dog dog() {
        return new Dog();
    }

}
