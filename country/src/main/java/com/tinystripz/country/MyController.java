package com.tinystripz.country;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	String answer() {
		return "answer";
	}
	
	@GetMapping("/country")
	String country() {
		String[] countries = {"U.S.A", "Canada", "Mexico", "Europe", "China", "Denmark"};
		return countries[new Random().nextInt(countries.length)];
	}
}
