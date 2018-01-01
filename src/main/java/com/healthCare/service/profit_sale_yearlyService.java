package com.healthCare.service;

import java.util.List;

import com.healthCare.domainModal.profit_sale_yearly;

public interface profit_sale_yearlyService {

	public void add(profit_sale_yearly profit_sale_yearly_Details);
	public void edit(profit_sale_yearly profit_sale_yearly_Details);
	public void delete(profit_sale_yearly profit_sale_yearly_Details);
	public profit_sale_yearly getProfitSaleYearlyDetails(int invoice_id);
	public List getAllProfitSaleYearlyDetails();

}
