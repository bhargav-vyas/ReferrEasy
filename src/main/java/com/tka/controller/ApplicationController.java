package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ServiceImpl.ApplicationServiceImpl;
import com.tka.entity.Application;
@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

	@Autowired 
	private ApplicationServiceImpl  applicationServiceImpl; 
	
	@PostMapping("/apply")
	public  Application applyToJob(@RequestParam Long userId , @RequestParam Long jobId) {
		return applicationServiceImpl.applyToJob(userId,jobId);
		
	}
	
	
	
	
}
