@MenuSection
Feature: Menus Items section validations

  @ModifierMenuValidations
  Scenario Outline: As a RMS User, Validate Modifiers section
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User shoild click Menus section and verify the page redirection
    And User should click Modifiers button and verify the Add Modifiers Popup
    And User should verify the Modifier Name Edit and Delete options
    And User should verify the Add Modifier item slide pop-up
    And User should add Modifier Items under Modifier
      | Modifier | Amount | Modifier Type  | Description             |
      | Item1    |      1 | Vegetarian     | Description Test one    |
      | Item2    |      2 | Non-Vegetarian | Description Test two    |
      | Item3    |      3 | Vegan          | Description Test three  |
      | Item4    |      1 | Vegetarian     | Description Test four   |
      | Item5    |      2 | Non-Vegetarian | Description Test five   |
      | Item6    |      3 | Vegan          | Description Test six    |
      | Item7    |      1 | Vegetarian     | Description Test seven  |
      | Item8    |      2 | Non-Vegetarian | Description Test eight  |
      | Item9    |      3 | Vegan          | Description Test nine   |
      | Item10   |      1 | Vegetarian     | Description Test ten    |
      | Item11   |      2 | Non-Vegetarian | Description Test eleven |
      | Item12   |      3 | Vegan          | Description Test twelve |
    And User should click Modifier Name and verify Modifier Items Count
    Then User should verify Modifier count in Modifier button
		
    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

      
  @ModifierMenuValidations
  Scenario Outline: As a RMS User, Validate Modifiers section
  	Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User shoild click Menus section and verify the page redirection
    Then User should click Categories  
    
    
  	Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |