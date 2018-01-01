package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.profit_sale_monthly;

public interface profit_sale_monthlyDO {

	public void add(profit_sale_monthly profit_sale_monthly_Details);
	public void edit(profit_sale_monthly profit_sale_monthly_Details);
	public void delete(profit_sale_monthly profit_sale_monthly_Details);
	public profit_sale_monthly getProfitSaleMonthlyDetails(int invoice_id);
	public List getAllProfitSaleMonthlyDetails();

}
