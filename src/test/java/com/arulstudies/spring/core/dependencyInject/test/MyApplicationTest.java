package com.arulstudies.spring.core.dependencyInject.test;

import com.arulstudies.spring.core.dependencyInject.MessageService;
import com.arulstudies.spring.core.dependencyInject.MyApplication;
import org.junit.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.arulstudies.spring.core.dependencyInject")
public class MyApplicationTest {

    private AnnotationConfigApplicationContext context = null;

//    @Bean
//    public MessageService getMessageService() {
//        return new MessageService() {
//            @Override
//            public boolean sendMessage(String msg, String rec) {
//                System.out.println("Send Message sample");
//                return true;
//            }
//        };
//    }

    @Before
    public void setup() {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
    }

    @After
    public void clearClass() {
        context.close();
    }

    @Test
    public void test() {
        MyApplication app = context.getBean(MyApplication.class);
        Assert.assertTrue(app.processMessage("Arul", "playboyArul@gmail.com"));
    }
}
