package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DemoApplication.sumTwoNumbersAndAverageThem(2, 3);
	}

	public static void sumTwoNumbersAndAverageThem(int number1, int number2) {
		int numSum = number1 + number2;

		System.err.println((numSum + number1 + number2) / 3);

	}

}
