package com.legacy;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("E-mail sent to "+rec+", with Message= "+msg);
    }
}
