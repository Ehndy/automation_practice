
Feature: Create User

  Background:
    Given I am on the homepage
    When I click on Sign in



  Scenario: User should be able to create an account



    #Given I get on the homepage
    #And I select the sign in link
    And I enter email address for new user
    And I click on the create account button
    When I provide all the necessary information
    And I click on the register button
    Then my account should be created successfully
