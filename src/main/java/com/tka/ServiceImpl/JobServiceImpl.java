package com.tka.ServiceImpl;

import java.lang.classfile.ClassFile.Option;
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

	public Job updatejob(Long id, Job job) {
		Option<JOb>
		return null;
	}

}
