@Auto_Test
Feature: Auto_Test


  @Incoming_Payment_999-2
  Scenario:Regression-Incoming-0008-1，3
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201GMKMGDKC|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010003151    |
    When I click Find Butt
    Then Assert enter Account Details Page



