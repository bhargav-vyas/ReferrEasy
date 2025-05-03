package com.tka.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DTO.UserDTO;
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
	public boolean loginUser(UserDTO userDTO) {
	    List<User> users = userRepository.findByUsername(userDTO.getUsername());

	    if (users.size() == 1) {
	        User user = users.get(0);
	        return user.getPassword().equals(userDTO.getPassword());
	    }

	    // Handle case: no user or multiple users with the same username
	    return false;
	}

	public List<User> getAlluser() {
		return userRepository.findAll();
	}
	public void deletById(Long id) {
		 userRepository.deleteById(id);
		
	}
}
