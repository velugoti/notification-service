package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "orders", groupId = "notification-group")
    public void consume(String message) {
        System.out.println("📩 Notification sent for order: " + message);
    }
}