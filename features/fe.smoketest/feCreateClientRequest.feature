#Author: Nathalie Domingo
Feature: Create Request as Client

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials as client, {clientUsername}, {clientPassword}
And I click log me in button

@SmokeTest
Scenario Outline: I should be able to successfully create a request as a client.
Given I am in dashboard page
And I click on client requests menu at sidebar
When I click client add request button
And I fill in subject and description, <subject>, <description>
And I click client request save button
Then A success message should appear
And I should be able to submit a request successfully

Examples:
| subject | description | 
| Automation - Client  | This is an automated client request |