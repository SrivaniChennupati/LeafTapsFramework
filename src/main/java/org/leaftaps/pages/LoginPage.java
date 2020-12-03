package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

import leaftaps.org.design.WebElement;

public class LoginPage extends ProjectSpecificMethods{
	
	    
	     public LoginPage(ChromeDriver driver) {
	    	 
	    	 this.driver = driver;
		
	}


		


		public LoginPage enterUserName(String uname)
	     
	     {
	    	 
             WebElement webElement = inspectElement("id", "username");
             
             enterText(webElement,uname );
	    	 
	    	 return this;
	    	 
	     }
	     
	     
	     public LoginPage enterPassWord(String pwd)
	     {
	    	 
	    	 WebElement webElement = inspectElement("id", "password");
	    	 
	    	 enterText(webElement, pwd);
	    	  
	    	 return this;
	    	 
	
          }
	     
	     public HomePage clickLogin()
	     {
	    	 
	    	 WebElement webElement = inspectElement("class", "decorativeSubmit");
	    	 
	    	 click(webElement);
	    	 
	    	 return new HomePage();
	    	 
	     }

}
