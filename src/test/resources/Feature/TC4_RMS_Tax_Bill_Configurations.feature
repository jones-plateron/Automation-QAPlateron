@BillSettingsConfig
Feature: Configuring the Pre-defined Bill Settings

  @ConfigurationTemp @Test
  Scenario Outline: Configuration by Data Driven 
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should Click Settings Sections
    Then User should verify the Page redirection to Settings Page "Date and Time Format"
    And User should click Bill configuration and update the sales tax percentage #Excel Input
    And User should Enable or Disable Apply sales tax on Subtotal after Deductions Option #Excel Input 
		And User should Enable or Disable Apply sales tax on Tip after Deductions Option #Excel Input
		And User should enter the Service Fee Percentage #Excel Input
		And User should enable or Disable the Service fee tax option #Excel Input
		And User should enable or Disable the Apply service fee on the subtotal after deductions #Excel Input
		And User should click Save button in Bill Configuration page
		When User should click gratuity configuration section
		Then User enable or disable the Gratuity option #Excel Input
		And User should select Checkbox Guest Count or Order Amount #Excel Input
		And User should enter the Gratuity Percentage #Excel Input
		And User should verify and Enter Gratuity eligibility #Excel Input Two
		And User should Enter the Gratuity tax percentage #Excel Input
		And User should enable or Disable the Apply gratuity on subtotal after deductions #Excel Input
		And User should click save button in Gratuity configuration page
		
    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |