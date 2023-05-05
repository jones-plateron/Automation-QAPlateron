 @PartialVoidDecline
Feature: POS DineIn Prepaid Order Menu with Optional Modifiers - Partial Void Decline

@POSDineInPrepaidMenuwithOptionalModifiersPartialVoidDecline @PartialVoidDecline
  Scenario: POS DineIn Prepaid Order with Optional Modifier Menus Partial Void and Decline the Order
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with Optional Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "09.99"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should Enter the Customer Information
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Then User should Validate the Order in Reports #One---------

@POSDineInPrepaidMenuwithRequiredModifiersPartialVoidDecline @PartialVoidDecline 
  Scenario: POS DineIn Prepaid Order with Required Modifier Menus Void All Items and Decline the Order
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with Required Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "No Tip"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should Enter the Customer Information
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports
    
@POSDineInPrepaidMenuwithBothModifiersPartialVoidDecline @PartialVoidDecline
  Scenario: POS DineIn Prepaid Order with Both Modifiers Menus Void All Items and Decline the Order
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with both Optonal and Required Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "18%"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should Enter the Customer Information
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports
    
@POSDineInPrepaidMenuwithModifierPriceZeroPartialVoidDecline @PartialVoidDecline 
  Scenario: POS DineIn Prepaid Order with Menu with Modifier price Zero Void All Items and Decline the Order
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu with Modifier Price Zero
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "22%"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should Enter the Customer Information
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports
    
@POSDineInPrepaidMenuPriceZerowithModifierPartialVoidDecline @PartialVoidDecline
  Scenario: POS DineIn Prepaid Order with Menu price Zero with Modifier Void All Items and Decline the Order
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should Add the Menu Price Zero with Modifier
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "20%"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount 
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should Enter the Customer Information
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Void the all Menu Items 
    And User Should Decline the Order
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    #Need Reports