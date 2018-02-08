#Author: Nathalie Domingo

Feature: Invalid Email - Forgot Password

Scenario Outline: Staff should not be able to reset password
Given I am in log in page, <url>
When I click forgot password link
And I should be navigated to password reset page
And I enter invalid email, <invstaffemail>
And I click send request button
Then I should not be navigated to request submission page

Examples:
| url | invstaffemail | 
| {loginURL} | admin |