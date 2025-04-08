package com.tka.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.User;
import com.tka.repository.UserRepository;

import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl {
	@Autowired   UserRepository  userRepository ;

	public void resisterUser(User user) {
	 userRepository.save(user);	
	}
	@Transactional
	public User getUserById(Long id) {
		return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
	}
	public boolean loginUser(String username, String password) {
		Optional<User> optionalUser = userRepository.findByUserName(username);
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
			return user.getPassword().equals(password);
		}
		return false;
	}

}
