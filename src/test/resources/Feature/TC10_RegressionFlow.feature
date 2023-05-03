@FeaturePOS
Feature: Regression
	@POSTableManagement 
  Scenario: Table Management 
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    #Then User should validate the page header 
    #And User should validate the available Areas and Tables
    Then User should validate the GuestCount Popup
    
    @MenusPageValidations
    Scenario: Menus Selection page Validation
    Given User should able to see Login Screen
    When  User should able to enter login credentials
    And User should navigate to Menus Section through Dine-In
    Then User should Validate the Category and Menus #from Excel
    And User should Validate the Modifier Popup
    Then User should validate the RHS
    Then User should Validate the Search Functionality 
    And User should Click Sent to Kitchen Button
    
     @MapPrinters
     Scenario: Menus Selection page Validation
    Given User should able to see Login Screen
    When  User should able to enter login credentials
    And User should navigate to Settings Page 
    Then User should redirect to Map Printer Sections
    And User should Validate the Page
    Then User should Search for the Printer and Map the Printer for Billing station Printer 
    Then User should Validate the available Cooking station 
    And User should Map the Printers for available Cooking Station
    
    @ScreenTimeOut
    Scenario: Menus Selection page Validation
    Given User should able to see Login Screen
    When  User should able to enter login credentials
    And User should navigate to Settings Page 
    Then User should redirect to Screen TimeOut Sections
    Then User should validate the Screen TimeOut Page
    
    @CashDrawer
    Scenario: Menus Selection page Validation
    Given User should able to see Login Screen
    When  User should able to enter login credentials
    And User should navigate to Settings Page 
    Then User should Redirect to Cash Drawer Sections
    And User validate the Cash Drawer Options
    
    @PreparationTime
    Scenario: Menus Selection page Validation
    Given User should able to see Login Screen
    When  User should able to enter login credentials
    And User should navigate to Settings Page
    Then User should Redirect to Preparation Time Sections
    And User validate the Preparation Time Page