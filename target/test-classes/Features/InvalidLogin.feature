Feature: Login

  Background:
    Given I am on the homepage
    When I click on Sign in

  Scenario Outline: Login with incorrect credentials should return the correct error message

    #Given I arrive at the homepage
   # And I navigate to the sign in page
    And I enter user "<email>" in the email field
    And I enter user "<password>" in the password field
    When I click on login
    Then I should get the correct "<ErrorMessage>"

    Examples:

    |email                                         |password                                  |ErrorMessage              |
    |humblecat4real2@yahoo.com                     |Huntes                                    |Authentication failed.         |
    |humblecat@yahoo.com                           |Hunter                                    |Authentication failed.    |
    |                                              |Hunter                                    |An email address required.|


