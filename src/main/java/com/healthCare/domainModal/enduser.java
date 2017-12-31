package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enduser")
public class enduser {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value
	private int enduser_id;

	@Column
	private String username;

	@Column
	private String email;

	@Column
	private String firstname;

	@Column
	private String lastname;

	@Column
	private String password;

	@Column
	private String confirm_password;

	@Column
	private String address;

	@Column
	private int contact_no;

	public enduser() {
	}

	public enduser(int enduser_id, String username, String email, String firstname, String lastname, String password,
			String confirm_password, String address, int contact_no) {
		super();
		this.enduser_id = enduser_id;
		this.username = username;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.confirm_password = confirm_password;
		this.address = address;
		this.contact_no = contact_no;
	}

	public int getEnduser_id() {
		return enduser_id;
	}

	public void setEnduser_id(int enduser_id) {
		this.enduser_id = enduser_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPasword() {
		return password;
	}

	public void setPasword(String pasword) {
		this.password = pasword;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact_no() {
		return contact_no;
	}

	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}

}
