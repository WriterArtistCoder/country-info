package com.tinystripz.country_info;

import java.io.File;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CountryApplication {
	
	public static void main(String[] args) {
		JdbcTemplate temp;

		SpringApplication.run(CountryApplication.class, args);
		temp.execute("DROP TABLE world IF EXISTS");
		temp.execute("CREATE TABLE world(flag VARCHAR(128), iso_no SMALLINT, iso2 VARCHAR(2), iso3 VARCHAR(3), common_name VARCHAR(32), formal_name VARCHAR(64), un VARCHAR(20), recog INTEGER, pop INTEGER, area SMALLINT");
		
		 String currentPath = new java.io.File(".").getCanonicalPath();
		System.out.println("Current dir:" + currentPath);

		Scanner s = new Scanner(new File("src/main/resources/world.csv"));
		while (s.hasNext()) {
			String[] values = s.nextLine().split(",");
			String command = "INSERT INTO table_name VALUES (";

			values.forEach(v->{
				try { 
					Integer.parseInt(v); 
				} catch(NumberFormatException e) { 
					isInt = false;
				} catch(NullPointerException e) {
					isInt = false;
				}

				try { 
					Double.parseDouble(v); 
				} catch(NumberFormatException e) { 
					isDouble = false; 
				} catch(NullPointerException e) {
					isDouble = false;
				}
			});
		}

		/* CONCERNS
			Does not comply with SQL spec, just separates by newline then comma.
			Auto-detects numbers and strings.
			Does not have options to escape commas.
		*/
	}

}
