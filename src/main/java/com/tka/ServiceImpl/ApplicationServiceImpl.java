package com.tka.ServiceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.entity.Application;
import com.tka.entity.Job;
import com.tka.entity.User;
import com.tka.repository.ApplicationRepository;
import com.tka.repository.Jobrepository;
import com.tka.repository.UserRepository;
@Service
public class ApplicationServiceImpl {
	@Autowired
	private ApplicationRepository applicationRepository;

	@Autowired
	private  UserRepository userRepository;
	@Autowired
	private Jobrepository jobrepository;
	
	
	public Application applyToJob(Long userId, Long jobId) { 
		User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("user not found"));
		Job job = jobrepository.findById(jobId).orElseThrow(() -> new RuntimeException("Job not found"));
		Application application = new Application();
		application.setUser(user);
		application.setJob(job);
		application.setAppliedAt(LocalDateTime.now());
		application.setStatus("pending");
		return applicationRepository.save(application) ;
		
		

	}
	public List<Application> getApplicationByUser( Long userId) {
		return applicationRepository.findByuserId(userId);
	}

}
