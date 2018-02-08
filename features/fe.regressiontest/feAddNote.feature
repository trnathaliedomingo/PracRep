#Author: Nathalie Domingo

Feature: Add Note on Request

Background:
Given I am in log in page, {loginURL}
And I input valid log in credentials, {staffusername}, {staffpassword}
And I click log me in button

Scenario Outline: I should be able to add a note on a request
Given I am in dashboard page
When I click on requests menu at sidebar
And I click on an existing request
And I click request history tab
And I fill in note field, <note>
And I click the save request button
Then Adding note success message should appear

Examples:
| note |
| This is an automated note. - regression |