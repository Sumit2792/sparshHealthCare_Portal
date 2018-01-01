package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.order_details;

public interface order_DetailsDO {

	public void add(order_details ODetails);
	public void edit(order_details ODetails);
	public void delete(order_details ODetails);
	public order_details getOrderDetails(int order_id);
	public List getAllOrderDetails();

}
