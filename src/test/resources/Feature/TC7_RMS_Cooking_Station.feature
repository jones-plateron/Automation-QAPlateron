@CookingStations @RMS
Feature: Cooking Station Validations

  @UIValidationCS
  Scenario Outline: As a RMS User, I need to Verify the Cooking Station
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should click Menus section and verify the page redirection
    And User should click Cooking Stations section and verify page redirection
    Then User should click Add Cooking Station button and verify slide Popup
    And User should verify the Cooking station Name Text Bx and Error Message "Enter valid name"
    And User should verify the Categories and Menus in Slide Popup
    And User should verify the Selected Menu Items Section after adding menus
    And User should verify Cancel and Save button in SlidePopup

    Examples: 
      | mobileNumber | otp    |
      |   1100110011 | 666666 |    
      
  @CookingStationCreation
  Scenario Outline: As a RMS User, I need to Create the Cooking Station
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should click Menus section and verify the page redirection
    And User should click Cooking Stations section and verify page redirection
    Then User should click Add Cooking Station button and verify slide Popup
    And User should Add New Cooking Station and Verify Edit and Delete functionality
    And User should Add Cooking station based on the Number of Categories
    And User Should verify the Search functionality in Cooking Station

    Examples: 
      | mobileNumber | otp    |
      |   1100110011 | 666666 |