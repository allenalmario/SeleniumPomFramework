Feature: Checkout

  Scenario: User checks out item
    Given user navigates to login screen
    And user enters "standard_user" as username
    And user enters "secret_sauce" as password
    And user clicks on login button
    And user clicks on "Sauce Labs Backpack" item
    And user clicks on Add to Cart button
    And user clicks on Cart link
    And user ensures the item "Sauce Labs Backpack" is in cart and quantity is correct
    And user clicks on Checkout button
    And user fills out First Name field
    And user fills out Last Name field
    And user fills out Zip Code field
    And user clicks Continue button
    And user ensures the item "Sauce Labs Backpack" is in cart and quantity is correct
    And user clicks on Finish button
    Then user should see a "Thank you for your order!" message

  Scenario: User checks out multiple items
    Given user navigates to login screen
    And user enters "standard_user" as username
    And user enters "secret_sauce" as password
    And user clicks on login button
    And user clicks on "Sauce Labs Backpack" item
    And user clicks on Add to Cart button
    And user clicks on Back to products button
    And user clicks on "Sauce Labs Bolt T-Shirt" item
    And user clicks on Add to Cart button
    And user clicks on Cart link
    And user ensures the item "Sauce Labs Backpack" is in cart and quantity is correct
    And user ensures the item "Sauce Labs Bolt T-Shirt" is in cart and quantity is correct
    And user clicks on Checkout button
    And user fills out First Name field
    And user fills out Last Name field
    And user fills out Zip Code field
    And user clicks Continue button
    And user ensures the item "Sauce Labs Backpack" is in cart and quantity is correct
    And user ensures the item "Sauce Labs Bolt T-Shirt" is in cart and quantity is correct
    And user clicks on Finish button
    Then user should see a "Thank you for your order!" message

  Scenario: Validate that First Name field in Information page is required
    Given user navigates to login screen
    And user enters "standard_user" as username
    And user enters "secret_sauce" as password
    And user clicks on login button
    And user clicks on "Sauce Labs Backpack" item
    And user clicks on Add to Cart button
    And user clicks on Cart link
    And user clicks on Checkout button
    And user fills out Last Name field
    And user fills out Zip Code field
    And user clicks Continue button
    Then user should see "Error: First Name is required" error message

  Scenario: Validate that Last Name field in Information page is required
    Given user navigates to login screen
    And user enters "standard_user" as username
    And user enters "secret_sauce" as password
    And user clicks on login button
    And user clicks on "Sauce Labs Backpack" item
    And user clicks on Add to Cart button
    And user clicks on Cart link
    And user clicks on Checkout button
    And user fills out First Name field
    And user fills out Zip Code field
    And user clicks Continue button
    Then user should see "Error: Last Name is required" error message

  Scenario: Validate that Postal Code field in Information page is required
    Given user navigates to login screen
    And user enters "standard_user" as username
    And user enters "secret_sauce" as password
    And user clicks on login button
    And user clicks on "Sauce Labs Backpack" item
    And user clicks on Add to Cart button
    And user clicks on Cart link
    And user clicks on Checkout button
    And user fills out First Name field
    And user fills out Last Name field
    And user clicks Continue button
    Then user should see "Error: Postal Code is required" error message