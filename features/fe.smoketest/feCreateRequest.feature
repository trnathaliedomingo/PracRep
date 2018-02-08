#Author: Nathalie Domingo

Feature: Create Request

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario Outline: I should be able to submit a request successfully
Given I am in dashboard page
When I click on requests menu at sidebar
And I click on add request button
And I set an assignee
And I fill in subject and description, <subject>, <description>
And I click request save button
Then A success message should appear
And I should be able to submit a request successfully

Examples:
| subject | description | 
| Automation | This is an automated Request. |