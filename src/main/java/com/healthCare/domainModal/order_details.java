package com.healthCare.domainModal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class order_details {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value value
	private int order_id;

	@Column
	private int site_id;

	@Column
	private Date order_date;
	
	public order_details() {
	}

	public order_details(int order_id, int site_id, Date order_date) {
		super();
		this.order_id = order_id;
		this.site_id = site_id;
		this.order_date = order_date;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	
	
}
