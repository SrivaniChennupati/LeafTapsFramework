package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class ViewLeadPage  extends ProjectSpecificMethods{

	

	public OpenTapsCRMPage clickEdit() {
		
		driver.findElementByLinkText("Edit").click();
		return new OpenTapsCRMPage();
	
	}
	
	public MyLeadsPage clickDelete()
	{
		
		driver.findElementByLinkText("Delete").click();
		
		return new MyLeadsPage();
		
	}
	

}
