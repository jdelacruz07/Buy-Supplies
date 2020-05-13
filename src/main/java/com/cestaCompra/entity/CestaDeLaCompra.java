package com.cestaCompra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CestaDeLaCompra {

	@Id
	@GeneratedValue
	Integer id;
	String fruit;

	public CestaDeLaCompra() {
		super();
	}

	public CestaDeLaCompra(String fruit) {
		super();
		this.fruit = fruit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	
}
