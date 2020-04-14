package com.cognixia;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sun.tools.javac.util.List;

@RestController
public class CountryController {
	
	ArrayList countries = new ArrayList();

	@Value("${server.port}")
	private int port;

	@GetMapping("/hello")
	public String greeting() {
		countries.add("America");
		countries.add("Canada");
		countries.add("Japan");
		countries.add("China");
		return "Here are your countries:   " + countries;
	}
}
