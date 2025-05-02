package com.tka.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DTO.UserDTO;
import com.tka.ServiceImpl.UserServiceImpl;
import com.tka.entity.User;
import com.tka.service.UserService;
@RestController
@RequestMapping("/api/users")
@CrossOrigin("http://localhost:3000")
public class usercontroller {
	@Autowired 
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/resister")
	public ResponseEntity<String> resisterUser(@RequestBody User user){
		userServiceImpl.resisterUser(user);
		return ResponseEntity.ok("User resistered Sucessfully!");
		
	}
	@GetMapping("/{id}")
	 public ResponseEntity<User> getUserById(@PathVariable Long id){
		User user= userServiceImpl.getUserById(id);
		return ResponseEntity.ok(user);
	}
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserDTO userDTO){
		boolean isLoggenIn =	userServiceImpl.loginUser(userDTO);
		if (isLoggenIn) {
			return ResponseEntity.ok("Login successful!");
		}else {
		return ResponseEntity.status(401).body("Invalid username or password!");
		}
	}
		@GetMapping("/getall")//only admin can access
		public ResponseEntity<List<User>> getAllUser(){
		List<User> users =userServiceImpl.getAlluser();
		return ResponseEntity.ok(users);
		}
		@DeleteMapping("/deletBy/{id}")
		public ResponseEntity<String> deletById(@PathVariable Long id){
			userServiceImpl.deletById(id);
			return ResponseEntity.ok("User deleted successfully");
			
		}
		}
