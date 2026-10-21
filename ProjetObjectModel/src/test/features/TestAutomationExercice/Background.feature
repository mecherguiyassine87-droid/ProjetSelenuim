@Registrations_Users 
Feature: Test Case Orange Automation
  I want to execute sequence of test cases for Orange Automation website 

Background: 
Given Navigate to url "http://automationexercise.com"
Then Verify that home page name "Home" is visible successfully

  @Register_user
  Scenario: Test Case Orange Automation Exercice
   

When Click on Signup / Login button
Then Verify "New User Signup!" is visible
When Enter name "Yas2e8228ee" and email address "ttestn2288@testtt33.com"
And Click Signup button