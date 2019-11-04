package com.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.Category;
import com.curso.services.CategoryService;

@RestController
@RequestMapping(value="/category")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	};
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Category> findById(@PathVariable Integer Id){ //PathVariable insere no campo Id do parâmetro um valor passado na instrução do GetMapping
		Category objCategory = service.findByID(Id);
		return ResponseEntity.ok().body(objCategory);
	}
	
	
		
}
