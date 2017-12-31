package com.healthCare.domainModal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="site")
public class site {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int site_id;

	@Column
	private int enduser_id;

	@Column
	private String site_name;

	@Column
	private String site_license_noA;

	@Column
	private String site_license_noB;

	@Column
	private Date license_expires_on;

	@Column
	private String address;
	
	public site() {
	}

	public site(int site_id, int enduser_id, String site_name, String site_license_noA, String site_license_noB,
			Date license_expires_on, String address) {
		super();
		this.site_id = site_id;
		this.enduser_id = enduser_id;
		this.site_name = site_name;
		this.site_license_noA = site_license_noA;
		this.site_license_noB = site_license_noB;
		this.license_expires_on = license_expires_on;
		this.address = address;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public int getEnduser_id() {
		return enduser_id;
	}

	public void setEnduser_id(int enduser_id) {
		this.enduser_id = enduser_id;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getSite_license_noA() {
		return site_license_noA;
	}

	public void setSite_license_noA(String site_license_noA) {
		this.site_license_noA = site_license_noA;
	}

	public String getSite_license_noB() {
		return site_license_noB;
	}

	public void setSite_license_noB(String site_license_noB) {
		this.site_license_noB = site_license_noB;
	}

	public Date getLicense_expires_on() {
		return license_expires_on;
	}

	public void setLicense_expires_on(Date license_expires_on) {
		this.license_expires_on = license_expires_on;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
