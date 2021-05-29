@All
Feature: Women shopping

  @regression
  Scenario: Start women shopping with valid credentials
    Given User is in home page of application
    When User should be click on women shopping button
    Then User should be navigate to Women subcategories page and click on Tops button
    And User should be navigate to T-shirts page and click on T-shirts page
    And User should be navigate to T-shirts shopping items page and click on shopping item
    And User enters following datails of shopping item and click on Addtocart button
      | quantity | size | color  |
      |        1 | M    | blue   |
      |        2 | S    | orange |
    And User should be navigate to proceed to checkout page and click on Proceed to checkout button
    And User should be navigate to shopping cart summary page
    When User should be click on Proceedto Checkout button
    Then user should be navigate to authentication page
    Given User is in authentication page
    When User enter Email address
    Then User click on create an account button
    Given User is in Create an account page
    When User enters all the personal information and address
    Then User click on Register button
    Given User is in Address page
    When User should be click on Proceed-toCheckout button
    Then User should be navigate to shipping page
    #@smoke
    #Scenario: Women shopping with selected items
    Given User is in shipping page
    When User click on selected the terms of service check box
    Then User should be click on Proceedtocheckout button
    Given User is in please choose your payment method
    When User click on paybybankwire option
    Then User navigate to order summary page
    Given User is in order summary page
    When User click on I confirm my order button
    Then User should be navigate to order confirmation page
    
