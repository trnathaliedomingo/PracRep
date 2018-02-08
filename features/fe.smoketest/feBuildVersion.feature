#Author: Nathalie Domingo
Feature: Build Version

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffUsername}, {staffPassword}
And I click log me in button

@SmokeTest
Scenario: I should be able to see build version at the sidebar footer
Given I am in dashboard page
Then I should be able to see build version at the sidebar footer 