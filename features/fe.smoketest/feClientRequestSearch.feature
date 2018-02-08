#Author: Nathalie Domingo
Feature: Client Request Search

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials as client, {clientUsername}, {clientPassword}
And I click log me in button

@SmokeTest
Scenario Outline: I should be able to search a request as a client
Given I am in dashboard page
When I click on client requests menu at sidebar
And I type a request on the search request field, <requestID>
Then Searched request should be reflected on list

Examples:
| requestID |
| clientRequestid |