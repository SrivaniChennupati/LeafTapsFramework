package org.leaftaps.basic;



import java.io.IOException;
import java.util.Properties;


import org.leaftaps.util.ReadExcel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import leaftaps.org.base.SuperClass;

public class ProjectSpecificMethods extends SuperClass {
	
	public ChromeDriver driver;

	public String excelName;
	
	public Properties prop;
	
	


	@Parameters({"url"})
	
	@BeforeMethod
	public  void Login(String url) {
		
		launchApplication(url);
		 
		}
	
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		
		ReadExcel data = new ReadExcel();
		
		return data.readExcel(excelName);
		
		
	}


}

