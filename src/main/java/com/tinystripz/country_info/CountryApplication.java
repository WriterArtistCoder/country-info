package com.tinystripz.country_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class CountryApplication {

	@Autowired
	JdbcTemplate temp;
	
	public static void main(String[] args) {
		SpringApplication.run(CountryApplication.class, args);
		temp.execute("DROP TABLE world IF EXISTS");
		temp.execute("CREATE TABLE world(
			flag VARCHAR(128), iso_no SMALLINT,
			iso2 VARCHAR(2), iso3 VARCHAR(3)
			common_name VARCHAR(32),
			formal_name VARCHAR(64),
			un VARCHAR(20), recog INTEGER,
			pop INTEGER, area SMALLINT");
		
	}

}
