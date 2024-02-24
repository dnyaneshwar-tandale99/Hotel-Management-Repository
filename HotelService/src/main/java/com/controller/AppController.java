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

import com.entity.Hotel;
 
import com.service.HotelService;

 

@RestController
@RequestMapping("/hotels")
public class AppController {
	@Autowired
	private HotelService service;
	@PostMapping("/addhotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		Hotel us=service.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(us);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel>loadHotel(@PathVariable String id){
		Hotel user= service.getHotel(id);
		return ResponseEntity.ok(user);
	}
	@GetMapping
	public ResponseEntity<List<Hotel>>loadAllHotels(){
		 
		return ResponseEntity.ok(service.loadAllHotels());
	}
}
