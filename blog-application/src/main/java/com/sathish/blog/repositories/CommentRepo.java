package com.sathish.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment, Integer>{

}
