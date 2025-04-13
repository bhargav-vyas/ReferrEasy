package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ServiceImpl.JobServiceImpl;
import com.tka.entity.Job;

@RestController
@RequestMapping("/api/job")
public class Jobcontroller {

	@Autowired
	private  JobServiceImpl jobServiceImpl;
	

	@PostMapping("/create")
	public Job create(@RequestBody Job job) {
		return jobServiceImpl.createJob(job);
		
	}
	@GetMapping("/getAll")
	public List<Job> getAlljob(){
		return jobServiceImpl.getAlljob();
		
	}
	@GetMapping("/{id}")
	public Optional<Job> getjobById(@PathVariable Long id) {
		return jobServiceImpl.getjobById(id);
	}
	@PutMapping("/{id}")
	public  Job updatejob(@PathVariable Long id , @RequestBody Job job) {
		return jobServiceImpl.updatejob(id,job);
		
	}
	
	
	
	
}
	