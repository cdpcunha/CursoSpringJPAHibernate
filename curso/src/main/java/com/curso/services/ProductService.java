package com.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entities.Product;
import com.curso.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll(){
		return repo.findAll();
	}
	
	public Product findByID(Integer Id) {
		Optional<Product> obj = repo.findById(Id);
		return obj.get();
	}
}
