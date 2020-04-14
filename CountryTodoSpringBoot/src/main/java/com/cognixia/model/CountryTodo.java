package com.cognixia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

@Entity
public class CountryTodo {
	
	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	private String capital;
	
	private int pop;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}


	@Override
	public String toString() {
		return "CountryTodo [id=" + id + ", name=" + name + ", capital=" + capital + ", pop=" + pop	+ "]";
	}
	
	

}
