package com.example.ParkingProducer.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer {


    private String topicName="live_avl_free_space";

    @Autowired
    public KafkaTemplate<String,String> kafkaTemplate;

//     KafkaProducer(String topicName, KafkaTemplate<String, String> kafkaTemplate) {
//        this.topicName = topicName;
//        this.kafkaTemplate = kafkaTemplate;
//    }

    public void sendMessage() throws Exception {
        {
            this.kafkaTemplate.send("live_avl_free_space", "Variable", String.valueOf(Math.round(Math.random() * 1000)));
            Thread.sleep(2000, 0);

        }

    }

}