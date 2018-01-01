package com.healthCare.service;

import java.util.List;

import com.healthCare.domainModal.product;

public interface productService {

	public void add(product product_Details);
	public void edit(product product_Details);
	public void delete(product product_Details);
	public product getproductDetails(int product_id);
	public List getAllproductDetails();

}
