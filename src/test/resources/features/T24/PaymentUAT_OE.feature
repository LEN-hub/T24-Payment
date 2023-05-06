@PaymentUat_OE
Feature: Outgoing Customer Transfer

  @Payment_OE_Transfer_SGD-SGD_UAT
  Scenario:Payment_OE_Transfer_UAT(SGD--SGD)
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
    |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |
    |DBSSSGS0            |SGD                 |11110               |11010001981         |SGD                   |56456465        |LEI           |
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input Debit Acc Number and click Find
    |Debit Acc Number|
    |11010001981     |
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input Debit Acc Number and click Find
      |Debit Acc Number|
      |11010001981     |
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page
    Then I enter View Details Page

