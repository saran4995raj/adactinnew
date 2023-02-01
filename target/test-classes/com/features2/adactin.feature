@Smoke
Feature: Adactin Hotel Booking

@adactin1
Scenario: Adactin app login
Given User open the chrome
And User enter the url
And User enter the username
And User enter the password
When User click the login Button
Then login successfull

@adactin2
Scenario: Hotel search in adactin
Given User click the select location
And User click the select Hotel
And User select the Room type
And User select number of rooms
And User check in data
And User check out data
And User select adults per Room
And User select child per Room
Then User enter the search Button

@adactin3
Scenario: Confirmation hotel booking
Given User select the hotel
Then User enter the Search Buttons

@adactin4
Scenario: Enter the user details
Given User enter the First Name
And User enter the Last Name
And User enter Address
And User enter the Credit Number
And User click the Credit Card Type
And User enter the Expiry Month
And User enter the Expiry Year
And User enter the cvv number
Then User click the book now Button
