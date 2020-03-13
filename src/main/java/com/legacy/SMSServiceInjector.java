package com.legacy;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
//        return new MyApplication(new SMSService());
    }
}
