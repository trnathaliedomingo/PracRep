#Author: Nathalie Domingo

Feature: Dashboard Elements

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffUsername}, {staffPassword}
And I click log me in button

Scenario: I should be able to see all dashboard elements
Given I am in dashboard page
When I click quarter selector button left/right
Then I am able to view previous/next quarter information
And All sections are available in dashboard page 
#sections 
#Status Summary 
#Job Summary 
#SLA Report 