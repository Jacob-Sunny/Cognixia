package com.cognixia.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountrySender {
	
	@Bean
	public CommandLineRunner sendTodos(@Value("${countrytodo.amqp.queue}") String name, CountryProducer producer) {
		return args -> {
			CountryTodo country = new CountryTodo();
			country.setName("United States America");
			country.setCapital("WAshington DC");
			country.setPop(16780000);
			country.setId(1);
			producer.sendTo(name,  country);
		};
	}

}
