#Author: Nathalie Domingo

Feature: Create User

Background:
Given I am in log in page, {loginURL}
When I input valid log in credentials, {staffUsername}, {staffPassword}
And I click log me in button
And I am in dashboard page
And I click admin menu at sidebar
And I click users menu at sidebar

Scenario Outline: I should be able to be create user successfully
Given I am in users listing page
When I click users menu at sidebar
And I click add user button
And I fill up required user fields, <firstname>, <lastname>, <email>, <username>, <password>
And I set user type to client admin
And I click user save button
Then Success message upon user creation should appear, <successmessage>
And I have successfully created a user


Examples:
| firstname | lastname | email | username | password | successmessage |
| firstName | lastName | eMail | userName | passWord | successMessage |