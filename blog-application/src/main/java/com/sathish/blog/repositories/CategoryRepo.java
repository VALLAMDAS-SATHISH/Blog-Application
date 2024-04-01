package com.sathish.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	

}
