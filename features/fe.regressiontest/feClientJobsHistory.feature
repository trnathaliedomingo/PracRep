#Author: Nathalie Domingo
Feature: Client Jobs History

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials as client, {clientUsername}, {clientPassword}
And I click log me in button
And I click on jobs menu at sidebar

Scenario: I should be able to see job's history
Given I am in client jobs listing page
When I click an existing client job
And I click on client job history tab
Then I should be able to see client job history