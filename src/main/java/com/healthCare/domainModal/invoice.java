package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class invoice {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int invoice_id;

	@Column
	private int order_id;

	@Column
	private double quantity;

	@Column
	private double free_Quantity;

	@Column
	private double total_Quantity;

	@Column
	private double tax;

	@Column
	private String packing;

	@Column
	private String batch_no;

	@Column
	private double mrp;
	
	@Column
	private double sale_value;

	@Column
	private double discount_allowed;

	@Column
	private double particular_amount;

	@Column
	private double total_gross_amount;

	@Column
	private double total_mrp_value;
	
	public invoice() {
	}
	
	public invoice(int invoice_id, int order_id, double quantity, double free_Quantity, double total_Quantity,
			double tax, String packing, String batch_no, double mrp, double sale_value, double discount_allowed,
			double particular_amount, double total_gross_amount, double total_mrp_value) {
		super();
		this.invoice_id = invoice_id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.free_Quantity = free_Quantity;
		this.total_Quantity = total_Quantity;
		this.tax = tax;
		this.packing = packing;
		this.batch_no = batch_no;
		this.mrp = mrp;
		this.sale_value = sale_value;
		this.discount_allowed = discount_allowed;
		this.particular_amount = particular_amount;
		this.total_gross_amount = total_gross_amount;
		this.total_mrp_value = total_mrp_value;
	}

	public int getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getFree_Quantity() {
		return free_Quantity;
	}

	public void setFree_Quantity(double free_Quantity) {
		this.free_Quantity = free_Quantity;
	}

	public double getTotal_Quantity() {
		return total_Quantity;
	}

	public void setTotal_Quantity(double total_Quantity) {
		this.total_Quantity = total_Quantity;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public String getBatch_no() {
		return batch_no;
	}

	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public double getSale_value() {
		return sale_value;
	}

	public void setSale_value(double sale_value) {
		this.sale_value = sale_value;
	}

	public double getDiscount_allowed() {
		return discount_allowed;
	}

	public void setDiscount_allowed(double discount_allowed) {
		this.discount_allowed = discount_allowed;
	}

	public double getParticular_amount() {
		return particular_amount;
	}

	public void setParticular_amount(double particular_amount) {
		this.particular_amount = particular_amount;
	}

	public double getTotal_gross_amount() {
		return total_gross_amount;
	}

	public void setTotal_gross_amount(double total_gross_amount) {
		this.total_gross_amount = total_gross_amount;
	}

	public double getTotal_mrp_value() {
		return total_mrp_value;
	}

	public void setTotal_mrp_value(double total_mrp_value) {
		this.total_mrp_value = total_mrp_value;
	}

}
