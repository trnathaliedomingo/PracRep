#Author: Nathalie Domingo

Feature: Client Permissions

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {clientUsername}, {clientPasword}
And I click log me in button
And I click admin menu at sidebar
And I click on FE Water client

Scenario: I should be able to grant permissions to client
Given I am in client details page
When I click on permissions menu at sidebar
And I tick on permission
And I click permissions save button
Then I have successfully granted a permission a client