package TC;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;

public class CreateLead  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	
	public void setData()
	
	{
		
		excelName = "TC002_CreateLead" ;
	}
	
	
	
   @Test (dataProvider = "getData")
   
	public void createLead(String UName ,String Pwd,String CName,String FName,String LName,String PNum) {
		
		
		new LoginPage(driver).enterUserName(UName).enterPassword(Pwd).clickLogin().clickCRMFSA1().clickLeads().clickCreateLead();
		
		new CreateLeadPage(driver).enterCompanyName(CName).enterFirstName(FName).enterLastName(LName).enterPhoneNumber(PNum).clickCreateLead();

	}

}
