package com.backed.blog.repositiories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backed.blog.entities.Category;
import com.backed.blog.entities.Post;
import com.backed.blog.entities.User;

public interface PostRepo  extends JpaRepository<Post, Integer>
{

	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
	
}
