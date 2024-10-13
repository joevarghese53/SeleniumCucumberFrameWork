Feature: test1
  Scenario: test1
    Given user open website
    Then verify user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    When sort items z to a
    Then verify items are sorted z to a