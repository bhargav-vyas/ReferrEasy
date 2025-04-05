package com.tka.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.User;
import com.tka.repository.UserRepository;
@Service
public class UserServiceImpl {
	@Autowired   UserRepository  userRepository ;

	public void resisterUser(User user) {
	 userRepository.save(user);
		
		
	}

}
