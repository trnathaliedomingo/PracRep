#Author: Nathalie Domingo

Feature: Delete Notice Type

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {clientUsername}, {clientPasword}
And I click log me in button
And I click admin menu at sidebar
And I click on FE Water client
And I click on notice types menu at sidebar

Scenario: I should be able to delete notice type
Given I am in fe water notice type page
When I tick on notice type 
And I click delete notice type button
Then Notice type should be removed on the list