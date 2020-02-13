package com.anz.wholesale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.anz.wholesale"})
public class AnzWholesaleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnzWholesaleAppApplication.class, args);
	}

}
