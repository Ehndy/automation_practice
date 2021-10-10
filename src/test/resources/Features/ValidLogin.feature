Feature: Login

  Background:
    Given I am on the homepage
    When I click on Sign in


  Scenario: User with valid credentials should be able to login

    #Given I am on the application homepage
    #And I click on the sign in link
    When I enter a valid username
    And I enter a valid Password
    When I click the login button
    Then I should be logged in successfully