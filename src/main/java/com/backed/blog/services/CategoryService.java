package com.backed.blog.services;

import java.util.List;

import com.backed.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	public CategoryDto updateCategory(CategoryDto category,Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	
	//get
	
	public CategoryDto getCategory(Integer categoryId);
	//getAll
	
	public List<CategoryDto> getCategories();

}
