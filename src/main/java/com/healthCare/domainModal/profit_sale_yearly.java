package com.healthCare.domainModal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profit_sale_yearly")
public class profit_sale_yearly {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto generation key value													// value
	private int invoice_id;

	@Column
	private String financial_year;

	@Column
	private double asset_value_yearly;

	@Column
	private double sale_value_yearly;

	@Column
	private double expense_value_yearly;

	@Column
	private double final_asset_value_yearly;

	@Column
	private double profit_value_yearly;

	@Column
	private double balance_sheet_yearly;
	
	public profit_sale_yearly() {
	}

	public profit_sale_yearly(int invoice_id, String financial_year, double asset_value_yearly,
			double sale_value_yearly, double expense_value_yearly, double final_asset_value_yearly,
			double profit_value_yearly, double balance_sheet_yearly) {
		super();
		this.invoice_id = invoice_id;
		this.financial_year = financial_year;
		this.asset_value_yearly = asset_value_yearly;
		this.sale_value_yearly = sale_value_yearly;
		this.expense_value_yearly = expense_value_yearly;
		this.final_asset_value_yearly = final_asset_value_yearly;
		this.profit_value_yearly = profit_value_yearly;
		this.balance_sheet_yearly = balance_sheet_yearly;
	}

	public int getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}

	public String getFinancial_year() {
		return financial_year;
	}

	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
	}

	public double getAsset_value_yearly() {
		return asset_value_yearly;
	}

	public void setAsset_value_yearly(double asset_value_yearly) {
		this.asset_value_yearly = asset_value_yearly;
	}

	public double getSale_value_yearly() {
		return sale_value_yearly;
	}

	public void setSale_value_yearly(double sale_value_yearly) {
		this.sale_value_yearly = sale_value_yearly;
	}

	public double getExpense_value_yearly() {
		return expense_value_yearly;
	}

	public void setExpense_value_yearly(double expense_value_yearly) {
		this.expense_value_yearly = expense_value_yearly;
	}

	public double getFinal_asset_value_yearly() {
		return final_asset_value_yearly;
	}

	public void setFinal_asset_value_yearly(double final_asset_value_yearly) {
		this.final_asset_value_yearly = final_asset_value_yearly;
	}

	public double getProfit_value_yearly() {
		return profit_value_yearly;
	}

	public void setProfit_value_yearly(double profit_value_yearly) {
		this.profit_value_yearly = profit_value_yearly;
	}

	public double getBalance_sheet_yearly() {
		return balance_sheet_yearly;
	}

	public void setBalance_sheet_yearly(double balance_sheet_yearly) {
		this.balance_sheet_yearly = balance_sheet_yearly;
	}
	
	
}
