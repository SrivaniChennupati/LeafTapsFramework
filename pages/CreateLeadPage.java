package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	
	
	   @FindBy(how = How.ID , using ="createLeadForm_companyName")
	    private  WebElement eleCName;
	
	   @FindBy(how = How.ID , using ="createLeadForm_firstName")
	    private  WebElement eleFName;
	   
	   
	   @FindBy(how = How.ID , using ="createLeadForm_lastName")
	    private  WebElement eleLName;
	   
	   @FindBy(how = How.ID , using ="createLeadForm_primaryPhoneNumber")
	    private  WebElement elePNum;
	   
	   @FindBy(how = How.NAME , using ="submitButton")
	    private  WebElement eleSubmit;
	   
	   
	   public CreateLeadPage ()
	   {
		   
		   PageFactory.initElements(driver, this) ;
		   
	   }
	   
	   
	
	
	

	public  CreateLeadPage enterCompanyName(String CName) {
		
		
		
		eleCName.sendKeys(CName);
		return this;
		

	}
	
	
   public  CreateLeadPage enterFirstName(String FName) {
		
		
		
	   eleFName.sendKeys(FName);
		return this;
		

	}
   
   
      public  CreateLeadPage enterLastName(String LName) {
		
		
		
    	  eleLName.sendKeys(LName);
		return this;
		

	}
      
      
      public CreateLeadPage enterPhoneNumber(String PNum)
      
      {
    	  
    	  
    	  elePNum.sendKeys(PNum);
    	  return this;
      }
      
      public ViewLeadPage clickCreateLead()
      
      {
    	  
    	  eleSubmit.click();
    	  
    	  return new ViewLeadPage();
    	  
      }
  
  
}
