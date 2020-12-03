package org.leaftaps.testcases;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	
	public void setData()
	
	{
		
		excelName = "TC001_LoginLogout";
		
		
	}


	@Test (dataProvider = "getData")
	
	public void loginLogOut(String uname ,String pwd) {
		
		
		new LoginPage(driver).enterUserName(uname).enterPassWord(pwd).clickLogin().clickLogOut();
	
		

	}

}
