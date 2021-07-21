package com.arulstudies.spring.core.dependencyInject;

import org.springframework.beans.factory.annotation.Autowired;

public class MyApplication {

    @Autowired
    private MessageService service;

    public boolean processMessage(String msg, String rec){
        //some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);
    }

}
