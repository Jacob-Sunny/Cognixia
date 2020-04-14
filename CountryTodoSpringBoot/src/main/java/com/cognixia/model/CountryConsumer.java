package com.cognixia.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.cognixia.repository.CountryRepository;

@Component
public class CountryConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(CountryConsumer.class);
	
	private CountryRepository countryRepo;
	
	public CountryConsumer(CountryRepository repository) {
		this.countryRepo = repository;
	}
	
	@RabbitListener(queues = "${countrytodo.amqp.queue}")
	public void processToDo(CountryTodo todo) {
		
		log.info("Consumer> " + todo);
		log.info("CountryTodo created> " + this.countryRepo.save(todo));
	}

}
