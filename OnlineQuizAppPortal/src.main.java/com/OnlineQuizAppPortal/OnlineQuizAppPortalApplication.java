package com.OnlineQuizAppPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.OnlineQuizAppPortal")
public class OnlineQuizAppPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizAppPortalApplication.class, args);
	}

}
