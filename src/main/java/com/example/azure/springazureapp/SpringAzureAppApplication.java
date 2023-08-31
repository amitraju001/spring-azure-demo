package com.example.azure.springazureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringAzureAppApplication {
	@GetMapping("message")
    public String message(){
		return "Your app is deployed successfully in Azure";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureAppApplication.class, args);
	}

}
