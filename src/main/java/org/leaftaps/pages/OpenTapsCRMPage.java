package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class OpenTapsCRMPage extends ProjectSpecificMethods
{

	public OpenTapsCRMPage updateCompanyName(String CName) {
		
		
		driver.findElementById("updateLeadForm_companyName").clear();
		
		driver.findElementById("updateLeadForm_companyName").sendKeys(CName);
		return this;
	}
	
	
	public ViewLeadPage clickSubmit()
	{
		
		driver.findElementByName("submitButton").click();
		 return new ViewLeadPage();
		
	}


}
