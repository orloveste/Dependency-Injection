package com.example.fourteen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ForuteenApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForuteenApplication.class, args);
    }
    @Component
    class Runner{
        @EventListener(ApplicationReadyEvent.class)
        public void exercise() throws Exception{

        }
    }
    record Elevi (Integer idElev, String numeElev){

    }

    class EleviService{}
}
