package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ServiceImpl.ReferralServiceImpl;

@RestController
@RequestMapping("/api/referrals")
public class Referralcontroller {	
	@Autowired
	private ReferralServiceImpl referralServiceImpl;
}
  