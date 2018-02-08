#Author: Nathlie Domingo

Feature: Staff Log in

Scenario Outline: Staff user must be able to log in successfully
Given I am in log in page, <url>
When I input valid log in credentials, <staffusername>, <staffpassword>
And I click log me in button
Then I should be navigated to dashboard page
And I am logged in successfully

Examples:
| url | staffusername | staffpassword | 
| {loginURL} | staffusername | staffpassword |