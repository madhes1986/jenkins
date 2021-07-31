package com.fego.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FegoTransactionApplication {

	private static final Logger log = LoggerFactory.getLogger(FegoTransactionApplication.class);

	public static void main(String[] args) {
		new SpringApplication(FegoTransactionApplication.class).run();
		log.info("Fego Transaction Service has been started.");
	}
}