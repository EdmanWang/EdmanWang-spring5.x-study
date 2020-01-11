package com.wgx.config;

import com.wgx.pojo.component.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = {"com.wgx.pojo.component"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = Person.class)
})
public class MainConfig02 {
}
