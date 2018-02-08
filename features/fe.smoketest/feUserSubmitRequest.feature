#Author: Nathlie Domingo

Feature: User Request

Background:
Given I am in user log in page, {userURL}
And I type in valid log in credentials, {userEmail}, {userPassword}
And I click log in button

Scenario Outline: User must be able to submit a request
Given I am in user dashboard page
When I click on request and forms menu
And Click on FE QA request
And I fill up required fields on request, <subject>, <description>
And I click on submit button
Then I am navigated to history page
And Request has successfully been added on list

Examples:
| subject | description |
| Automated user request. | Smoke Automation |