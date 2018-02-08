#Author: Nathalie Domingo
Feature: Update Job

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button
And I click on jobs menu at sidebar

Scenario: I should be able to successfully update a job.
Given I am in jobs listing page
When I click an existing job
And I set status to on hold
And I click existing job save button
Then Job Success update message should appear