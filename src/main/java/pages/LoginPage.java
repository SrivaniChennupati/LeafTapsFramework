package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver)
	
	{
		
		this.driver = driver;
	}

	public LoginPage enterUserName(String UName) {
		
		driver.findElementById(prop.getProperty("Login.uname.ID")).sendKeys(UName);
		
		return this;
		

	}
	
	public LoginPage enterPassword(String Pwd)
	
	{
		
		driver.findElementById(prop.getProperty("Login.pwd.ID")).sendKeys(Pwd);
		return this;
		
	}
	
	
	public HomePage clickLogin()
	
	{
		
		driver.findElementByClassName(prop.getProperty("Login.loginB.ClassName")).click();
		
		return new HomePage(driver);
	}

}
