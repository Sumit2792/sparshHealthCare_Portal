package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.total_amount;

public interface total_amountDO {

	public void add(total_amount tAmountDetails);
	public void edit(total_amount tAmountDetails);
	public void delete(total_amount tAmountDetails);
	public total_amount getTotalAmountDetails(int order_id);
	public List getAllTotalAmountDetails();

}
