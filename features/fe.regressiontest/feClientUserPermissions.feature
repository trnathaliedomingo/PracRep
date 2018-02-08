#Author: Nathalie Domingo
Feature: User Permissions

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials as client, {clientUsername}, {clientPassword}
And I click log me in button

Scenario: I should be able to grant user permissions
Given I am in client dashboard page
When I click on client users menu at sidebar
And I click an existing client user
And I click on client users permissions menu at sidebar
And I tick on client user permission
And I click client user save button
Then I should be able to grant user permission