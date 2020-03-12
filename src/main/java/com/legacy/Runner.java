package com.legacy;

public class Runner {
    public static void main(String[] args) {
        String msg = "Buna tinere! ";
        String email = "orlovevm@yahoo.com";
        String phone = "373731803890";
        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app =  injector.getConsumer();
        app.processMessages(msg, email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
