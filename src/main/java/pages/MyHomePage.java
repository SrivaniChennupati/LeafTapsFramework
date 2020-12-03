package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(ChromeDriver driver)
	
	{
		
		this.driver= driver;
	}

	public MyLeadsPage clickLeads() {
		
		driver.findElementByLinkText(prop.getProperty("MyHome.clickL.LinkText")).click();
		
		return new MyLeadsPage(driver);
		

	}

}
