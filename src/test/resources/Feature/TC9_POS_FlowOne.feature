@FlowOne
Feature: HappyPath Flow
 
  Scenario: Happpy path 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed Button
    Then User should select menu item from the left-hand side (LHS)
    And User should Validate the Selected Menu is Reflected in RHS
    Then User should able to Click on the "Send to Kitchen" Button 
    And User should Verify the page redirected to active order page
    Then User should able to Validate the Active Order page 
    And User should able to Click Recieve Payment Button 
    Then User should Verify the page redirected to Payment Detail Page
    And User should able to click Cash option and Collect Button 
    Then User should able to enter TIP and Validate the TIP reflection 
    And User should able to Apply Discount and Validate the Subtotal and Calculation
    Then User should able to Click Complete Order Button 
    Then User should Verify the page redirected to Complete order page 
    And User should Validate the Complete order page 
     
    
    
    
    

  