package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.role;

public interface roleDO {

	public void add(role role_Details);
	public void edit(role role_Details);
	public void delete(role role_Details);
	public role getRoleDetails(int role_id);
	public List getAllRoleDetails();

}
