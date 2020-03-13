package com.legacy;

public class MyApplication implements Consumer {

    private MessageService service;

    public MyApplication(){}
    public void setService(MessageService service){
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}

