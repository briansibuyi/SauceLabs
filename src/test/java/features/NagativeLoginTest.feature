Feature: Login failed attempt
Scenario Outline: Login failed attempt
Given Navigate to the website and verify that you are on the correct landing page.
When I enter "<Username>" and "<Password>".
And I Click on the logon button.
Then I login should fail with error Message 'Epic sadface: Username and password do not match any user in this service'.

  Examples:
    | Username      | Password     |
    | standard_user | secret_sauce11 |
