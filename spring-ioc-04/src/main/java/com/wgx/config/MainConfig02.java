package com.wgx.config;

import com.wgx.component.Cat;
import com.wgx.component.Dog;
import com.wgx.component.Rabbit;
import com.wgx.condition.CustomCondition;
import com.wgx.importSelector.CustomBeanDefinitionRegister;
import com.wgx.importSelector.CustomerImportSelector;
import com.wgx.pojo.People;
import com.wgx.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Person.class, People.class, CustomerImportSelector.class, CustomBeanDefinitionRegister.class})
public class MainConfig02 {

}
