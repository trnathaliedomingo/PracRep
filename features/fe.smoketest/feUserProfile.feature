#Author: Nathlie Domingo

Feature: User Profile

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button

Scenario: User must be able to view profile page
Given I am in user dashboard page
When I click on user profile
Then I should be navigated on profile page
And I should be able to see all user profile elements
#Elememts
#Profile
#Accounts
#Emails