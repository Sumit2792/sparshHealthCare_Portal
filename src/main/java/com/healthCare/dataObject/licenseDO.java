package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.license;

public interface licenseDO {

	public void add(license license_Details);
	public void edit(license license_Details);
	public void delete(license license_Details);
	public license getLicenseDetails(int license_id);
	public List getAllLicenseDetails();

}
