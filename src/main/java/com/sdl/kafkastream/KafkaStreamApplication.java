package com.sdl.kafkastream;

import com.sdl.kafkastream.model.Employee;
import com.sdl.kafkastream.producer.KafkaStreamProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class KafkaStreamApplication implements CommandLineRunner {

	@Autowired
	KafkaStreamProducer kafkaStreamProducer;
	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i =0; i< 10; i++){
			kafkaStreamProducer.produceMessage(new Employee(i, "Employee "+ i, LocalDate.now()));
		}
	}
}
