package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	public List<User> loadAllUsers();
	public User getUser(String userId);

}
