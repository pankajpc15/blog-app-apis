package com.backed.blog.services;

import java.util.List;

import com.backed.blog.entities.Post;
import com.backed.blog.payloads.PostDto;

public interface PostService {
	
	
	//create
	
	Post createPost(PostDto postdto);
	
	
	//update
	Post updatePost(PostDto postdto,Integer postId);
	
	
	void deletePost(Integer postId);
	
	
	//get all post
	
	List<Post> getAllPost();
	
	
	
	//get singal post
	
	Post getPostById(Integer postId);
	
	
	//get all post by category
	
	List<Post> getPostByCategory(Integer categoryId);
	
	//get all post by user
	
	List<Post> getPostByUser(Integer useId);
	
	
	//search posts
	List<Post> searchPost(String keyword);
	
	
	

}
