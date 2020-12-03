package pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
		
	}

	public MyLeadsPage deleteLead(){
		
		driver.findElementByLinkText(prop.getProperty("ViewLead.ClickV.LinkText")).click();
		
		return new MyLeadsPage(driver);
		

	}

}
