#Author: Nathalie Domingo

Feature: Request Configuration List Page

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario: I should be able to be navigated to request configuration and all elements should be available
Given I am in dashboard page
When I click admin menu at sidebar
And I click configurations menu at sidebar
Then I should be navigated to configuration page
And All configuration page elements should be available
#elements
And Configuration pagination should be working
And Configuration table should be sorting

#elements
#Search Bar
#Advanced Search Option
#Column Filter
#Add Users Button
#Pagination
#List Table
#Download CSV