package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

import leaftaps.org.design.WebElement;

public class HomePage  extends ProjectSpecificMethods{
	
	
	public LoginPage clickLogOut()
	
	
	{
		
		
		  WebElement ele = inspectElement("ClassName","decorativeSubmit" );
		  
		  click(ele);
		
		
	       return  new LoginPage(driver);
		
		}
	
	
	public MyHomePage clickcrmfsa()
	
	
	{
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage(driver);
		
	}

}
