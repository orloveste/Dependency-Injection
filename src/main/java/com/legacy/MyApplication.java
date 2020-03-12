package com.legacy;

public class MyApplication implements Consumer {

    private MessageService service;

    public MyApplication(MessageService svc){
        this.service = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}

