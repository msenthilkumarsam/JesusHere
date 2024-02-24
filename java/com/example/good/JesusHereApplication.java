package com.example.good;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class JesusHereApplication {

	@GetMapping(value = "/hello")  
	public String getWelcome()   
	{  
	
	return "Welcome to openshift";  
	}  
	
	public static void main(String[] args) {
		SpringApplication.run(JesusHereApplication.class, args);
	}

}
