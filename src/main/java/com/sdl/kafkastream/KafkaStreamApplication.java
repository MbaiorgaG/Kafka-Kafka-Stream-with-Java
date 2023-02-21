package com.sdl.kafkastream;

import com.sdl.kafkastream.producer.KafkaStreamProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaStreamApplication implements CommandLineRunner {

	@Autowired
	KafkaStreamProducer kafkaStreamProducer;
	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		kafkaStreamProducer.produceMessage("Hello this kafka message has been sent across");
	}
}
