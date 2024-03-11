package com.backed.blog.services;


import java.util.List;

import com.backed.blog.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserBYId(Integer userId);
	List<UserDto>getAllUsers();
	
	void deleteUser(Integer userId);
	
}
