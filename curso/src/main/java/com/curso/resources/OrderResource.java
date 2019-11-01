package com.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.Order;
import com.curso.services.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	};
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Order> findById(@PathVariable Integer Id){ //PathVariable insere no campo Id do parâmetro um valor passado na instrução do GetMapping
		Order objOrder = service.findByID(Id);
		return ResponseEntity.ok().body(objOrder);
	}
	
	
		
}
