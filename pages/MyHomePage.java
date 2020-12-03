package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class MyHomePage  extends ProjectSpecificMethods{

	public MyLeadsPage clickLeads() {
		
		  {
			  
			 
			  driver.findElementByLinkText("Leads").click();
			  
			  return new MyLeadsPage();
			  
	}

	
}
}