package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kafkaDemoTopic", groupId = "kafkaDemoGroup")
    public void listenToTopic(String receivedMessage) {
        System.out.println(receivedMessage);
    }
}
