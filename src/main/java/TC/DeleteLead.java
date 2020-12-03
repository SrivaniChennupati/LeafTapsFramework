package TC;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setData()
	
	{
		
		
		excelName = "TC004_DeleteLead" ;
	}
	
	
	

	
	@Test(dataProvider = "getData")
	
	public void deleteLead(String UName, String Pwd, String PNum) {
		
		new LoginPage(driver).enterUserName(UName).enterPassword(Pwd).clickLogin().clickCRMFSA1().clickLeads().
		clickFindLeads().clickPhone().enterPhoneNum(PNum).clickFindLeads();
		
		new FindLeadsPage(driver).clickonlead().deleteLead();
		
		
		
		
		
		

	}

}
