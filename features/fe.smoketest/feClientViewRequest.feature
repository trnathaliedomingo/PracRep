#Author: Nathalie Domingo
Feature: View Client Request

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials as client, {clientUsername}, {clientPasword}
And I click log me in button

@SmokeTest
Scenario: I should be able to view a request.
Given I am in dashboard page
When I click on client requests menu at sidebar
And I click an existing open request
Then I should be able to see all elements in request details page
#Elements
#Status Section
#Contacts Section
#Form Details Section