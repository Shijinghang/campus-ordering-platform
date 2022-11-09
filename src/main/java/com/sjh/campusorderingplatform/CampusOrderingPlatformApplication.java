package com.sjh.campusorderingplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class CampusOrderingPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusOrderingPlatformApplication.class, args);
	}

}
