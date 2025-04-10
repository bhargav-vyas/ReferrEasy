package com.tka.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class job {
		private Long id;
		private String title;
		private String company;
		private String description;
		private String location;
		private String postedDate;

}
