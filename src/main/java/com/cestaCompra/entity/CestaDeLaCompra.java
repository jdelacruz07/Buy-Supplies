package com.cestaCompra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cesta")
public class CestaDeLaCompra {

	@Id
	@GeneratedValue
	Integer id;
	@NotNull
	@Column(name = "fruta")
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
