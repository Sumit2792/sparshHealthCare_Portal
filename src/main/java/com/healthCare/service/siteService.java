package com.healthCare.service;

import java.util.List;

import com.healthCare.domainModal.site;

public interface siteService {

	public void add(site site_Details);
	public void edit(site site_Details);
	public void delete(site site_Details);
	public site geSiteDetails(int site_id);
	public List getAllSiteDetails();

}
