package com.riteship.crs.student.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootApplication
@EnableDiscoveryClient
public class RiteShipCrsStudentMicroServiceApplication {





	public static void main(String[] args) {

		Thread threadOne = new Thread(() -> {
			File file = new File("C:\\RiteShip.xml");
			try {
				InputStream is = new FileInputStream(file);
			} catch(Exception ex) {

			}
		});

		Thread threadTwo = new Thread(() -> {
			File file = new File("C:\\RiteShip.xml");
			try {
				InputStream is = new FileInputStream(file);
			} catch(Exception ex) {

			}
		});

		threadTwo.start();
		threadOne.start();

		SpringApplication.run(RiteShipCrsStudentMicroServiceApplication.class, args);
	}

}
