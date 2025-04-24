package com.tka.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application,Long>{
	
	List<Application> findByuserId(Long userId);

	List<Application> findByJobId(Long jobId);

	
}
