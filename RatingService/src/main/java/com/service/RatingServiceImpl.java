package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Rating;
import com.repo.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	private RatingRepo repo;

	@Override
	public Rating create(Rating rating) {

		return repo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {

		}

		return repo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserID(String userID) {

		return repo.findByUserID(userID);
	}

	@Override
	public List<Rating> getRatingByHotelID(String hotelID) {

		return repo.findByHotelID(hotelID);
	}

}
