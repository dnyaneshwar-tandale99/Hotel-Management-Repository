package com.exception;

public class HotelNotFound extends RuntimeException{

	public HotelNotFound() {
		super("HOtel Not found in the database");
	 
	}

	public HotelNotFound(String message) {
		super(message);
		 
	}
	
	

}
