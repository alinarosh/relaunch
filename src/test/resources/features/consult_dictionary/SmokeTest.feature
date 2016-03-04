Feature: Main ecommerce path is covered for smoke testing

  Scenario: Re-add simple product to the cart
    Given the user is on the product view page for simple product
    When the user is adding product to the cart
    When the user remove product from the cart and get name of last product
    When the user restore last removed product in the cart
    Then the last removed product is restored in the shopping cart


