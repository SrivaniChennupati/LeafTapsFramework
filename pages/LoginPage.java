package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	    
	     public LoginPage enterUserName(String uname)
	     
	     {
	    	 
	    	 driver.findElementById("username").sendKeys(uname);
	    	 
	    	 return this;
	    	 
	     }
	     
	     
	     public LoginPage enterPassWord(String pwd)
	     {
	    	 
	    	 
	    	 driver.findElementById("password").sendKeys(pwd);
	    	 return this;
	    	 
	
          }
	     
	     public HomePage clickLogin()
	     {
	    	 
	    	 driver.findElementByClassName("decorativeSubmit").click();
	    	 
	    	 return new HomePage();
	    	 
	     }

}
