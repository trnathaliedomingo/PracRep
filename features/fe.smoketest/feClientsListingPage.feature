#Author: Nathalie Domingo

Feature: Clients Listing Page

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {clientUsername}, {clientPasword}
And I click log me in button

@SmokeTest
Scenario: I should be able to be navigated at clients listing page upon clicking admin menu and all elements should be available
Given I am in dashboard page
When I click admin menu at sidebar
Then I should be navigated to clients listing page
And All elements should be available
#elements
And Pagination should be working
And Table should be sorting

#elements
#Search Bar
#Advanced Search Option
#Add Client Button
#Pagination
#List Table
#Download CSV