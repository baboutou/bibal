package com.bibal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

public class BibalApplication implements CommandLineRunner {

	//@Autowired
	public static void main(String[] args) {
		SpringApplication.run(BibalApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {


	}

}
