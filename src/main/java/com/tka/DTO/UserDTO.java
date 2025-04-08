package com.tka.DTO;

import java.util.Objects;

import com.tka.entity.User;

public class UserDTO {
	private Long id;
	private String  username;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
