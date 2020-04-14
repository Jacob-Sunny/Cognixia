package com.cognixia.model;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	CountryService cs;

	@GetMapping("/Countries/{name}")
	List<CountryTodo> getTodosByName(@PathVariable String name) {
		return cs.getTodosByName(name);
	}
	
	@GetMapping("Countries")
	List<CountryTodo> getTodos() {
		return cs.getTodos();
	}
	
	@PostMapping("Todo")
	CountryTodo createTodo(@Valid @RequestBody CountryTodo Todo) {
		return cs.createTodo(Todo);
	}
}
