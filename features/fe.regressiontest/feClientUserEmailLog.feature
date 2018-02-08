#Author: Nathalie Domingo
Feature: Email Log

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials as client, {clientUsername}, {clientPassword}
And I click log me in button
And I am in client dashboard page
And I click on client users menu at sidebar

Scenario: I should be able to see email log
Given I am in users list page
And I click an existing fe water client user
When I click on email log menu at sidebar
Then I should be able to see all email sent to user