package com.legacy;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS sent to "+rec+", with Message= "+msg);
    }
}
