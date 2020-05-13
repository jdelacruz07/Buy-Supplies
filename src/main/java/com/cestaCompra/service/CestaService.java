package com.cestaCompra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cestaCompra.entity.CestaDeLaCompra;
import com.cestaCompra.respository.CestaDeLaCompraRepository;

@Service
public class CestaService {
	
	@Autowired
	CestaDeLaCompraRepository cestaDeLaCompraRepository;
	
	public Iterable<CestaDeLaCompra> getAllCesta () {
		return cestaDeLaCompraRepository.findAll();
	}
	
	public CestaDeLaCompra addCesta(CestaDeLaCompra cesta) {
		return cestaDeLaCompraRepository.save(cesta);
	}
	
	
}
