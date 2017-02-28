@LoginTest
Feature: Test Featue

  Scenario Outline: I want to see error message when invalid credentials are given
    Given the vidafone site is launched
    When I click on Login button
    And enter <username> and <password>
    And click on Login button
    Then I verify error message is displayed
    
Examples:
|username |password |
|"Amila"  |"TestPassword" |