package com.example.ParkingProducer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ParkingProducer.config.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    KafkaProducer kafkaProducer;
    @GetMapping("/publish")
    public ResponseEntity<String>publishMessage() throws Exception {
    for(;;){
        kafkaProducer.sendMessage();
    }

    }
//    public ResponseEntity<String>publishMessage(@PathVariable("message")String message) throws InterruptedException {
//        kafkaProducer.sendMessage(message);
//        return ResponseEntity.ok("Message Sent");
//    }
}
