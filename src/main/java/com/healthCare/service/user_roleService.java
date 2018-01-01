package com.healthCare.service;

import java.util.List;

import com.healthCare.domainModal.user_role;

public interface user_roleService {

	public void add(user_role URoleDetails);
	public void edit(user_role URoleDetails);
	public void delete(user_role URoleDetails);
	public user_role getUserRoleDetails(int enduser_id);
	public List getAllUserRoleDetails();

}
