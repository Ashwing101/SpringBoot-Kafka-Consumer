package com.demo.springboot_kafka_consumer.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {


    @KafkaListener(topics= "KafkaTopic-2", groupId = "kafka-group-1")
    public void consume(String message){
    System.out.println("Consumer consume the message {}"+ message);
    }
}
