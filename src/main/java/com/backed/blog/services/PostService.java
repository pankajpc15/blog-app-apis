package com.backed.blog.services;

import java.util.List;

import com.backed.blog.entities.Post;
import com.backed.blog.payloads.PostDto;
import com.backed.blog.payloads.PostResponse;


public interface PostService {

	// create

	PostDto createPost(PostDto postdto,Integer userId,Integer categoryId);

	// update
	PostDto updatePost(PostDto postdto, Integer postId);

	void deletePost(Integer postId);

	// get all post

	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);

	// get singal post

	PostDto getPostById(Integer postId);

	// get all post by category

	List<PostDto> getPostByCategory(Integer categoryId);

	// get all post by user

	List<PostDto> getPostByUser(Integer userId);

	// search posts
	List<PostDto> searchPost(String keyword);

}
