package ru.egorov.laforme.laformeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LaformeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaformeServerApplication.class, args);
	}

}
