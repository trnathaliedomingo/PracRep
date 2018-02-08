#Author: Nathalie Domingo

Feature: Users Listing Page

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffUsername}, {staffPassword}
And I click log me in button

Scenario: I should be able to be navigated at users listing page upon clicking admin menu and all elements should be available
Given I am in dashboard page
And I click admin menu at sidebar
When I click users menu at sidebar
Then I should be navigated to users listing page
And All users listing page elements should be available
#elements
And Users listing page pagination should be working
And Users listing page table should be sorting

#elements
#Search Bar
#Advanced Search Option
#Add Users Button
#Pagination
#List Table
#Download CSV