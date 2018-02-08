#Author: Nathlie Domingo

Feature: User Log in

Scenario Outline: User must be able to log in successfully
Given I am in user log in page, <url>
When I type in valid log in credentials, <useremail>, <userpassword>
And I click log in button
Then I should be navigated to user dashboard page
And I am logged in successfully as user

Examples:
| url | useremail | userpassword | 
| {userURL} | userEmail | userPassword |