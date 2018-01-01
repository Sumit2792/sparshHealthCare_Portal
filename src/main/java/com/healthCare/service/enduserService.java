package com.healthCare.service;

import java.util.List;

import com.healthCare.domainModal.enduser;

public interface enduserService {

	public void add(enduser eUser);
	public void edit(enduser eUser);
	public void delete(enduser eUser);
	public enduser getEnduserDetails(int enduser_id);
	public List getAllEnduserDetails();

}
