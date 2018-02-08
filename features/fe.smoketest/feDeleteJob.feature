#Author: Nathalie Domingo

Feature: Delete Job

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario: I should be able to delete a job successfully
Given I am in dashboard page
And I click on jobs menu at sidebar
And I click an existing job
When I click delete job button
Then Success message must appear for job deletion