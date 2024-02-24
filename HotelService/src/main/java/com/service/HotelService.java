package com.service;

import java.util.List;

import com.entity.Hotel;
 
public interface HotelService {
	
	public Hotel saveHotel(Hotel user);
	public List<Hotel> loadAllHotels();
	public Hotel getHotel(String hotelId);

}
