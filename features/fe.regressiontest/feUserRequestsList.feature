#Author: Nathlie Domingo

Feature: User Request List

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button
And I click on request and forms menu

Scenario: User must be able to submit a request
Given I am in request and forms page
When I click on users request history tab
Then I should be able to see user created requests