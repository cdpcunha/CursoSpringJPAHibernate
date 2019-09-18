package com.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.User;
import com.curso.services.UserService;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@Autowired
	private UserService serv;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = serv.findAll();
		
		return ResponseEntity.ok().body(list);
	};
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<User> findById(@PathVariable Integer Id){ //PathVariable insere no campo Id do parâmetro um valor passado na instrução do GetMapping
		User objUser = serv.findByID(Id);
		return ResponseEntity.ok().body(objUser);
	}
	
	
		
}
