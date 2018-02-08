#Author: Nathalie Domingo
Feature: Create Job as Client

@SmokeTest
Scenario Outline: I should be able to successfully create a job as a client.
Given I am in log in page, <url>
And I input valid log in credentials as client, <clientusername>, <clientpassword>
And I click log me in button
And I am in dashboard page
And I click on jobs menu at sidebar
When I click client add job button
And I set notice type to Rates
And I click on first next button
And I click on additional instructons in the jobs wizard
And I type in a comment on the additional instructions field, <clientjobcomment>
And I click on second next button
And I click on submit job button
Then I have successfully created a client job

Examples:
| url | clientusername | clientpassword | clientjobcomment | successmessage | 
| {loginURL} | clientUsername | clientPassword | This is an automated client job | Success! Job has been added. |