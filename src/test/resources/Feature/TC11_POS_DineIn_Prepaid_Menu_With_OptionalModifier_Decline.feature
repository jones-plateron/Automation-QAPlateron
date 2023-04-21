@DeclineFlow
Feature: POS DineIn Prepaid Order Menu with Optional Modifiers - Decline
 	@POSDineInPrepaidMenuwithModifierDecline
  Scenario: Happpy path DineIn Postpaid Order Without Tip
    Given  User should able to see Login Screen
    When  User should able to enter login credentials
    Then User should Select any table and verify that the guest count popup appears
    And User should able to select guest count Number and Click Proceed Button