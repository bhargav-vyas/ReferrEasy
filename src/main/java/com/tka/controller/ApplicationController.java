package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.ServiceImpl.ApplicationServiceImpl;

public class ApplicationController {

	@Autowired 
	private ApplicationServiceImpl  applicationServiceImpl; 
}
