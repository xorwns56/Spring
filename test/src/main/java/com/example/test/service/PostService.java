package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Post;
import com.example.test.mapper.PostMapper;

@Service
public class PostService {
	@Autowired
	private PostMapper postMapper;
	
	public int getPostCount() {
		return postMapper.getPostCount();
	}
	
	public List<Post> getPosts(int limit, int offset){
		return postMapper.getPosts(limit, offset);
	}
	
	public void addPost(Post post) {
		postMapper.addPost(post);
	}
	
}
