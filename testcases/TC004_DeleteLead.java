package org.leaftaps.testcases;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004_DeleteLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setData()
	
	{
		
		
		excelName = "TC004_DeleteLead" ;
	}
	
	
	
	@Test (dataProvider = "getData")
	public void deleteLead(String uname ,String pwd,String PNum) throws InterruptedException  {
		
		
		new LoginPage().enterUserName(uname).enterPassWord(pwd).clickLogin().clickcrmfsa().
		clickLeads().clickFindLeads().clickOnPhone().enterPhoneNumber(PNum).
		clickFindLeads().clickOnLeadId().clickDelete();
		
		

	}

}
