package com.healthCare.domainModal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value value
	private int product_id;

	@Column
	private String product_name;

	@Column
	private String batch_no;

	@Column
	private Date manufacturing_date;

	@Column
	private int no_of_box;

	@Column
	private int no_of_strip_in_box;

	@Column
	private int total_strips;

	@Column
	private Date expiary_date;

	@Column
	private boolean in_stock;
	
	@Column
	private int in_stock_count_value;

	@Column
	private double strip_mrp;

	@Column
	private double box_mrp;

	@Column
	private double sale_value;

	@Column
	private String composition;
	
	@Column
	private String strength;
	
	public product() {
	}

	public product(int product_id, String product_name, String batch_no, Date manufacturing_date, int no_of_box,
			int no_of_strip_in_box, int total_strips, Date expiary_date, boolean in_stock, int in_stock_count_value,
			double strip_mrp, double box_mrp, double sale_value, String composition, String strength) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.batch_no = batch_no;
		this.manufacturing_date = manufacturing_date;
		this.no_of_box = no_of_box;
		this.no_of_strip_in_box = no_of_strip_in_box;
		this.total_strips = total_strips;
		this.expiary_date = expiary_date;
		this.in_stock = in_stock;
		this.in_stock_count_value = in_stock_count_value;
		this.strip_mrp = strip_mrp;
		this.box_mrp = box_mrp;
		this.sale_value = sale_value;
		this.composition = composition;
		this.strength = strength;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getBatch_no() {
		return batch_no;
	}

	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}

	public Date getManufacturing_date() {
		return manufacturing_date;
	}

	public void setManufacturing_date(Date manufacturing_date) {
		this.manufacturing_date = manufacturing_date;
	}

	public int getNo_of_box() {
		return no_of_box;
	}

	public void setNo_of_box(int no_of_box) {
		this.no_of_box = no_of_box;
	}

	public int getNo_of_strip_in_box() {
		return no_of_strip_in_box;
	}

	public void setNo_of_strip_in_box(int no_of_strip_in_box) {
		this.no_of_strip_in_box = no_of_strip_in_box;
	}

	public int getTotal_strips() {
		return total_strips;
	}

	public void setTotal_strips(int total_strips) {
		this.total_strips = total_strips;
	}

	public Date getExpiary_date() {
		return expiary_date;
	}

	public void setExpiary_date(Date expiary_date) {
		this.expiary_date = expiary_date;
	}

	public boolean getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(boolean in_stock) {
		this.in_stock = in_stock;
	}

	public int getIn_stock_count_value() {
		return in_stock_count_value;
	}

	public void setIn_stock_count_value(int in_stock_count_value) {
		this.in_stock_count_value = in_stock_count_value;
	}

	public double getStrip_mrp() {
		return strip_mrp;
	}

	public void setStrip_mrp(double strip_mrp) {
		this.strip_mrp = strip_mrp;
	}

	public double getBox_mrp() {
		return box_mrp;
	}

	public void setBox_mrp(double box_mrp) {
		this.box_mrp = box_mrp;
	}

	public double getSale_value() {
		return sale_value;
	}

	public void setSale_value(double sale_value) {
		this.sale_value = sale_value;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}
	
	
}
