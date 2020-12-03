package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeadsPage extends ProjectSpecificMethods

{
	
	public FindLeadsPage(ChromeDriver driver)
	{
		
		this.driver = driver;
	}
	
	public FindLeadsPage clickPhone()
	{
		
		
		driver.findElementByXPath(prop.getProperty("FindLeads.ClickP.XPath")).click();
		
		return this;
	}
	
	public FindLeadsPage enterPhoneNum(String PNum)
	
	{
		driver.findElementByXPath(prop.getProperty("FindLeads.PNum.XPath")).sendKeys(PNum);
		
		return this;
		
	}
	
	public FindLeadsPage clickFindLeads() {
		
		driver.findElementByXPath(prop.getProperty("FindLeads.ClickF.XPath")).click();
		
		return this;
	}
	
	public ViewLeadPage clickonlead()
	
	{
		
		
		WebElement ele = driver.findElementByXPath(prop.getProperty("FindLeads.ClickL.XPath"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].click();", ele);
		
		return new ViewLeadPage(driver);
	}
	
}