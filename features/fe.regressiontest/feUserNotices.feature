#Author: Nathlie Domingo

Feature: User Notices List

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button

Scenario: User must be able to submit a request
Given I am in user dashboard page
When I click on notices menu
Then All elements should be showing correctly