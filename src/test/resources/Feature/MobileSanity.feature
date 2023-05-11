
Feature: Validate the Restaurant Search Functionality

  @PickUpCardflow @MobSanity
  Scenario Outline: Verifying the PickUp flow
    Given User is on the Restaurants Page
    Then User should click the profile icon and verify the page redirection to Login page
    Then User should click skip option and verify the page redirection to Restaurant page
    Then User should click the profile icon and verify the page redirection to Login page
    Then User should click the Mobile text box and enter the "<MobileNumber>" and click Continue
    Then User should verify the page redirection to OTP page and enter the "<OTP>"
    Then User should verify the page redirection to account creation page "Welcome to Plateron !" and enter "<FirstName>" "<LastName>" "<EmailAddress>" "<DOB>"
    Then User Should verify Search for Restaurants bar
    When User should Click and search the Restaurant Name
    Then User should validate Result Restaurant Text
    When User should select the Restaurant
    Then User should validate page Redirected to Menu list "Search for items"
    When User Should Search menuName in Search for Items Bar and select the Menu
    When User Should Click place Order button
    Then User Should Verify the Page Redirection to Checkout
    Then User Should Verify Subtotal
    And User Should Verify Sales Tax
    And User Should Verify Service Fee
    And User Should Verify Service Fee Tax
    And User Should Verify Gratuity
    And User Should Verify Gratuity Tax
    And User Should Verify Total
    And User Should Click Pay Now
    Then User Should verify Page Redirected to Payment Page
    #Need to add Next line
    And User Should Verify Payment Successful
    Then User should verify the order details

    Examples: 
      | MobileNumber | OTP    | FirstName | LastName | EmailAddress            | DOB        |
      |   9872345436 | 666666 | Mark      | Antony   | markantony121@gmail.com | 01/12/1995 |

  @DineInflow1 @MobSanity
  Scenario Outline: Prepaid DineFlow
    Given User is on the Restaurants Page
    Then User should get the URL of the Table
    Then User should validate page Redirected to Menu list "Search for items"
    When User Should Search menuName in Search for Items Bar and select the Menu
    When User Should Click place Order button
    Then User Should Verify the Page Redirection to Confirm Order page
    When User Should Click Confirm Order button
    Then User should Validate the PayBill page
    Then User Should verify Page Redirected to Payment Page
    #Need to add Next line
    And User Should Verify Payment Successful
    Then User should verify the order details for DineIn Flow

    Examples: 
      | MobileNumber | OTP    | FirstName | LastName | EmailAddress            | DOB        |
      |   9872345436 | 666666 | DineIn    | Qr       | markantony121@gmail.com | 01/12/1995 |

  @DineInflow2
  Scenario Outline: Postpaid DineFlow
    Given User is on the Restaurants Page
    Then User should get the URL of the Table
    Then User should validate page Redirected to Menu list "Search for items"
    When User Should Search menuName in Search for Items Bar and select the Menu
    When User Should Click place Order button
    Then User Should Verify the Page Redirection to Confirm Order page
    When User Should Click Confirm Order button

    Examples: 
      | MobileNumber | OTP    | FirstName | LastName | EmailAddress            | DOB        |
      |   9872345436 | 666666 | DineIn    | Postpaid | markantony121@gmail.com | 01/12/1995 |
