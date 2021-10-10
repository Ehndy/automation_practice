
Feature: Password
  Background:
    Given I am on the homepage
    When I click on Sign in


  Scenario: User should be able to retrieve forgotten password

    #Given I am on the application login page
    #When I click on sign in
    And I enter a valid email address
    When I click on the Forgot Password link
    Then I should be redirected to a retrieve password page
