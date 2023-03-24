@tag
Feature: Manage Table
  I want to use this template for my feature file

  @tag1
  Scenario Outline: 
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should able to Click POS System Sections and Verify page redirected to POS System
    And User should able to verify POS System has two Section Manage Table and POS Setup
    Then User should able to Click POS Setup section
    And User should validate the POS Setup page

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
#Validating the TakeOut Page
  @tag2
  Scenario Outline: 
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should able to Click POS System Sections and Verify page redirected to POS System
    Then User should able to verify Manage Table has two button DineIn and TakeOut
    And User should able to Click TakeOut Button
    Then User should Verify the Page is Redirected to TakeOut page
    And User should able to See "Avoid Queue !" and "Your guests can place Take-out order by scanning this QR" on top of the QR Frame
    Then User should able to see Restaurant name "Automation Testing" inside the frame
    And User should able to verify the QR Code is displayed
    Then User should able to Verify the Words "Scan with your phone camera to order" below the QR Code
    Then User should able to see the Powered by "Powered by"and plateron Logo below the frame
    And User should able to see Print Button Below the Frame

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
      
#Validating the AddTable
  @tag3
  Scenario Outline: 
    Given Login to the restaurant with "<mobileNumber>" and "<otp>" 
    When User should able to Click POS System Sections and Verify page redirected to POS System
    Then User should able to Click Add Table Button on top right corner of the page
    Then User should able to Verify the Add Table Popup opens 
    And User should able to see the Area Option and +Add Area Button
    And User should able to see the Cancel button and Save button
    Then User should able to See and Click X Icon on top of the Popup
    Then User should click +Add Area Button and Verify Select Area Words "Select Area" appearing
    Then User should able to See Area TextBox and Validate the TextBox
    Then User should able enter AreaName in the Area TextBox
    Then User should able to see the Table Name and Seating Capacity option
    And User should able to Validate the Table Name Textbox
    Then User should able to Validate the Seating Capacity Textbox
    Then User should able to enter the Table Name and Seating Capacity inside the Text Box
    And User should able to Click Save Button 
    Then User should able to see the Newly added Area name is Selected and Validate the page
    Then User should able to see and Click the Dropdown under the Area
    And User should Verify all Available area is showing under the Dropdown
    Then User should able to Select any Area and verify the selected area is showing inside the dropdown
    Then User should able to enter Table Name,Seating Capacity and Click Save Button
    Then User should Verify the Area is Selected and Verify the Name on the top of the page
    And User should verify the Total Table count under the Area Name
    Then User should able to see the Tables inside the page
    And User should able to Click any Table
    
    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
   #Validating the Table
    @tag4
  Scenario Outline: 
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should able to Click POS System Sections and Verify page redirected to POS System
    Then User should able to select any Area and Select any Table
    And User should able to see Table,Seats and Waiter Name "Table" , "Seats" and "Waiter Name"
    Then User should able to see and Click Preview option  
    And User should verify preview Popuop Opens and user should able to see Header as Print Screen "Print Screen"
    Then User should able to see Restaurant Name "Automation Testing" ,Table"Table" and Table Name inside the Frame 
    And User should able to see "Scan with your phone camera to order" word inside the frame
    Then User should able to see and Click the Cancel button 
    Then User should able to See print Button "Print all Tables" 
    
    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
      
      
      #Validating the Rearrange
    @tag4
  Scenario Outline: 
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should able to Click POS System Sections and Verify page redirected to POS System
    Then User should able to rearrange the Area and Validate the Rearrange Position
    And User should able to Rearrance the Table and Validate the Rearranged Position
      
     Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 | 
   
    
    
    
    
  