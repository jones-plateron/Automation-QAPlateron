Feature: 

  Scenario Outline: Verify the Add Employee page in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should verify the jobs dropdown contains the list of available jobs
    And User should click on Add Employee button and verify the Slide pop-up
    And User should click save button and verify the Error Messages in Mandatory Fields "Please enter valid display name" and "Please enter valid phone number"
    And User should verify the PIN Generation section
    And User should verify the Basic informations section
    And User should verify Professional Details section
    And User should verify the Cancel and Close button

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  Scenario Outline: Verify the New Employee Creation in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should click on Add Employee button and verify the Slide pop-up
    When User should Create an Employee with Mandatory Fields "<displayName>" "<phoneNumber>" and "<Role>"
    Then User should verify the Employee added to the Employee list
    When User should Create an Employee without Mandatory Fields "<firstName>" "<lastName>" "<emailAddress>" and "<employeeID>"
    Then User should verify the Error Message "Please enter valid phone number"
    When User should Create an Employee with All Fields

    Examples: 
      | mobileNumber | otp    | firstName | lastName | emailAddress    | employeeID | displayName | phoneNumber | Role    |
      |   7777777723 | 666666 | jones     | johnson  | jones@email.com | J123       | jonesJo     |  9566902940 | Manager |

  Scenario Outline: Creating multiple Employees in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should click on Add Employee button and verify the Slide pop-up
    When User should Create a New Employee with "<displayName>" "<phoneNumber>" and "<Role>" and store the Employee information
      | displayName | phoneNumber | Role    |
      | jonesJo     |  8566902940 | Manager |
      | jones1      |  8566902941 | Manager |
      | jones2      |  8566902942 | Waiter  |
      | jones3      |  8566902943 | Waiter  |
      | jones4      |  8566902944 | Busser  |
    Then User should verify the Total Employees Count
		And User should verify the Employee list contains Owner profile
		And User should verify Each Employee list contains Job type Mobile Number
		And User should verify Each Employee list contains PIN and OTP section
		And User should verify other than owner Each Employee list contains Mark as Inactive option
		And User should verify Mark as Inactive popup text and Cancel button when Clicked
		And User should verify Employee Details popup when user Clicks on Each Employee list
		And User should verify Search bar in Employees management page
		
		
		
    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
