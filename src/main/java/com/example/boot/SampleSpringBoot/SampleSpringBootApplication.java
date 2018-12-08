package com.example.boot.SampleSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
		System.out.println("This is added in feature1 branch");
		System.out.println("This is added in Practice2 Branch");
	}
}
