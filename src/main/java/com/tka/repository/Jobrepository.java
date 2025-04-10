package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.job;

public interface Jobrepository  extends JpaRepository<job, Long>{
 
}
