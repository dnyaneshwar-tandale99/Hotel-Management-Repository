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

import com.entity.Rating;
import com.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class AppController {
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/create")
	public ResponseEntity<Rating>create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}
	@GetMapping("/loadall")
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingService.getRatings());
	}
	@GetMapping("/user/{userID}")
	public ResponseEntity<List<Rating>> getRatingByUserID(@PathVariable String userID){
		return ResponseEntity.ok(ratingService.getRatingByUserID(userID));
	}
	@GetMapping("/hotel/{hotelID}")
	public ResponseEntity<List<Rating>> getRatingByHotelID(@PathVariable String hotelID){
		return ResponseEntity.ok(ratingService.getRatingByHotelID(hotelID));
	}

}
