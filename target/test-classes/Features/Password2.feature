@ignore
Feature: Password



  Scenario: User should be able to retrieve forgotten password


    Given that I am on the retrieve password landing page
    When I enter my email address
    And click on retrieve password
    Then I should see a confirmation message that password has been sent