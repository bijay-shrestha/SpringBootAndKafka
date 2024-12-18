package com.example.springbootandkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "my-topic", groupId = "test-group")
    public void listen(String message) {
        System.out.println("Consumed message: " + message);
    }
}