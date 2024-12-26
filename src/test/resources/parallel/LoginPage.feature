Feature: Login page feature

  Scenario: Login with correct credentials
    Given user is on login page
    And user enters username as "<username>"
    And user enters password as "<password>"
    Then user clicks on Login
    Then validate the url contains "https://www.saucedemo.com/inventory.html"

  Scenario: Login with incorrect credentials
    Given user is on login page
    And user enters username as "<username>"
    And user enters password as "<password>"
    Then user clicks on Login
    Then validate the url contains "xyz"
