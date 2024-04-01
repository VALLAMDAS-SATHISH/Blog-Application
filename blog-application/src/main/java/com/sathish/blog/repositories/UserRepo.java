package com.sathish.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
