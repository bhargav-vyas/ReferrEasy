package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="Job")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String title;
		private String company;
		private String description;
		private String location;
		private String postedDate;

}
