@Auto_Test1
Feature: Auto_Test1




#  @T24-OECutOff-024-After
#  Scenario:T24-OECutOff-024-After
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |27                |HKD142000001        |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#
#
#  @T24-OECutOff-025-After
#  Scenario:T24-OECutOff-025-After
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |31                |CNY142000001        |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page


  @Regression-Incoming-0004-After
  Scenario:Regression-Incoming-0004-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23234DGF0LDF0|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page


























