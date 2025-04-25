package com.tka.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Referral;

public interface Referalrepositopryt extends  JpaRepository<Referral,Long>{

	List<Referral> findByReferredEmail(String email);


}
