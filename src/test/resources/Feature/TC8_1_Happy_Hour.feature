@HappyHourConfiguration @RMS
Feature: Discount
#Happy Hour Feature File has been Completed
  @DayHappyHourwithPercentage
  Scenario Outline: As a RMS User, Add Happy Hour using day with percentage
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    Then User should redirects to Happy Hours Section
    And User should delete All the Happy Hour templates
    And User should click Add Happy hour button
    And User should validate the Happy Hour Name Text Box
    And user should select the day option radio button
    And User should Enter Happy Hour Name "Day Happy Hour with Percentage"
    And User should select Same for All day Checkbox
    And User should select the Time to Apply Happy Hour
    And User should select the Menu Items to Apply Happy Hour One
    And User should select the Percentage Option in Menus Section
    And User should Enter the Percentages to Each Menus
    And User should Click Save button
    And User should save the Happy hour information in Data sheet

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

@DayHappyHourwithPrice
  Scenario Outline: As a RMS User, Add Happy Hour using day with Price
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    Then User should redirects to Happy Hours Section
    And User should click Add Happy hour button
    And User should Enter Happy Hour Name "Day Happy Hour with Price"
    And user should select the day option radio button
    And User should select Same for All day Checkbox
    And User should select the Time to Apply Happy Hour
    And User should select the Menu Items to Apply Happy Hour Two
    And User should select the Price Option in Menus Section
    And User should Enter the Price Amount to Each Menus
    And User should Click Save button
    And User should save the Happy hour information in Data sheet

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
      
@DateHappyHourwithPercentage
  Scenario Outline: As a RMS User, Add Happy Hour using date with percentage
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    Then User should redirects to Happy Hours Section
    And User should click Add Happy hour button
    And User should Enter Happy Hour Name "Date Happy Hour with Percentage"
    And user should select the Date option radio button
    And User should select the From Date and To Date
    And User should select the Time to Apply Happy Hour
    And User should select the Menu Items to Apply Happy Hour Three
    And User should select the Percentage Option in Menus Section
    And User should Enter the Percentages to Each Menus 
    And User should Click Save button
    And User should save the Happy hour information in Data sheet

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
      
@DateHappyHourwithPrice
  Scenario Outline: As a RMS User, Add Happy Hour using date with Price
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to Discount Configuration and Verify the Redirection
    Then User should redirects to Happy Hours Section
    And User should click Add Happy hour button
    And User should Enter Happy Hour Name "Date Happy Hour with Price"
    And user should select the Date option radio button
    And User should select the From Date and To Date
    And User should select the Time to Apply Happy Hour
    And User should select the Menu Items to Apply Happy Hour Four
    And User should select the Price Option in Menus Section
    And User should Enter the Price to Each Menus 
    And User should Click Save button
    And User should save the Happy hour information in Data sheet

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |