#Author: Nathlie Domingo

Feature: User Log out

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button

Scenario: User must be able to log out successfully
Given I am in user dashboard page
When I click on user log out button
Then I should be able to be logged out successfully as user

