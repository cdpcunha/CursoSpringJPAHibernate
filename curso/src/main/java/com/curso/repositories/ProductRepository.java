package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entities.Product;

//Repository mapeia o banco de dados para a entidade definida no JpaRepository
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
