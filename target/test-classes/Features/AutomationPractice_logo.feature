
Feature: Automation practice homepage logo

Background:
  Given I am on the homepage
  When I click on Sign in

  Scenario: User should be able to see logo on the homepage

    Given I launch my browser
    When I enter the application URL
    And I wait for 5 seconds
    Then I should see the application logo
