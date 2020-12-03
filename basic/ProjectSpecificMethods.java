package org.leaftaps.basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.leaftaps.util.ReadExcel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	
	public static ChromeDriver driver;

	public String excelName;

	@Parameters({"url"})
	
	@BeforeMethod
	public  void Login(String url) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		}
	
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		
		ReadExcel data = new ReadExcel();
		
		return data.readExcel(excelName);
		
		
	}
	
		


}

