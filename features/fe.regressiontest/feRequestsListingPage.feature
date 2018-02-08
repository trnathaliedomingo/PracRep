#Author: Nathalie Domingo

Feature: Requests Listing Page

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario: I should be able to be navigated to requests listing place and all elements should be available
Given I am in dashboard page
When I click on requests menu at sidebar
Then I should be navigated to requests listing page
And All requests elements should be available
#elements
And Requests pagination should be working
And Requests sorting should be working

#elements
#Search Bar
#Advanced Search Option
#Add Button
#Column Filter
#Pagination
#List Table
#Download CSV