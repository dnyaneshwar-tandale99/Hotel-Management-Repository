package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.UserService;

@RestController
@RequestMapping("/users")
public class AppController {
	@Autowired
	private UserService service;
	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User us=service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(us);
	}
	@GetMapping("/{userID}")
	public ResponseEntity<User>loadUser(@PathVariable String userID){
		User user= service.getUser(userID);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping
	public ResponseEntity<List<User>>loadUsers(){
		 
		return ResponseEntity.ok(service.loadAllUsers());
	}
}
