#Author: Nathalie Domingo

Feature: User Sign Up

Scenario Outline: I should be able to successfully sign up
Given I am in user log in page, <url>
When I click sign up tab
And I type in valid user email, <signupmail>
And I click sign up button
Then I should be navigated to success configuration sign up page 
#Thank you for your details
And A sign up email must be sent

Examples:
| url | signupmail | 
| {userURL} | signupEmail |