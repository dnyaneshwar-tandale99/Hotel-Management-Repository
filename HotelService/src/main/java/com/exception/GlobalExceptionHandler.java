package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(HotelNotFound.class)
	public ResponseEntity<ApiResponse>handleError(HotelNotFound ex){
		String message= ex.getMessage();
		ApiResponse res= ApiResponse.builder().message(message).success(true).build();
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}

}
