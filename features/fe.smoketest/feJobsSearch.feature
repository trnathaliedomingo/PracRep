#Author: Nathalie Domingo

Feature: Jobs Search

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffUsername}, {staffPassword}
And I click log me in button
And I click on jobs menu at sidebar

Scenario Outline: I should be able to search for a job 
Given I am in jobs listing page
When I type in job id on search field, <staffjobid>
Then Typed in job id should be shown on list

Examples:
| staffjobid |
| staffjobid |