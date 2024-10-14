Feature: Checkout

  Scenario: User checks out item
    Given user navigates to login screen
    And user enters "standard_user" as username
    And user enters "secret_sauce" as password
    And user clicks on login button
    And user clicks on "Sauce Labs Backpack" item
    And user clicks on Add to Cart button
    And user clicks on Cart link
    And user ensures the item name is "Sauce Labs Backpack"
    And user ensures the item quantity is correct
    And user clicks on Checkout button
    And user fills out First Name field
    And user fills out Last Name field
    And user fills out Zip Code field
    And user clicks Continue button
    And user ensures the item name is "Sauce Labs Backpack"
    And user ensures the item quantity is correct
    And user clicks on Finish button
    Then user should see a "Thank you for your order!" message