package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application,Long>{

	
}
