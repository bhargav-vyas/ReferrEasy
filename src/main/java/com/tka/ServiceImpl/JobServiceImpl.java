package com.tka.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Job;
import com.tka.repository.Jobrepository;
@Service
public class JobServiceImpl {
@Autowired  
private Jobrepository jobrepository;

	public Job createJob(Job job) {

		return jobrepository.save(job);
	}

	public List<Job> getAlljob() {
		return jobrepository.findAll();
	}

	public Job getjobById() {
		return fin;
	}

}
