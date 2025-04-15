package com.tka.ServiceImpl;


import java.util.List;
import java.util.Optional;

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

	public Optional<Job> getjobById(Long id) {
		return jobrepository.findById(id) ;
	}

	public Job updatejob(Long id, Job updatedJob) {
		Optional<Job> optional = jobrepository.findById(id); 
		if (optional.isPresent()){
			Job existingJob = optional.get();
			existingJob.setTitle(updatedJob.getTitle());
			existingJob.setCompany(updatedJob.getCompany());
			existingJob.setDescription(updatedJob.getDescription());
			existingJob.setLocation(updatedJob.getLocation());
			existingJob.setPostedDate(updatedJob.getPostedDate());
			return jobrepository.save(existingJob);
		}else {
			return  null ;
			
		}
	
	}

}
