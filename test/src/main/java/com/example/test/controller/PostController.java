package com.example.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.PaginationInfo;
import com.example.test.entity.Post;
import com.example.test.service.PostService;


@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postService;

	@GetMapping
	public Map<String, Object> getPosts(@RequestParam int pageNo){
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(pageNo);
		paginationInfo.setRecordCountPerPage(5);
		paginationInfo.setPageSize(5);
		paginationInfo.setTotalRecordCount(postService.getPostCount());
		
		Map<String, Object> map = new HashMap<>();
		map.put("paginationInfo", paginationInfo);
		map.put("posts", postService.getPosts(paginationInfo.getRecordCountPerPage(), paginationInfo.getFirstRecordIndex()));
		return map;
	}
	
	@PostMapping
	public void addPost(@RequestBody Post post){
		postService.addPost(post);
	}
}
