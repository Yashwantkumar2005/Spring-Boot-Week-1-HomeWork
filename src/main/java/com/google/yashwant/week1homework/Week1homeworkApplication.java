package com.google.yashwant.week1homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1homeworkApplication implements CommandLineRunner {
	@Autowired
	cakebaker c;

	public static void main(String[] args) {
		SpringApplication.run(Week1homeworkApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		c.bakecake();
	}
}
