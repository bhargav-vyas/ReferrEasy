package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
