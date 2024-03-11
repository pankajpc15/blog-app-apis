package com.backed.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

	String resourceName;
	String fieldName;
	long fieldVlaue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldVlaue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldVlaue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldVlaue = fieldVlaue;
	}
	
	
	

	
//	
//	public ResourceNotFoundException(String resourceName, String fieldName, Long fieldVlaue) {
//		super(String.format("% not found with %s : %l", resourceName, fieldName, fieldVlaue));
//		this.resourceName = resourceName;
//		this.fieldName = fieldName;
//		this.fieldVlaue = fieldVlaue;
//	}

}
