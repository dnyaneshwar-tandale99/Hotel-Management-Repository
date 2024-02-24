package com.exception;

public class UserNotFound extends RuntimeException{

	public UserNotFound() {
		super("User Not found in the database");
	 
	}

	public UserNotFound(String message) {
		super(message);
		 
	}
	
	

}
