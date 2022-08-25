package com.Log4j.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLog4jDemoApplication {

	private static final Logger LOGGER = LogManager.getLogger(SpringbootLog4jDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLog4jDemoApplication.class, args);
		
        System.out.println("*****Spring Boot Application has been Started*********");
  		
  		LOGGER.trace("Trace level log message");
  		LOGGER.info("Info level log message");
  		LOGGER.debug("Debug level log message");
  		LOGGER.error("Error level log message");
  		
  		System.out.println("*****Spring Boot Application has been ended*********");
	}

}
