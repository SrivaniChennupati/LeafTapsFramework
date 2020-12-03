package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.leaftaps.pages.CreateLeadPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver)
	{
		
		this.driver = driver;
	}

	public CreateLeadPage clickCreateLead() {
		
		driver.findElementByLinkText(prop.getProperty("MyLeads.ClickC.LinkText")).click();
		
		return new CreateLeadPage(driver);
		

	}
	
	public FindLeadsPage clickFindLeads()
	
	{
		
		driver.findElementByLinkText(prop.getProperty("MyLeads.ClickF.LinkText")).click();
		
		return new FindLeadsPage(driver);
	}
	
	

}
