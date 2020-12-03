package leaftaps.org.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.org.design.Browser;
import leaftaps.org.design.WebElement;

public class SuperClass implements WebElement , Browser{
	
	
	public  RemoteWebDriver driver;
	

	public void launchApplication(String url) {
		
		try
		{
		
			System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get(url);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//reportStep("The browser: Chrome launched successfully", "PASS");
			
		} catch(WebDriverException e)
		
		{
			//reportStep("The browser: Chrome launched successfully", "PASS");
			
		}	
		
	}

	public void startApp(String browser, String url) {
		
		try{
			if(browser.equals("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}else if (browser.equals("firefox")){
			
			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//reportStep("The browser: "+browser+" launched successfully", "PASS");
		
		} catch(WebDriverException e) {			
			//reportStep("The browser: "+browser+" could not be launched", "FAIL");
			
		}
	}
		
		
	public WebElement inspectElement(String locator_name, String Locator_Value) {
		
		try {
			
		
		switch(locator_name)
		
		{
		case "id" :  return   driver.findElementById(Locator_Value);
		
		case "class" : return   driver.findElementByClassName(Locator_Value);
		
		case "name" : return  driver.findElementByName(Locator_Value);
		
		case "link" : return driver.findElementByLinkText(Locator_Value);
		
		case "partialLink" : return  driver.findElementByPartialLinkText(Locator_Value);
		
		case "tagname" : return  driver.findElementByTagName(Locator_Value);
		
		case "xpath" : return  driver.findElementByXPath(Locator_Value);
		
		case "cssSelect" : return driver.findElementByCssSelector(Locator_Value);
		}
		
		}
		 catch (NoSuchElementException e) {
			//reportStep("The element with locator "+locator+" not found.","FAIL");
		} catch (WebDriverException e) {
			//reportStep("Unknown exception occured while finding "+locator+" with the value "+locValue, "FAIL");
		}
		return null;
	}

	public WebElement locateElement(String value) {
		
		
		return (WebElement) driver.findElementById(value);
		
		
		
	}

	public List<org.openqa.selenium.WebElement> locateElements(String type, String value) {
		
		
		try {
			switch(type) {
			case "id"	 : return  driver.findElementsById(value);
			case "class" : return driver.findElementsByClassName(value);
			case "name" : return driver.findElementsByName(value);
			case "link" : return driver.findElementsByLinkText(value);
			case "partialLink" : return driver.findElementsByPartialLinkText(value);
			case "tagname" : return driver.findElementsByTagName(value);
			case "xpath" : return driver.findElementsByXPath(value);
			case "cssSelect" : return driver.findElementsByCssSelector(value);
			}
		} catch (NoSuchElementException e) {
			//reportStep("The element with locator "+type+" not found.","FAIL");
		} catch (WebDriverException e) {
			//reportStep("Unknown exception occured while finding "+type+" with the value "+locValue, "FAIL");
		}
		return null;
	}

	public <Alert> Alert switchToAlert() {
		
		
		try{
			
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
		}
		catch( NoAlertPresentException e) {
			//reportStep("There is no alert present.","FAIL", false);
		} catch (WebDriverException e) {
			//reportStep("WebDriverException : "+e.getMessage(), "FAIL", false);
		}  
		
		return null;
	}

	public void acceptAlert()
	{
	
	try {
		
	 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		//reportStep("The alert "+text+" is accepted.","PASS", false);
	}
	
	catch (NoAlertPresentException e)
	{
		//reportStep("There is no alert present.","FAIL", false);
	} 
	catch (WebDriverException e) 
	{
		//reportStep("WebDriverException : "+e.getMessage(), "FAIL", false);
	}
	
	}

	public void dismissAlert() {
		
		
		
		try {
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
			 String text = alert.getText();
			alert.dismiss();
			//reportStep("The alert "+text+" is dismissed.","PASS", false);
		} catch (NoAlertPresentException e) {
			//reportStep("There is no alert present.","FAIL", false);
		} catch (WebDriverException e) {
			//reportStep("WebDriverException : "+e.getMessage(), "FAIL", false);
		} 
	}
	

	public String getAlertText() {
		
		try {
			 org.openqa.selenium.Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			alert.dismiss();
			//reportStep("The alert "+text+" is dismissed.","PASS", false);
		} catch (NoAlertPresentException e) {
			//reportStep("There is no alert present.","FAIL", false);
		} catch (WebDriverException e) {
			//reportStep("WebDriverException : "+e.getMessage(), "FAIL", false);
		} 
	
     return null;
	}

	public void typeAlert(String data) {
		
		try
		
		{
		
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		alert.sendKeys(data);
		
		alert.accept();
		//reportStep("The alert "+data+" is accepted.","PASS");
	} catch (NoAlertPresentException e) {
		//reportStep("There is no alert present.","FAIL");
	} catch (WebDriverException e) {
		//reportStep("WebDriverException : "+e.getMessage(), "FAIL");
	} 
		
		
	}

	public void switchToWindow(int index) {
		
		
		
	}

	public void switchToWindow(String title) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub
		
	}

	public void defaultContent() {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

	public void click(WebElement ele) {
		
		
		ele.click(ele);
		
		
	}

	public void enterText(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	public void clearAndType(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBackGroundColor(WebElement ele, String prop) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTypedText(WebElement ele, String attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectDropdownUsingText(WebElement ele, String text) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropdownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	

	}


