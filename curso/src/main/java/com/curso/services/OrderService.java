package com.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entities.Order;
import com.curso.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	public List<Order> findAll(){
		return repo.findAll();
	}
	
	public Order findByID(Integer Id) {
		Optional<Order> obj = repo.findById(Id);
		return obj.get();
	}
}
