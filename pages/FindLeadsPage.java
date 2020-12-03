package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{

	public FindLeadsPage clickOnPhone() {
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[2]").click();
		
		return this;
		
		}
	
	public FindLeadsPage enterPhoneNumber(String PNum) {
		
		
		driver.findElementByName("phoneNumber").sendKeys(PNum);
		return this;
		
		
	}
	
	public FindLeadsPage clickFindLeads()
	{
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public ViewLeadPage clickOnLeadId() throws InterruptedException
	{
		
		Thread.sleep(10000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLeadPage();
	}
	
	

}
