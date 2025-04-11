package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Job;

public interface Jobrepository  extends JpaRepository<Job, Long>{
 
}
