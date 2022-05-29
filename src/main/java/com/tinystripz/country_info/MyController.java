package com.tinystripz.country_info;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private FactService fs = new FactSerivce();

	@GetMapping("/")
	String answer() {
		return "answer";
	}
	
	@GetMapping("/country_info")
	String country_info() {
		String[] countries = {"New York, NY", "Los Angeles, CA", "Chicago, IL", "Houston, TX", "Phoenix, AZ", "Philadelphia, PA", "San Antionio, TX", "San Diego, CA", "Dallas, TX",  "San Jose, CA"};
		return "<html><h1>"+countries[new Random().nextInt(countries.length)] + "</h1></html>";
	}
	
	@GetMapping("/next_fact")
	String next_fact() {
		return fs.nextFact();
	}
	
}
