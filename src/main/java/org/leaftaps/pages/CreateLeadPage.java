package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	
	
	   public CreateLeadPage(ChromeDriver driver) {
		   
		   this.driver=driver;
	
	}


	public  CreateLeadPage enterCompanyName(String CName) {
		
	    leaftaps.org.design.WebElement webElement = inspectElement("id", "createLeadForm_companyName");
	    		
	    		enterText(webElement, CName);
	    
		 return this;
		

	}
	
	
   public  CreateLeadPage enterFirstName(String FName) {
	   
	   
	   leaftaps.org.design.WebElement webElement = inspectElement("id", "createLeadForm_firstName");
	   
	  enterText(webElement, FName);
		
		return this;
		

	}
   
   
      public  CreateLeadPage enterLastName(String LName) {
    	  
    	  leaftaps.org.design.WebElement webElement = inspectElement("id", "createLeadForm_lastName");
    	  
    	  enterText(webElement, LName);
		
	  return this;
		

	}
      
      
      public CreateLeadPage enterPhoneNumber(String PNum)
      
      {
    	  
    	  leaftaps.org.design.WebElement webElement = inspectElement("id", "createLeadForm_primaryPhoneNumber");
    	  
    	  enterText(webElement, PNum);
    	  
    	  return this;
      }
      
      public ViewLeadPage clickCreateLead()
      
      {
    	  
    	 leaftaps.org.design.WebElement webElement = inspectElement("name", "submitButton");
    	 
    	 click(webElement);
    	  
    	  return new ViewLeadPage();
    	  
      }
  
  
}
