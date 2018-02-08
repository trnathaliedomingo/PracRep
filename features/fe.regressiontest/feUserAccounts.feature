#Author: Nathlie Domingo

Feature: Accounts

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button
And I click on user profile

Scenario: User must be able to view accounts
Given I am in user profile page
When I click on user accounts tab
Then I should be navigated to user accounts page
And I should be able to see all accounts pertaining to logged in user