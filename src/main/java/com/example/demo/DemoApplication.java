package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoApplication {

	public static void main(String[] args){
        SpringApplication.run(DemoApplication.class, args);
<<<<<<< HEAD
        System.out.println("Application ended");
=======
        System.out.println("Application Startd");
>>>>>>> de2b3d9586338c8a55d2822a094c2ae98a43f38e
	}


}
