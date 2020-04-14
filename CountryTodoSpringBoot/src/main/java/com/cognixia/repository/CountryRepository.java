package com.cognixia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cognixia.model.CountryTodo;

@RepositoryRestResource
public interface CountryRepository extends JpaRepository<CountryTodo, Integer> {

	List<CountryTodo> findByName(String name);
	

}
