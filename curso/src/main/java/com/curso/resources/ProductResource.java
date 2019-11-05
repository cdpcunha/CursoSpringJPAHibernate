package com.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.Product;
import com.curso.services.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	};
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Product> findById(@PathVariable Integer Id){ //PathVariable insere no campo Id do parâmetro um valor passado na instrução do GetMapping
		Product objProduct = service.findByID(Id);
		return ResponseEntity.ok().body(objProduct);
	}
	
	
		
}
