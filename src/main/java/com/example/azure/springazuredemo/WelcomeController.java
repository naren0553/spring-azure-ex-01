package com.example.azure.springazuredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("welcome")
	public String wish() {
		return "Welcome to Azure!!";
	}

}
