package com.example.UserService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.entity.Hotel;

@FeignClient(name = "HOTEL-SERVICES")
public interface HotelService {
	@GetMapping("/hotels/{hotelID}")
	Hotel getHotel(@PathVariable String hotelID);

}
