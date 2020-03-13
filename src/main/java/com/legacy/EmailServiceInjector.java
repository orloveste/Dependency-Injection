package com.legacy;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer(){
        MyApplication app = new MyApplication();
        app.setService(new EmailService());
        return app;
    }
}
