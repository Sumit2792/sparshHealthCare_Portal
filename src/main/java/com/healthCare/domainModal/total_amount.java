package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="total_amount")
public class total_amount {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int order_id;

	@Column
	private double total_gross_amount;

	@Column
	private double less_discount;

	@Column
	private double additional_VAT;

	@Column
	private double other_adjustments;

	@Column
	private double net_amount;
	
	public total_amount() {
	}

	public total_amount(int order_id, double total_gross_amount, double less_discount, double additional_VAT,
			double other_adjustments, double net_amount) {
		super();
		this.order_id = order_id;
		this.total_gross_amount = total_gross_amount;
		this.less_discount = less_discount;
		this.additional_VAT = additional_VAT;
		this.other_adjustments = other_adjustments;
		this.net_amount = net_amount;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public double getTotal_gross_amount() {
		return total_gross_amount;
	}

	public void setTotal_gross_amount(double total_gross_amount) {
		this.total_gross_amount = total_gross_amount;
	}

	public double getLess_discount() {
		return less_discount;
	}

	public void setLess_discount(double less_discount) {
		this.less_discount = less_discount;
	}

	public double getAdditional_VAT() {
		return additional_VAT;
	}

	public void setAdditional_VAT(double additional_VAT) {
		this.additional_VAT = additional_VAT;
	}

	public double getOther_adjustments() {
		return other_adjustments;
	}

	public void setOther_adjustments(double other_adjustments) {
		this.other_adjustments = other_adjustments;
	}

	public double getNet_amount() {
		return net_amount;
	}

	public void setNet_amount(double net_amount) {
		this.net_amount = net_amount;
	}
	
	

}
