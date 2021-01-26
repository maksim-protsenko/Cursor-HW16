package com.company.Cursor16.configurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "com.company.Cursor16.configurations.ConfigurationEnablerClass")
public class AutoConfigOnClass {
    public AutoConfigOnClass() {
        System.out.println("AutoConfigOnClass was created because of existing ConfigurationEnabler!");
    }
}
