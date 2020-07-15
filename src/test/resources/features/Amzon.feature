Feature: Amazon verification
  @amazon
  Scenario: Amzon homepage

    When user is homepage
    And user writes username and password
    And user clicks the botton
    Then user is on page