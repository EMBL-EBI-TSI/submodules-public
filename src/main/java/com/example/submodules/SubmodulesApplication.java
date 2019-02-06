package com.example.submodules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubmodulesApplication implements CommandLineRunner {

	@Autowired
	private SubService subService;
	
	public static void main(String[] args) {
		SpringApplication.run(SubmodulesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Change which will go from Dev to Master");
		System.out.println(subService.introduceYourself());
	}
}
