package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class role {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int role_id;

	@Column
	private String role;
	
	public role() {
	}

	public role(int role_id, String role) {
		super();
		this.role_id = role_id;
		this.role = role;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
