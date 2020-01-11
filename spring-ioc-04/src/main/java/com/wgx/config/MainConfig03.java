package com.wgx.config;

import com.wgx.importSelector.CustomBeanDefinitionRegister;
import com.wgx.importSelector.CustomerImportSelector;
import com.wgx.pojo.People;
import com.wgx.pojo.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.wgx"})
public class MainConfig03 {

}
