@EmployeeManagem
Feature: Verify the Cooking station Page in RMS

  @Cookingstation
  Scenario Outline: Verify the Add Employee page in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should verify the jobs filter dropdown contains the list of available jobs
    And User should click on Add Employee button and verify the Slide pop-up
    And User should click save button and verify the Error Messages in Mandatory Fields "Please enter valid display name" and "Please enter valid phone number"
    And User should verify the PIN Generation section
    And User should verify the Basic informations section
    And User should verify Professional Details section
    And User should verify the Cancel and Close button

    Examples: 
      | mobileNumber | otp    |
      |   2222222222 | 666666 |

 