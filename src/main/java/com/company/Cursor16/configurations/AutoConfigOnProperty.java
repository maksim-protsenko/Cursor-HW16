package com.company.Cursor16.configurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigOnProperty {

    @Bean
    @ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
    public void createBean() {
        System.out.println("AutoConfigOnProperty bean has been created! Property \"custom.configuration.enabled\" is true");
    }
}
