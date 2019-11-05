package com.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entities.OrderItem;
import com.curso.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	@Autowired
	private OrderItemRepository repo;
	
	public List<OrderItem> findAll(){
		return repo.findAll();
	}
	
	public OrderItem findByID(Integer Id) {
		Optional<OrderItem> obj = repo.findById(Id);
		return obj.get();
	}
}
