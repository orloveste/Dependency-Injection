package com.test;

import com.legacy.Consumer;
import com.legacy.MessageService;
import com.legacy.MessageServiceInjector;
import com.legacy.MyApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyApplicationJUnitTest {
    private MessageServiceInjector injector;
    @Before
    public void setUp(){
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                return new MyApplication(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Test message service implementation? ");
                    }
                });
            }
        };
    }
    @Test
    public void test(){
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Nu cred ca merge testul", "haicuvaca@nou.ro");
    }
    @After
    public void tear(){
        injector = null;
    }

}
