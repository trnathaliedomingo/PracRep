#Author: Nathalie Domingo
Feature: Log out

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario Outline: I should be able to log out successfully
Given I am in dashboard page
When I click profile icon
And I click on log out
Then I should be navigated to log in page, <url>
And I should be able to log out successfully, <url>

Examples:
| url | 
| {loginURL} | 