package com.example.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "test-topic", groupId = "demo-group")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
