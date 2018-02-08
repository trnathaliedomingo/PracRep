#Author: Nathalie Domingo

Feature: Staff Profile

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario: I should be able to see all profile elements
Given I am in dashboard page
When I click on pofile icon
Then I should be navigated to profile page
And I should be able to see profile page elements
#elements
#First Name field
#Last Name
#Email Address
#User Name
#Phone
#Last logged in