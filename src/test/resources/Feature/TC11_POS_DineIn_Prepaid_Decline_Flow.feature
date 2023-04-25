@DeclineFlow
Feature: POS DineIn Prepaid Order Menu with Optional Modifiers - Decline

@POSDineInPrepaidMenuwithOptionalModifiersDecline
  Scenario: POS DineIn Prepaid Order with Optional Modifier Menus 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with Optional Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Add the Tip
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should verify the Customer Information Field
    And User Should Select the Payment Method as Cash
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    Then User should Validate the Order in Reports #One
    
@POSDineInPrepaidMenuwithRequiredModifiersDecline
  Scenario: POS DineIn Prepaid Order with Required Modifier Menus
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with Required Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Add the Tip #Need to Check
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should verify the Customer Information Field
    And User Should Select the Payment Method as Cash
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports
    
@POSDineInPrepaidMenuwithBothModifiersDecline
  Scenario: POS DineIn Prepaid Order with Required Modifier Menus 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with both Optonal and Required Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Add the Tip #Need to Check
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should verify the Customer Information Field
    And User Should Select the Payment Method as Cash
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports
    
@POSDineInPrepaidMenuwithModifierPriceZeroDecline
  Scenario: POS DineIn Prepaid Order with Required Modifier Menus 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with Modifier Price Zero
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Add the Tip #Need to Check
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should verify the Customer Information Field
    And User Should Select the Payment Method as Cash
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports
    
@POSDineInPrepaidMenuPriceZerowithModifierDecline
  Scenario: POS DineIn Prepaid Order with Required Modifier Menus 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu Price Zero with Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Add the Tip #Need to Check
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should verify the Customer Information Field
    And User Should Select the Payment Method as Cash
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports