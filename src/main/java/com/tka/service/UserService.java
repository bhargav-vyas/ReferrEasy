package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.tka.DTO.UserDTO;
import com.tka.entity.User;
import com.tka.repository.UserRepository;

public interface UserService {
	

	void resisterUser(User user);
//	boolean loginUser(String username, String pasword);
	List<User> getAllUsers();
	User getUserById(Long id);
	void deletUserById(Long id);
	boolean loginUser (UserDTO userDTO);
	

}
