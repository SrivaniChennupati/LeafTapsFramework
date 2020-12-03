package org.leaftaps.testcases;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_EditLead extends ProjectSpecificMethods {
	
	@BeforeTest
	
	public void setData()
	{
		 
		excelName = "TC003_EditLead" ;
		
		
	}

	
	
	@Test (dataProvider = "getData")
	public void editLead(String uname , String pwd,String PNum ,String CName) throws InterruptedException {
		
		new LoginPage().enterUserName(uname).enterPassWord(pwd).clickLogin().
		clickcrmfsa().clickLeads().clickFindLeads().clickOnPhone().
		enterPhoneNumber(PNum).clickFindLeads().clickOnLeadId().clickEdit().updateCompanyName(CName).clickSubmit();
		
		
		
		

	}

}

