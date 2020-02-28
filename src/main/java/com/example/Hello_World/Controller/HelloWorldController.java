package com.example.Hello_World.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloWorldController {
	
	@GetMapping("/messagenow/{msg}")
	public String sendMessage(String msg) {
		return "Hello World";
	}

}
