package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods{
	
	
	public LoginPage clickLogOut()
	
	
	{
		
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		return new LoginPage();
		
		}
	
	
	public MyHomePage clickcrmfsa()
	
	
	{
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage();
		
	}

}
