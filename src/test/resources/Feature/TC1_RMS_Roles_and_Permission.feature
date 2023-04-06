@Rolesandpermission
Feature: Roles and permission

  @UIValidation
  Scenario Outline: As a RMS User, I need to Check roles and permission for Manager,Waiter and Busser
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default
    Then User should verify by default "Manager","Waiter" and "Busser" Roles are available under the Jobs
    Then User should verify "POS Access" Section is present and "Regenerate PIN","Shift Review" and "Clock-In/Clock-Out" options is present under POS Access Section
    Then User should verify "This permission allows the employee to regenerate PIN from POS. An SMS containing the new PIN would to sent to the employee's mobile number" instruction under the Regenerate PIN option
    Then User should verify "This permission allows the employee to review their shift form POS" instruction is present under Shift Review option
    And User should verify "This permission allows the employee to clock-in/clock-out form POS" instruction is present under Clock-In/Clock-Out options
    Then User should verify "Order Management" section is present and "View All Orders","View My Orders","Refund" and "Discount" options is present under Order Management Section
    And User should verify "This permission allows the employee to view any order that is raised in the restaurant" instruction is present under View All Orders option
    Then User should verify "This permission allows the employee to view only the order that is waited by him/her in the restaurant" instruction is present under View My Orders option
    Then User should verify "This permission allows the employee to initiate refund to the order amount" instruction is present under Refund option
    And User should verify "This permission allows the employee to apply discounts for the order" instruction is present under Discount option
    Then User should verify "Other Permissions" Section is present and verify "Settings" option present under Other Permissions Section
    And User should verify "This permission enables the employee to view control the POS teminal settings" instruction is present under Settings option
    Then User should able to Click Restaurant Portal and Verify the Page
    And User should verify the all option is selected as default for manager
		
    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @AddJobPopup
  Scenario Outline: As a RMS User, I need to validate the jobs popup
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default
    And User should able to click Add Jobs Button and verify the Add Jobs popup opens
    Then User should able to enter the "<Job Name with Special character>" and verify "Name should not include special character!!" indication appears
    When User should able to clear the entered name and verify "Please enter valid job name" indication appears
    Then User should able to see and Click cancel Button and verify the Popup get closed
    Then User should able to see and Click X icon and verify the Popup get Closed

    Examples: 
      | mobileNumber | otp    | Job Name with Special character |
      |   7777777723 | 666666 | Ac@;'.';'?/'                    |

  @AddingJobs
  Scenario Outline: As a RMS User, I need to Create new jobs and set permission for the New Role
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default
    Then User should add the New job "Job Name" and Click save Button
    Then User should verify the New Jobs is added in the available job list
    Then User should able to see the edit icon and click edit icon to edit the Role Name "<Edit Name>"
    And User should verify the role name is Changed

    Examples: 
      | mobileNumber | otp    | Edit Name  |
      |   7777777723 | 666666 | Edited Job |

  @EditPermission
  Scenario Outline: As a RMS User, I need to edit the permission
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default
    And User should able to select the Job and edit the permission

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @DeleteJob
  Scenario Outline: As a RMS User, I need to delete the Role
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default
    And User should able to delete the Role by clicking delete Button
    Then User should verify the delete popup opens and Verify "Would you like to delete"
    And User should verify the popup get closed when User clicks X icon or Cancel Button
    Then User should verify the job gets deleted when User clicks delete Button

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |

  @ReassignJob
  Scenario Outline: As a RMS User, I need to delete by Re-assigning
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default
    And Verify the Re-assign popup opens and Verify "need to be re-assigned to any of the available roles before deleting" instruction
    Then User should able to Re-assign the employee to other role
    And Verify User should able to Close by clicking either X icon or Cancel Button
    Then Verify User should able to delete the Role by clicking Proceed Button

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
      
    @Delete  
  Scenario Outline: As a RMS User, I need to delete by Re-assigning
    Given Login to the restaurant with "<mobileNumber>" and "<otp>"
    When User should redirects to employees section
    Then User should able to click jobs option and verify the "Manager" option is selected by default 
    Then User should able to Delete all the Jobs

    Examples: 
      | mobileNumber | otp    |
      |   7777777723 | 666666 |
