@Sanity
Feature: Happy Path Flow
 
@POSDineInPrepaid 
  Scenario: POS DineIn Prepaid Order Complete with Cash
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
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
    Then User should able to Swipe Complete Order Button
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    And User should Click Refund button and verify redirection
    And User should Verify Refund Page Informations
#		And User should Refund the amount using Service Fee
#		And User should Refund the amount using gratuity Fee
#		And User should Refund the amount using Tip
		And User should Refund the amount using Custom Value
		
@POSDineInPostpaid 
  Scenario: POS DineIn Postpaid Order Complete with Cash
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed button
    And User should Add the Pre-Defined Set of Menus
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "20%"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User should Enter the Customer Information
    Then User should able to Swipe Complete Order Button
		And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page    
    And User should Click Refund button and verify redirection
    And User should Verify Refund Page Informations
#		And User should Refund the amount using Service Fee
#		And User should Refund the amount using gratuity Fee
#		And User should Refund the amount using Tip
		And User should Refund the amount using Custom Value
		
@POSTakeOutPrepaid
  Scenario: POS TakeOut Prepaid Order Complete with Cash
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select TakeOut Section and Verify Cutomer Information PopUp
    And User should Validate and Store Cutomer Information and Click Proceed Button
    And User should Add the Pre-Defined Set of Menus
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "11.11"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount
    And User Should verify the Receive Payment page Calculation after Applying Discount
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    Then User should able to Swipe Complete Order Button
    And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page
    And User should Click Refund button and verify redirection
    And User should Verify Refund Page Informations
#		And User should Refund the amount using Service Fee
#		And User should Refund the amount using gratuity Fee
#		And User should Refund the amount using Tip
		And User should Refund the amount using Custom Value
		
@POSTakeOutPostpaid 
  Scenario: POS TakeOut Postpaid Order Complete with Cash
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select TakeOut Section and Verify Cutomer Information PopUp
    And User should Validate and Store Cutomer Information and Click Proceed Button
    And User should Add the Pre-Defined Set of Menus
    And User Should swipe the Send to Kitchen
    And User Should Validate the Active Orders Page
    And User Should Partially Void Some Items
    When User Should click Receive Payment button
    Then User Should Verify the page redirected to Payment Detail Page
    And User Should verify the Receive Payment page Calculation
    And User Should Select the Payment Method as Cash
    And User Should Add the Tip Percentage as "20%"
    And User Should verify the Receive Payment page Calculation after Tip
    And User should apply Discount
    And User Should verify the Receive Payment page Calculation after Applying Discount
    Then User should able to Swipe Complete Order Button
		And User should Verify Order gets Moved to Completed Orders Page 
    And User Should Validate the Completed Orders Page    
    And User should Click Refund button and verify redirection
    And User should Verify Refund Page Informations
#		And User should Refund the amount using Service Fee
#		And User should Refund the amount using gratuity Fee
#		And User should Refund the amount using Tip
		And User should Refund the amount using Custom Value
		