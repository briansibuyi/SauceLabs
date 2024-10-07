Feature: Shopping Two Items on Swag Labs
  Scenario Outline: Shopping Two Items on Swag Labs
    Given Navigate to the website and verify that you are on the correct landing page.
    When I enter "<Username>" and "<Password>".
    And I Click on the logon button.
    Then I should see Swag labs product.
    When I add Sauce Labs Backpack to Cart.
    And I Add Sauce Labs Fleece Jacket to Cart.
    And I click on the shopping Cart Image.
    Then I should see two quantity added to shopping Cart
    When I Click checkout button.
    And I enter "<Firstname>" , "<Lastname>" and "<ZipCode>"
    And I Click Continue button
    Then I see product information with total price
    When I click on Finish button
    Then I should see a message states 'Thank you for your order!'

    Examples:
      | Username      | Password     | Firstname | Lastname  | ZipCode  |
      | standard_user | secret_sauce | Brian     | Sibuyi    | 12345    |
