package com.sdl.kafkastream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaStreamProducer {
    final private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaStreamProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produceMessage(String message){
        kafkaTemplate.send("t_test", message);
    }
}
