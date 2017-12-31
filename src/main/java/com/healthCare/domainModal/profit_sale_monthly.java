package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profit_sale_monthly")
public class profit_sale_monthly {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int invoice_id;

	@Column
	private String month_year;

	@Column
	private double asset_value_monthly;

	@Column
	private double sale_value_monthly;

	@Column
	private double expense_value_monthly;

	@Column
	private double final_asset_value_monthly;

	@Column
	private double profit_value_monthly;

	@Column
	private double balance_sheet_monthly;
	
	public profit_sale_monthly() {
	}

	public profit_sale_monthly(int invoice_id, String month_year, double asset_value_monthly, double sale_value_monthly,
			double expense_value_monthly, double final_asset_value_monthly, double profit_value_monthly,
			double balance_sheet_monthly) {
		super();
		this.invoice_id = invoice_id;
		this.month_year = month_year;
		this.asset_value_monthly = asset_value_monthly;
		this.sale_value_monthly = sale_value_monthly;
		this.expense_value_monthly = expense_value_monthly;
		this.final_asset_value_monthly = final_asset_value_monthly;
		this.profit_value_monthly = profit_value_monthly;
		this.balance_sheet_monthly = balance_sheet_monthly;
	}

	public int getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}

	public String getMonth_year() {
		return month_year;
	}

	public void setMonth_year(String month_year) {
		this.month_year = month_year;
	}

	public double getAsset_value_monthly() {
		return asset_value_monthly;
	}

	public void setAsset_value_monthly(double asset_value_monthly) {
		this.asset_value_monthly = asset_value_monthly;
	}

	public double getSale_value_monthly() {
		return sale_value_monthly;
	}

	public void setSale_value_monthly(double sale_value_monthly) {
		this.sale_value_monthly = sale_value_monthly;
	}

	public double getExpense_value_monthly() {
		return expense_value_monthly;
	}

	public void setExpense_value_monthly(double expense_value_monthly) {
		this.expense_value_monthly = expense_value_monthly;
	}

	public double getFinal_asset_value_monthly() {
		return final_asset_value_monthly;
	}

	public void setFinal_asset_value_monthly(double final_asset_value_monthly) {
		this.final_asset_value_monthly = final_asset_value_monthly;
	}

	public double getProfit_value_monthly() {
		return profit_value_monthly;
	}

	public void setProfit_value_monthly(double profit_value_monthly) {
		this.profit_value_monthly = profit_value_monthly;
	}

	public double getBalance_sheet_monthly() {
		return balance_sheet_monthly;
	}

	public void setBalance_sheet_monthly(double balance_sheet_monthly) {
		this.balance_sheet_monthly = balance_sheet_monthly;
	}
	
	
}
