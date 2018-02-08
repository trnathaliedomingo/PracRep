#Author: Nathalie Domingo

Feature: Create Request Configuration

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario Outline: I should be able to be create request configuration
Given I am in dashboard page
And I click admin menu at sidebar
And I click configurations menu at sidebar
When I click on add configuration button
And I fill up required configuration fields, <category>, <type>
And I select form fields
And I fill up form fields
And I click configuration save button
Then I should be able to see 'Success! Request configuration has been added.' message
And I should be able to save configuration successfully

Examples:
| category | type |
| Automated | Configuration | 

