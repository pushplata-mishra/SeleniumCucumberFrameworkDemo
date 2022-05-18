#Author: pushplata.de@gmail.com

Feature: Purchase first product

Background: Login Page
Given user opens login page
When user enters valid username and password
And user clicks on Login button
Then user clicks on header logo


Scenario: Place order for first product
When user selects first product
And user adds product to cart
And user pays by bank wire
Then order of selected product should be completed