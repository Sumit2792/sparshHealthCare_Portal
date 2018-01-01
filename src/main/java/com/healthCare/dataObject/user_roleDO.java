package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.user_role;

public interface user_roleDO {

	public void add(user_role URoleDetails);
	public void edit(user_role URoleDetails);
	public void delete(user_role URoleDetails);
	public user_role getUserRoleDetails(int enduser_id);
	public List getAllUserRoleDetails();

}
