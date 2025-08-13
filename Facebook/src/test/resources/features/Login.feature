
Feature: Facebook Login
As a fb user, I want to enter username and password as a parameter

  Scenario: Validate FB login
    Given The user is on the login page
    When User enters username
    And User enters password
    And User clicks on login button
    Then User should not be able to login to FB 

 
