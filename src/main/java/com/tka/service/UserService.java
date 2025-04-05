package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.entity.User;
import com.tka.repository.UserRepository;

public class UserService {
	@Autowired   UserRepository  userRepository ;

	public void resisterUser(User user) {
	 userRepository.save(user);
		
		
	}

}
