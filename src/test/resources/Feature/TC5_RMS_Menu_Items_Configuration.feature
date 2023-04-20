@MenuSection 
Feature: Menus Items section validations

  @ModifierMenuValidations
  Scenario Outline: As a RMS User, Validate Modifiers section
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should click Menus section and verify the page redirection
    And User should click Modifiers button and verify the Add Modifiers Popup "TestMod"
    And User should verify the Modifier Name Edit and Delete options of category "TestMod"
    And User should verify the Add Modifier item slide pop-up and text box
    #bug Need to un hide step line
    And User should add Modifier Items under Modifier "Test1" "Test2" "Test3" then Edit and Delete Modifier
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
      #modify above line before run
    And User should click Modifier Name and verify Modifier Items Count
    Then User should verify Modifier count in Modifier button

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @CategoryValidations
  Scenario Outline: As a RMS User, Validate Category section
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should click Menus section and verify the page redirection
    Then User should verify Add Categories button and Add Category pop-up
    And User should should Add new Category and verify Edit and Delete options of category
    And User should verify the Add Menu Slide Pop-up and text box
    #Bug double time Clicking Add Modifier button inside Menu (logic-for the Second time)
    And User should add Menu Items under Categories "AutoCategory1" and "AutoCategory2"
      | MenuName    | Modifier Type  | Price | Description                     |
      | Menu Item1  | Vegetarian     |  1.99 | Description Test Menu one       |
      | Menu Item2  | Non-Vegetarian |  2.99 | Description Test Menu two       |
      | Menu Item3  | Vegan          |  3.99 | Description Test Menu three     |
      | Menu Item4  | Vegetarian     |  4.99 | Description Test Menu four      |
      | Menu Item5  | Non-Vegetarian |     5 | Description Test Menu five      |
      | Menu Item6  | Vegan          |  6.99 | Description Test Menu six       |
      | Menu Item7  | Vegetarian     |    75 | Description Test Menu seven     |
      | Menu Item8  | Non-Vegetarian |  8.99 | Description Test Menu eight     |
      | Menu Item9  | Vegan          |  9.99 | Description Test Menu nine      |
      | Menu Item10 | Vegetarian     |    10 | Description Test Menu ten       |
      | Menu Item11 | Non-Vegetarian |   100 | Description Test Menu eleven    |
      | Menu Item12 | Vegan          |     1 | Description Test Menu twelve    |
      | Menu Item13 | Vegan          |    20 | Description Test Menu thirteen  |
      | Menu Item14 | Vegan          | 33.33 | Description Test Menu fourteen  |
      | Menu Item15 | Vegan          | 66.66 | Description Test Menu fifteen   |
      | Menu Item16 | Vegan          | 22.22 | Description Test Menu sixteen   |
      | Menu Item17 | Vegan          |    15 | Description Test Menu seventeen |
      | Menu Item18 | Vegan          |  0.99 | Description Test Menu eighteen  |
      | Menu Item19 | Vegan          |    12 | Description Test Menu nineteen  |
      | Menu Item20 | Vegan          | 13.99 | Description Test Menu twenty    |
    #modify above line before run
    And User should verify the add modifier slide list inside Menu
    And User should add Menu Items with modifiers under Category "ModifierCate"
      | MenuModifier1 | Non-Vegetarian | 1.99 |
      | MenuModifier2 | Vegetarian     | 3.99 |
      | MenuModifier3 | Vegan          | 7.99 |
    #modify above line before run
    And User should verify the Menu items Edit option
    And User should verify the Menu items Delete option
    And User should verify the Menu items Count on Category Name
    And User should verify the Category Count on Categories button
    And User should Publish the menu after updation

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @PublishMenuValidations
  Scenario Outline: As a RMS User, Validate Publish Menu popup section
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should click Menus section and verify the page redirection
    Then User should add "Newcategory" and verify that publish menu status as "Added" and count
    #modify above line before run
    And User should verify the Publish Menu pop-up and Click publish
    And User should add "NewMenu" inside Category and verify that publish menu status as "Existing" and "Added"
    #verify unmapped Items count
    And User should Edit the "NewMenu" and verify that publish menu status as "Existing" and "Modified"
    And User should delete the "NewMenu" and verify that publish menu status as "Existing" and "Removed"
    And User should add some Menus and verify the status in Publish Menu
    	| MenuName | Modifier Type  | Price | Description		                |
      | PubMenu1 | Non-Vegetarian |    14 | Description Test Publish Menu |
      | PubMenu2 | Vegan          |  0.99 | Description Test Publish Menu |
      | PubMenu3 | Non-Vegetarian |    12 | Description Test Publish Menu |
      | PubMenu4 | Vegetarian     | 13.99 | Description Test Publish Menu |
    And User should perform rearrange and verify the status in publish Menu
    And User should verify "Menu Not Published" notification bar with "Publish Menu to save the changes made to the menu items" text

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

#@DeleteMenus
  #Scenario Outline: As a RMS User, Validate Publish Menu popup section
    #Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    #When User should click Menus section and verify the page redirection
    #Then Deleting Menus and Categories
#
    #Examples: 
      #| mobileNumber | otp    |
      #|   7777777723 | 666666 |      