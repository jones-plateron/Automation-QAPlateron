@DiscountConfiguration
Feature: Discount

  @DiscountConfiguration1
  Scenario Outline: As a RMS User,Discount template Validations
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    Then User should Click Create Discount button and verify the page redirection
    And User should validate the Discount Name Textbox and Error Message "Please enter a discount name"
    Then User should Validate the Discount percentage Textbox and Error Message "Please enter discount percentage"
    And User should validate the Minimum Order Amount Textbox
    Then User should validate the DineIn and TakeOut CheckBox and Error Message "Select order type"
    And User should validate the Exclude Happy Hour Items Toggle
    And User should validate the Exclude Menu and Exclude Menu Slide

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @DiscountConfiguration2
  Scenario Outline: As a RMS User,Discount Template Creation
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    Then User should Click Create Discount button and verify the page redirection
    Then User should able to Create Discount Template
    And User should Validate the Template

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @DiscountConfiguration3
  Scenario Outline: As a RMS User,
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    #And User should Create new Template and Make InActive
    #Then User should able to Delete the Discount Template

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
