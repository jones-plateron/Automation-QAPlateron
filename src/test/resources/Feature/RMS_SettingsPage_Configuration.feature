
@BillSettings
Feature: Settings Page Configuration
@BillSettings1
Scenario Outline: As a RMS User, I need to Validate Bill Settings Page
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should able to Click Settings Sections
    Then User should Click Bill Configuration and Verify the Bill Configuration Page Opens
    Then User should able to Verify the Page Header as "Billing - Tax, Fees & Charges" and Verify it Contains "Sales Tax" and "Service Fee" Sections
    Then User should Verify Sales Tax section contains "Sales Tax" ,"Apply sales tax on the subtotal after deductions" and "Apply sales tax on the tip after deductions" options
    And User should Verify the Instruction "percentage of tax to be applied on the total amount of order" under Sales Tax option 
    Then User should Validate the TextBox of Salex Tax option
    And User should Verify the Instruction "turning tip would apply sales tax on subtotal before deductions" under Apply sales tax on the subtotal after deductions option
    Then User should Validate the Toggle of Apply sales tax on the subtotal after deductions option
    And User should Verify the Instruction "turning off would not apply sales tax on tip" under Apply sales tax on the tip after deductions option
    Then User should Validate the Toggle of Apply sales tax on the tip after deductions
    Then User should Verify Service Fee section contain "Service Fee Percentage","Service Fee Percentage inclusive of sales tax" and "Apply service fee on the subtotal after deductions" options
    And User should Verify the Instruction "if service fee applicable for the order" under Service Fee Percentage option
    Then User should Validate the TextBox of Service Fee Percentage option
    And User should Verify the Instruction "if tax to be applied for the service fee" under Service Fee Percentage inclusive of sales tax option
    Then User should Validate the Toggle of Service Fee Percentage inclusive of sales tax
    And User should Verify the Instruction "turning off would apply service fee on subtotal before deductions" under Apply service fee on the subtotal after deductions
    Then User should Validate the Toggle of Apply service fee on the subtotal after deductions
    And User Should able to Click Save Button
   
    Examples: 
      | mobileNumber | otp    |
      |   2222222222 | 666666 |
      
      @BillSettings2
    Scenario Outline: As a RMS User, I need to Validate Gratuity Settings Page
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should able to Click Settings Sections
    Then User should Click Gratuity Configuration and Verify the Gratuity Configuration Page Opens with "Gratuity Configuration"
    Then User the Gratuity Page Contain "Enable Gratuity" option with Toggle button and validate the toggle 
    Then User the Gratuity Page Contain "Gratuity Based on" with two option "Guest Count" and "Order Amount"
    And User should Verify "Apply Gratuity for" is visible when the Order Amount is Selected
    Then User should Validate TakeAway and Dine-In
    And User should Verify "Apply Gratuity for" is Hided when the Guest Count is Selected
    Then User should Verify "Gratuity percentage" option is present and Validate the Textbox
    And User should Verify the Instruction "if gratuity need not be applied please enter 0" under Gratuity percentage option    
    Then User should Verify "Gratuity will be added on bill when subtotal reaches this amount" option is present and Validate the Textbox
    And User should Verify the Instruction "then gratuity is activated" under Gratuity will be added on bill when subtotal reaches this amount option
    Then User should Verify "Tax to be applied on gratuity amount" option is present and Validate the Textbox
    Then User should Verify "Apply gratuity on the subtotal after deductions" option is present and Validate the Toggle
    And User should Verify the Instruction "turning off would apply gratuity on subtotal before deductions" under Apply gratuity on the subtotal after deductions option
    Then User should able to Click Save Button
    
    Examples: 
      | mobileNumber | otp    |
      |   2222222222 | 666666 |
      
      #22-03-2023 18:32