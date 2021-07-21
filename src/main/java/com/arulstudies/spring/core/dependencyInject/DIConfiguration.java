package com.arulstudies.spring.core.dependencyInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value={"com.arulstudies.spring.core.dependencyInject"})
public class DIConfiguration {

    @Bean
    @Scope("singleton")
    public MessageService messageService() {
        return new EmailService();
    }

    @Bean
    public MyApplication myApplication() {
        return new MyApplication();
    }
}
