package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ServiceImpl.ReferralServiceImpl;
import com.tka.entity.Referral;

@RestController
@RequestMapping("/api/referrals")
public class Referralcontroller {	
	@Autowired
	private ReferralServiceImpl referralServiceImpl;
	
	@PostMapping("/createReferral")
	public String   createReferral(@RequestBody Referral referral) {
		 referralServiceImpl.createReferral(referral);
		 return "the referral is created";
	}
	@GetMapping("/getAllReferrals")
	public List<Referral> getAllReferrals(){
		return referralServiceImpl.getAllReferra();
		
	}
}
  