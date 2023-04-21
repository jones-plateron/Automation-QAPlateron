@FeaturePOS
Feature: Regression
	@POSTableManagement 
  Scenario: Table Management 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should validate the page header 
    #And User should validate the available Areas and Tables
    Then User should validate the GuestCount Popup
    
    #@MenusPageValidations
    Scenario: Menus Selection page Validation
    Given User should able to see Login Screen
    When  User should able to enter login credentials
    And User should navigate to Menus Section through Dine-In
    Then User should Validate the Category and Menus #from Excel
    And User should 
    