package com.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.OrderItem;
import com.curso.services.OrderItemService;

@RestController
@RequestMapping(value="/OrderItem")
public class OrderItemResource {
	
	@Autowired
	private OrderItemService service;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		List<OrderItem> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	};
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Integer Id){ //PathVariable insere no campo Id do parâmetro um valor passado na instrução do GetMapping
		OrderItem objOrderItem = service.findByID(Id);
		return ResponseEntity.ok().body(objOrderItem);
	}
	
	
		
}
