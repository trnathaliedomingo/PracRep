#Author: Nathlie Domingo

Feature: Staff Invalid Log in

Scenario Outline: Error message should appear upon inputting invalid credentials
Given I am in log in page, <url>
When I input invalid log in credentials, <invstaffusername>, <staffpassword>
And I click log me in button
Then An error message should appear, <errormessage>
And I should not be able to log in

Examples:
| url | invstaffusername | staffpassword | errormessage |
| {loginURL} | invstaffusername | staffpassword | Error! The username/email or password you have entered is invalid. |