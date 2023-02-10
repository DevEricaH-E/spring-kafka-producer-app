package com.biz.streamers.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.biz.streamers.producer.KafkaProducer;
import com.biz.streamers.producer.entities.Product;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Product product){
        String topic = "spring.boot.kafka.sink.output";
        kafkaProducer.sendMessage(product, topic);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}