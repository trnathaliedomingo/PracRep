#Author: Nathalie Domingo

Feature: Jobs Listing Page

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario: I should be able to be navigated to jobs listing place and all elements should be available
Given I am in dashboard page
When I click on jobs menu at sidebar
Then I should be navigated to jobs listing page
And All job elements should be available 
#elements
And Jobs pagination should be working
And Jobs sorting should be working

#elements
#Search Bar
#Advanced Search Option
#Add Button
#Column Filter
#Pagination
#List Table
#Download CSV