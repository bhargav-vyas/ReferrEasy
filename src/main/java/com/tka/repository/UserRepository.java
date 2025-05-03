package com.tka.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
