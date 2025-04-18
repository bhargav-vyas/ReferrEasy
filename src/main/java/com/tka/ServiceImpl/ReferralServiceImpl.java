package com.tka.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.entity.Referral;
import com.tka.repository.Referalrepositopryt;

public class ReferralServiceImpl {
	@Autowired Referalrepositopryt referalrepositopryt;

	public Referral  createReferral(Referral referral) {
		return referalrepositopryt.save(referral);
	}
	
}
