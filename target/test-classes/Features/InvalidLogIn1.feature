
Feature: Login

  Background:
    Given I am on the homepage
    When I click on Sign in



  Scenario: User with Invalid credentials should not be able to sign in

    Given I am on the application Landing page
    When I press the sign in link
    And I enter correct Username
    And I enter Incorrect password
    When I press the Log in button
    Then I should get an error message

