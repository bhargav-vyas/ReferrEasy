package com.tka.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Referral;
import com.tka.repository.Referalrepositopryt;
@Service
public class ReferralServiceImpl {
	@Autowired Referalrepositopryt referalrepositopryt;

	public Referral  createReferral(Referral referral) {
		return referalrepositopryt.save(referral);
	}
	
	
}
