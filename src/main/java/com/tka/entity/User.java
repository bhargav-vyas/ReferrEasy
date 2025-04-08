package com.tka.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name ="users")

public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Column(unique = true)
	 private String username;
	  private String password;
	  private String role;
	  @OneToMany(mappedBy = "user" ,cascade =CascadeType.ALL ,fetch = FetchType.LAZY)
	  @JsonIgnore
	  private List<Referral> Referals;

}
