
@Registrations_Users 
Feature: Test Case Orange Automation
  I want to execute sequence of test cases for Orange Automation website 

  @Register_user
  Scenario: Test Case Orange Automation Exercice
   

Given Navigate to url "http://automationexercise.com"
Then Verify that home page name "Home" is visible successfully
When Click on Signup / Login button
Then Verify "New User Signup!" is visible
When Enter name "Yass22e8228ee" and email address "ttestn222088@testtt33.com"
And Click Signup button
Then Verify that "ENTER ACCOUNT INFORMATION" is visible
When Fill details: Title "Mr" , Name "Yassin221222e8228ee" , Email "ttest21111222088@testtt33.com" , Password "123"
And  Date of birth "3" , "July" , "1987"
And Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!
And Fill details: First name "Yassino" , Last name "teste" , Company "ecology" , Address "123" , Address2 "321"
And Fill details: Country "Australia" , State "tunis" , City "zahrouni" , Zipcode "00" , Mobile Number "99999999"
And Click Create Account button
Then Verify that "ACCOUNT CREATED!" is visible
When Click Continue button
Then Verify that "Logged in as username" is visible
When Click Delete Account button
Then Verify that "ACCOUNT DELETED!" is visible 
When click Continue button


  