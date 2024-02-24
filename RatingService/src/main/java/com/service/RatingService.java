package com.service;

import java.util.List;

import com.entity.Rating;

public interface RatingService {
	
	public Rating create(Rating rating);
	List<Rating> getRatings();
	List<Rating> getRatingByUserID(String userID);
	List<Rating> getRatingByHotelID(String hotelID);
}
