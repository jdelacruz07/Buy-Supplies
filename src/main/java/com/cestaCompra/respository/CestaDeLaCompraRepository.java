package com.cestaCompra.respository;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.repository.CrudRepository;

import com.cestaCompra.entity.CestaDeLaCompra;

public interface CestaDeLaCompraRepository extends CrudRepository<CestaDeLaCompra, Integer>   {
	
	

}
