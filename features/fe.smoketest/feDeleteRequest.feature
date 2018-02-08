#Author: Nathalie Domingo

Feature: Delete Request

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffUsername}, {staffPassword}
And I click log me in button

Scenario: I should be able to delete a request successfully
Given I am in dashboard page
And I click on requests menu at sidebar
And I click an existing request
When I click delete button
Then Success message should appear