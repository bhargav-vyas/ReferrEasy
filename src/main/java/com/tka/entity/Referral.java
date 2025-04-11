package com.tka.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table()
public class Referral {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@ManyToOne
    @JoinColumn(name = "user_id")
	@JsonIgnore
    private User user;
	@ManyToOne
	@JoinColumn(name ="job_id")
	private Job job;
	private String referredEmail;
	  private LocalDateTime referredAt;
	  private String message;
	  
}
