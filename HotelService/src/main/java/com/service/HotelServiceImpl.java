package com.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Hotel;
import com.exception.HotelNotFound;
import com.repo.HotelRepository;
 @Service

public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelRepository repository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		String randomId= UUID.randomUUID().toString();
		hotel.setId(randomId);
		return repository.save(hotel);
	}

	 

	@Override
	public Hotel getHotel(String hotelId) {
		 return repository.findById(hotelId).orElseThrow(() -> new HotelNotFound("User with given id not found  " + hotelId));
	}



	@Override
	public List<Hotel> loadAllHotels() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


 

}
