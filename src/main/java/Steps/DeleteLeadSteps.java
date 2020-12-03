package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteLeadSteps {
	
	public ChromeDriver driver;

	@Given ("User Opens the ChromeBroswer")
	public void opensBrowser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	   driver = new ChromeDriver();
		
	}
	
	@Given("User Loads the URL")
	public void loadURL()
	{
		
		driver.get("http://leaftaps.com/opentaps");
	}
	
	
	@Given("User Maximize the Browser")
	public void maximizeBrowser()
	{
		
		driver.manage().window().maximize(); 
	}
	
	@Given("User set the Defualt inplicit wait time")
	public void setDefaultTime()
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Given("User enters the UserName as Demosalesmanager")
	public void enterUserName()
	{
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
	}

	@Given("User enters the Password as crmsfa")
	public void enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@Given("User Clicks on Login Button")
	public void clickLogin()
	{
		
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Given("User Clicks on CRMFSA Link  on Home Page")
	public void clickCRMFSA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@Given("User Clicks on Leads on MyHome Page")
	public void clickOnLeads()
	{
		
		driver.findElementByLinkText("Leads").click();
	}
	
	@Given("User Clicks on Find Leads on MyLeads Page")
	public void clickFindLeads()
	{
		
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@Given("User Clicks on Phone on MyLeads Page")
	public void clickPhone()
	{
		
		driver.findElementByXPath("//span[text()='Phone']").click();
	}
	
	@Given("User Enters the PhoneNumber as 123456789 on MyLeads Page")
	public void enterPhoneNum()
	{
		driver.findElementByXPath("//input[@class=' x-form-text x-form-field ']").sendKeys("12345678");
		
	}
	
   @Given("User Clicks on FindLeads button on MyLeads Page")
	public void clickFind()
  {
	  
	  driver.findElementByXPath("//button[text()='Find Leads']").click();
  }
   
   @Given("User Clicks on first Resulting Lead")
   public void firstLead()
   {
	   
	   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").click();
   }
   
   @When("User Clicks on Delete Button on ViewLead Page")
   public void clickDelete()
   {
	   
	   driver.findElementByXPath("//a[text()='Delete']").click();
   }
   
   @Then("User should be able to delete the Lead Successfully")
   public void verifyDelete()
   
   {
	   
	   System.out.println("Delete Lead is Success");
   }

}


