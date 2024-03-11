package com.backed.blog.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backed.blog.entities.User;


public interface UserRepo extends JpaRepository<User, Integer>{

	
	
}
