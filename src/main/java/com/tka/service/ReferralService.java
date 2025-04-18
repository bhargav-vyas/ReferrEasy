package com.tka.service;

import java.util.List;

import com.tka.entity.Referral;

public interface ReferralService {
	Referral createReferral(Referral referral);
	List<Referral> getallReferals();
	Referral getReferralById(Long id);


}
