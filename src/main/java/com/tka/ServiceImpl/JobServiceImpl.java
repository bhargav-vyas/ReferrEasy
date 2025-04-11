package com.tka.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.entity.Job;
import com.tka.repository.Jobrepository;

public class JobServiceImpl {
@Autowired  
private Jobrepository jobrepository;

	public Job createJob(Job job) {

		return jobrepository.save(job);
	}

}
