Feature: Login Feature

Scenario: Login to the Application
Given User navigate to moneycontrol application
When Verify the user navigate to Moneycontrol application
And User enters "ramk7.0.1@yopmail.com" and "Rk12345"
And User click on Login button
Then Verify the user login successfully or not
