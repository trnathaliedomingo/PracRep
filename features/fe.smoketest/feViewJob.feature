#Author: Nathalie Domingo
Feature: View Job

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button
And I click on jobs menu at sidebar

Scenario: I should be able to view a job.
Given I am in jobs listing page
When I click an existing sent job
Then I should be able to see all elements in job details page
#Elements
#Notice Section
#Status Section
#Instructions Section