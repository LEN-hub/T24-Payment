@Auto_Test
Feature: Auto_Test



  @Incoming_Payment_235-0
  Scenario:Regression-Incoming-0004-2,3
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201KKGM0FDM|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201KKGM0FDM|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010003267    |
    When I click Find Butt
    Then Assert enter Account Details Page

  @Incoming_Payment_999-1
  Scenario:Regression-Incoming-0003-2,3
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201MKMGGFBG|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010001981   |
    When I click Find Butt
    Then Assert enter Account Details Page


  @Incoming_Payment_235-2
  Scenario:Regression-Incoming-0005-2,3
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201MK0LHBB0|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201MK0LHBB0|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010001981    |
    When I click Find Butt
    Then Assert enter Account Details Page


  @Incoming_Payment_999-3
  Scenario:Regression-Incoming-0011-2,3
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23201BKK0FFCB|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010003267    |
    When I click Find Butt
    Then Assert enter Account Details Page