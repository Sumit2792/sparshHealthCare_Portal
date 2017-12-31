package com.healthCare.domainModal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="license")
public class license {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value
	private int license_id;

	@Column
	private int site_id;

	@Column
	private String site_license_noA;

	@Column
	private String site_license_noB;

	@Column
	private Date license_expires_on;
	
	public license() {
	}

	public license(int license_id, int site_id, String site_license_noA, String site_license_noB,
			Date license_expires_on) {
		super();
		this.license_id = license_id;
		this.site_id = site_id;
		this.site_license_noA = site_license_noA;
		this.site_license_noB = site_license_noB;
		this.license_expires_on = license_expires_on;
	}

	public int getLicense_id() {
		return license_id;
	}

	public void setLicense_id(int license_id) {
		this.license_id = license_id;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
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

	
}
