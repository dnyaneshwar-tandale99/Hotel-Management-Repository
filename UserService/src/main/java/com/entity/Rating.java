package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rating {
	
	
	private String ratingID;
	private String userID;
	private String hotelID;
	private int rating;
	private String remarks;
	private String feedback;
	private Hotel hotel;

}
