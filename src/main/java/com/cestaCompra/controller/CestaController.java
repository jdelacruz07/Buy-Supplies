package com.cestaCompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cestaCompra.entity.CestaDeLaCompra;
import com.cestaCompra.service.CestaService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CestaController {
	
	@Autowired
	CestaService cestaService;
	
	@GetMapping
	public Iterable<CestaDeLaCompra> getAllCesta() {
		return cestaService.getAllCesta();
	}
	
	@PostMapping
	public CestaDeLaCompra addCesta(@RequestBody CestaDeLaCompra article) {
		System.out.println(article);
		return cestaService.addCesta(article);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@DeleteMapping("/{id}")
	public void deleteId(@PathVariable Integer id  ) {
		System.out.println("delete " + id);
		 cestaService.deleteId(id);
	}
}
