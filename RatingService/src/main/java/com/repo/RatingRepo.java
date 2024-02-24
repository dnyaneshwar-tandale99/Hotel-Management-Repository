package com.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.entity.Rating;
@Repository
public interface RatingRepo extends MongoRepository<Rating, String>{
	
	List<Rating> findByUserID(String userID);
	List<Rating> findByHotelID(String hotelID);

}
