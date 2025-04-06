package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.User;
import com.tka.service.UserService;
@RestController
@RequestMapping("/api/users")
public class usercontroller {
	@Autowired 
	private UserService userService;
	
	@PostMapping("/resister")
	public ResponseEntity<String> resisterUser(@RequestBody User user){
		userService.resisterUser(user);
		return ResponseEntity.ok("User resistered Sucessfully!");
		
	}
	@GetMapping("/{id}")
	 public ResponseEntity<User> getUserById(@PathVariable Long id){
		User user= userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
	
	

}
