package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	
	public CreateLeadPage(ChromeDriver driver)
	
	{
		
		this.driver = driver;
	}

	public CreateLeadPage enterCompanyName(String CName) {
		
		
		driver.findElementById(prop.getProperty("CreateLead.CName.id")).sendKeys(CName);
		
		return this;
		

	}
	
	public CreateLeadPage enterFirstName(String FName)
	
	{
		driver.findElementById(prop.getProperty("CreateLead.FName.id")).sendKeys(FName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String LName)
	
	{
		driver.findElementById(prop.getProperty("CreateLead.LName.id")).sendKeys(LName);
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber(String PNum)
	{
		
		driver.findElementById(prop.getProperty("CreateLead.PNum.id")).sendKeys(PNum);
		
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	
	{
		
		driver.findElementByName(prop.getProperty("CreateLead.ClickC.Names")).click();
		return new ViewLeadPage(driver);
	}

}
