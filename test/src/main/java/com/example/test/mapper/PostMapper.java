package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Post;

@Mapper
@Repository
public interface PostMapper {
	int getPostCount();
	List<Post> getPosts(int limit, int offset);
	void addPost(Post post);
}
