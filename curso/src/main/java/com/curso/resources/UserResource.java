package com.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.User;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	public ResponseEntity<User> findAll;
	
		
}
