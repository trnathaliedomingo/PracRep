#Author: Nathalie Domingo

Feature: Forgot Password

Scenario Outline: Staff must be able to reset password
Given I am in log in page, <url>
When I click forgot password link
And I should be navigated to password reset page
And I enter valid email, <staffemail>
And I click send request button
Then I should be navigated to request submission page
And Password must be reset successfully
And I click back to login page button
And I should be navigated to login page
And A confirmation email must be sent

Examples:
| url | staffemail | 
| {loginURL} | staffemail |