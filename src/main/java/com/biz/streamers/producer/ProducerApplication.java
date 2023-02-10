package com.biz.streamers.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
		System.out.println("PRODUCER APP STARTED");

		KafkaConfig config = new KafkaConfig();
		KafkaProducer producer = new KafkaProducer(config.kafkaTemplate());
		producer.runProducer();
		
		
	}

}
