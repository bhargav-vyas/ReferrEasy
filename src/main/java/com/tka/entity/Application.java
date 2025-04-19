package com.tka.entity;

import java.time.LocalDateTime;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name ="application")
@Entity
public class Application {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long id;
	private String status ="prndig";
	private LocalDateTime appliedAt;
	@ManyToOne
	@JoinColumn(name ="job_id")
	private Job job ;
	@ManyToOne
	@JoinColumn(name ="user_id")
	private  User user;

}
