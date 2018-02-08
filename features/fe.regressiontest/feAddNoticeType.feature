#Author: Nathalie Domingo

Feature: Add Notice Type

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {clientUsername}, {clientPasword}
And I click log me in button
And I click admin menu at sidebar

Scenario Outline: I should be able to add notice type
Given I am in client listing page
When I click on FE Water client
And I click on notice types menu at sidebar
And I click Add notice type button
And I input notice type name, <noticetype>
And I notice type save button
Then I have successfully added a notice type

Examples:
| noticetype |
| Automation |