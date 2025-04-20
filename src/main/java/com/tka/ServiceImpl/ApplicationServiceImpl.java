package com.tka.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.entity.Application;
import com.tka.entity.User;
import com.tka.repository.ApplicationRepository;
import com.tka.repository.Jobrepository;
import com.tka.repository.UserRepository;

public class ApplicationServiceImpl {
	@Autowired
	private ApplicationRepository applicationRepository;

	@Autowired
	private  UserRepository userRepository;
	@Autowired
	private Jobrepository jobrepository;
	
	
	public Application applyToJob(Long userId, Long jobId) { 
		User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("")
	}

}
