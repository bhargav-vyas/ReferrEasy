package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ServiceImpl.JobServiceImpl;

@RestController
@RequestMapping("/job")
public class Jobcontroller {

	@Autowired
	private  JobServiceImpl jobServiceImpl;
}
