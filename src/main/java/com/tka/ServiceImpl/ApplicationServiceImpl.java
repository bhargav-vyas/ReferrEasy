package com.tka.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.entity.Application;
import com.tka.repository.ApplicationRepository;

public class ApplicationServiceImpl {
	@Autowired
	private ApplicationRepository applicationRepository;

	public Application applyToJob(Long userId, Long jobId) {
		return null;
	}

}
