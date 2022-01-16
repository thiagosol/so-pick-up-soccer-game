package com.thiagosol.sopickupsoccergame.entrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.thiagosol.sopickupsoccergame.entrypoint.*",
		"com.thiagosol.sopickupsoccergame.core.*",
		"com.thiagosol.sopickupsoccergame.dataprovider.*"})
public class SoPickUpSoccerGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoPickUpSoccerGameApplication.class, args);
	}

}
