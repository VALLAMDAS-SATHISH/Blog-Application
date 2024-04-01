package com.sathish.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sathish.blog.entities.Category;
import com.sathish.blog.entities.Post;
import com.sathish.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	// user -- post --(custom methods)
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
//	@Query("select p from Post p where p.title like :key")
//	List<Post> searchByTitle(@Param("key") String title);
	List<Post> findByTitleContaining(String keyword);

}
