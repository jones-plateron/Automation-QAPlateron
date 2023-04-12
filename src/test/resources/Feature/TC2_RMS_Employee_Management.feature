@EmployeeManagement
Feature: Verify the Employee Management Page in RMS

  @AddEmployeepage 
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
      |   7777777723 | 666666 |

  @EmployeeCreation 
  Scenario Outline: Verify the New Employee Creation in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should click on Add Employee button and verify the Slide pop-up
    When User should Create an Employee with Mandatory Fields "<displayName>" and "<Role>"
    Then User should verify the Employee added to the Employee list
    When User should Create an Employee without Mandatory Fields "<firstName>" "<lastName>" "<emailAddress>" and "<employeeID>"
    Then User should verify the Error Message "Please enter valid phone number"

    Examples: 
      | mobileNumber | otp    | firstName | lastName | emailAddress      | employeeID | displayName  | Role    |
      |   7777777723 | 666666 | Tester     | Automate | AutoTes@emall.com | YH62       | AutTest34    | Manager |

  @Employeelist 
  Scenario Outline: Creating multiple Employees in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should click on Add Employee button and verify the Slide pop-up
    When User should Create a New Employee and store the Employee information
    Then User should verify the Total Employees Count
    And User should verify the Employee list contains Owner profile
    And User should verify Each Employee list contains Job type Mobile Number
    And User should verify Each Employee list contains PIN and OTP section
    And User should verify other than owner Each Employee list contains Mark as Inactive option
    And User should verify Mark as Inactive popup text and Cancel button when Clicked
    And User should verify Employee Details popup when user Clicks on Each Employee list
    And user should verify the search results in Employee page using Employee name Id or Phone
    And user should verify the text message "Can't find employee in the list." by enter UA text in Search Bar

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @EmployeeEdit
  Scenario Outline: Verify the Edit Employees functionality in RMS
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    #Then Verify user should able to modify the Employee information in RMS
    And User should verify Mark as Inactive popup text and Cancel button
    And user should verify the Employee has bee moved to bottom of rms (as Inactive)
    And Verify Each employee profile contains edit button in Employee details page

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
      
   #@InactiveEmployee
  #Scenario Outline: Verify the Edit Employees functionality in RMS
    #Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    #When User should redirects to employees section
    #And user should verify the Employee has bee moved to bottom of rms (as Inactive)
#
    #Examples: 
      #| mobileNumber | otp    |
      #|   7777777723 | 666666 |     
      
