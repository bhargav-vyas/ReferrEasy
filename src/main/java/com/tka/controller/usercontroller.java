package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.UserService;
@RestController
@RequestMapping("/api/users")
public class usercontroller {
	@Autowired 
	private UserService userService;
	

}
