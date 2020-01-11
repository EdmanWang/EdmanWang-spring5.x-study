package com.wgx.config;

import com.wgx.component.Cat;
import com.wgx.component.Dog;
import com.wgx.component.Rabbit;
import com.wgx.condition.CustomCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig01 {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    @Conditional(value = CustomCondition.class)
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Rabbit rabbit() {
        return new Rabbit();
    }
}
