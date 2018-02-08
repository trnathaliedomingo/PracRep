#Author: Nathalie Domingo
Feature: Create Job

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button
And I click on jobs menu at sidebar

Scenario Outline: I should be able to successfully create a job.
Given I am in jobs listing page
When I click add jobs button
And I set client to FE Water
And I click on Additional instructions
And I type in an instruction, <instruction>
And I click save
Then Job Success message should appear, <successmessage>

Examples:
| instruction | successmessage | 
| This is an automated staff job. | Success! Job has been added. |