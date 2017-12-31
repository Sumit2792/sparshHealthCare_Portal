package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class user_role {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int enduser_id;

	@Column
	private int role_id;
	
	public user_role() {
	}

	public user_role(int enduser_id, int role_id) {
		super();
		this.enduser_id = enduser_id;
		this.role_id = role_id;
	}

	public int getEnduser_id() {
		return enduser_id;
	}

	public void setEnduser_id(int enduser_id) {
		this.enduser_id = enduser_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	

}
