Feature: test3
  Scenario: test3
    Given user open website
    Then verify user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    When user add all items to cart
    Then verify cart icon qty is correct
    When go to cart page
    Then verify no of items in cart is correct
