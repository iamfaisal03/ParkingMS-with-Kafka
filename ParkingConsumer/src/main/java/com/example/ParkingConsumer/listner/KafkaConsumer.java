package com.example.ParkingConsumer.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="live_avl_free_space" ,groupId="group1")
    public void Consumer(String message){
        System.out.println("live_avl_free_space"+" " +message);
    }
}
