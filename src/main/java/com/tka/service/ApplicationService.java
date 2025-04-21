package com.tka.service;

import java.util.List;

import com.tka.entity.Application;

public interface ApplicationService {

	Application applyTojob(Long userId,Long jobId);
	
	List<Application> getApplicationByUser(Long userId);
	
	List<Application> getApplicationForjob(Long jobId);
	
}
