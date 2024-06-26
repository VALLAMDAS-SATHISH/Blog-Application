package com.sathish.blog.services;

import java.util.List;

import com.sathish.blog.entities.Post;
import com.sathish.blog.payloads.PostDto;
import com.sathish.blog.payloads.PostResponse;

public interface PostService {
	
	// create
	
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	// update
	
	PostDto updatePost(PostDto postDto,Integer postId);
	
	// delete
	
	void deletePost(Integer postId);
	
	// get all posts
	
//	List<PostDto> getAllPost(Integer pageNumber,Integer pageSize);
	//PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy);
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy,String sortDir);
	// get single post
	
	PostDto getPostById(Integer postId);
	
	//get all post by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	// get all posts by user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	// search posts
	List<PostDto> searchPosts(String keyword);

}
