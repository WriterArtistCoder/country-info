package com.tinystripz.country_info;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	String answer() {
		return "answer";
	}
	
	@GetMapping("/country_info")
	String country_info() {
		String[] countries = {"U.S.A", "Canada", "Mexico", "Europe", "China", "Denmark"};
		return countries[new Random().nextInt(countries.length)];
	}
}
