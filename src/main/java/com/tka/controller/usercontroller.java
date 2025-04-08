package com.tka.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ServiceImpl.UserServiceImpl;
import com.tka.entity.User;
import com.tka.service.UserService;
@RestController
@RequestMapping("/api/users")
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
	public ResponseEntity<?> loginUser(@RequestParam String username,@RequestParam String password){
		Optional<User> user =userService.loginUser(user)
		if (isLoggenIn) {
			return ResponseEntity.ok("Login successful!");
		}else {
		return ResponseEntity.status(401).body("Invalid credentials!");
	}
	
	
	

}
}
