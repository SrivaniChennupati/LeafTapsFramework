package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	
	
	public CreateLeadPage clickCreateLead()
	
	{
		
		driver.findElementByLinkText("Create Lead").click();
		
		return new CreateLeadPage();
		
	}
	
	public FindLeadsPage clickFindLeads() {
		
		driver.findElementByLinkText("Find Leads").click();
		
		return  new FindLeadsPage();
		
	}

	
	

}
