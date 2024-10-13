Feature: test2
  Scenario: test2
    Given user open website
    Then verify user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    When sort items high to low
    Then verify items are sorted high to low