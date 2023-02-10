package com.biz.streamers.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.biz.streamers.producer.entities.Product;
import com.biz.streamers.producer.entities.Products;

@Service
@Component
public class KafkaProducer {

    private KafkaTemplate<String, Product> kafkaTemplate;



    private String URL = "https://dummyjson.com/products";
    

    KafkaProducer(KafkaTemplate<String, Product> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void runProducer() {

        RestTemplate rt = new RestTemplate();
        System.out.println("********" + URL);
        Products resultProducts = rt.getForObject(URL, Products.class);

        System.out.println(resultProducts);
        String topic = "spring.boot.kafka.stream.input";

        for (Product p : resultProducts.getProducts()) {
            sendMessage(p, topic);
        }

    }
    public void sendMessage(Product product, String topic) {
        kafkaTemplate.send(topic, product);
        System.out.println(product.toString());

    }
}
