package com.example.kafkademo.controller;

import com.example.kafkademo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class HomeController {

    @Autowired
    Producer producer;

    @GetMapping("/message")
    public void sendMessage(@RequestParam("message") String message) {
        producer.sendMessageToKafkaTopic(message);
    }
}
