package com.arulstudies.spring.core.dependencyInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication application = applicationContext.getBean(MyApplication.class);
        application.processMessage("Hi Arul", "arulThePlayboy@gmail.com");

        applicationContext.close();
    }
}
