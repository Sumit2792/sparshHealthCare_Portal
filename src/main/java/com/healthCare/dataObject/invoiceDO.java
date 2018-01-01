package com.healthCare.dataObject;

import java.util.List;

import com.healthCare.domainModal.invoice;

public interface invoiceDO {

	public void add(invoice invoice_Details);
	public void edit(invoice invoice_Details);
	public void delete(invoice invoice_Details);
	public invoice getInvoiceDetails(int invoice_id);
	public List getAllInvoiceDetails();

}
