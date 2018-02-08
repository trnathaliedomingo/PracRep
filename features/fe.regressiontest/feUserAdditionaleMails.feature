#Author: Nathlie Domingo

Feature: Emails

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button
And I click on user profile

Scenario: User must be able to view additional emails
Given I am in user profile page
When I click on user emails tab
Then I should be navigated to user additional emails page
And I should be able to see email pertaining to logged in user