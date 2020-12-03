Feature: Delete the Lead in the LeafTaps Application [TCT-1234] 
Scenario: [TC003] Delete Lead Test Case

Given User Opens the ChromeBroswer
And User Loads the URL
And User Maximize the Browser
And User set the Defualt inplicit wait time
And User enters the UserName as Demosalesmanager
And User enters the Password as crmsfa
And User Clicks on Login Button
And User Clicks on CRMFSA Link  on Home Page
And User Clicks on Leads on MyHome Page
And User Clicks on Find Leads on MyLeads Page
And User Clicks on Phone on MyLeads Page
And User Enters the PhoneNumber as 123456789 on MyLeads Page
And User Clicks on FindLeads button on MyLeads Page
And User Clicks on first Resulting Lead
When User Clicks on Delete Button on ViewLead Page
Then User should be able to delete the Lead Successfully
 
