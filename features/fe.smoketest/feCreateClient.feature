#Author: Nathalie Domingo

Feature: Create Client

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario Outline: I should be able to create a client successfully
Given I am in dashboard page
And I click admin menu at sidebar
When I click on add client button
And I filled up required fields, <clientname>, <code>, <account>
And I click client save button
Then Success message should appear upon client creation, <successmessage>
And A client has successfully been created

Examples:
| clientname | code | account | successmessage |
| Automated Client1 | AC1 | FE Water Demonstration | Success! Customer has been added. |