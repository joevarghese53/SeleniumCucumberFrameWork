Feature: test5
  Scenario: test5
    Given user open website
    Then verify user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    When user add all items to cart
    Then verify cart icon qty is correct
    When go to cart page
    When go to Info page
    When user fills info
    When go to Checkout
    Then verify total price displayed
    When click on finish button
    When click on back home button
    Then verify remove item button is not displayed

