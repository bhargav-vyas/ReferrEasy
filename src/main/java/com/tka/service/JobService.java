package com.tka.service;

import java.util.List;

import com.tka.entity.Job;

public interface JobService {
	 Job createJob(Job job);
	    List<Job> getAllJobs();
	    Job getJobById(Long id);
	    Job updateJob(Long id, Job job);
	

	
}
