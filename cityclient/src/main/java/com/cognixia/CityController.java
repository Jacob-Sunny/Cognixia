package com.cognixia;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sun.tools.javac.util.List;

@RestController
public class CityController {
	
	ArrayList city = new ArrayList();

	@Value("${server.port}")
	private int port;

	@GetMapping("/hello")
	public String greeting() {
		city.add("New York City");
		city.add("Toronto");
		city.add("Tokyo");
		city.add("Whuan");
		return "Hello from CityClient! Here are your cities:   " + city;
	}
}
