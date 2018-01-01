package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.product;

public interface productDO {

	public void add(product product_Details);
	public void edit(product product_Details);
	public void delete(product product_Details);
	public product getproductDetails(int product_id);
	public List getAllproductDetails();

}
