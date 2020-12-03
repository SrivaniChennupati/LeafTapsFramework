package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends ProjectSpecificMethods{



	public HomePage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}

	public MyHomePage clickCRMFSA1() {
		
		driver.findElementByLinkText(prop.getProperty("Home.clickC.LinkText")).click();
		 
		 return new MyHomePage(driver);
	}

}
