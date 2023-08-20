package com.mydeveloperplanet.myspringconfigdocplanet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.mydeveloperplanet.myspringconfigdocplanet.config")
public class MySpringConfigDocPlanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringConfigDocPlanetApplication.class, args);
	}

}
