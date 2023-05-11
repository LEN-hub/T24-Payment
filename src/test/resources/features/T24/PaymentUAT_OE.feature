@PaymentUat_OE
Feature: Outgoing Customer Transfer

  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_Amount<250K
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
    |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |
    |DBSSSGS0            |SGD                 |11110               |11010001981         |SGD                   |56456465        |LEI           |
    Then I input Street Name on the ISO Customer Transfer Page
    |Street Name|Town Name |Creditor Country|
    |liyukang   |testabc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page
    Then I enter View Details Page



  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount<250K
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
      |11010003267         |DBSSSGS0                |USD                   |USD                 |270000            |56456465           |LEI             |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page to USD
    Then I enter View Details Page



  @Payment_OE_Outgoing_Bank_Transfer_SGD-SGD_UAT_Amount<250K
  Scenario:Payment_OE_Outgoing_Bank_Transfer_(SGD-SGD)_UAT Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |SGD                 |2003              |USD142000001        |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page to OE Outgoing_Bank_Transfer
    Then I enter View Details Page


  @Payment_OE_Outgoing_Bank_Transfer_USD-USD_UAT_Amount<250K
  Scenario:Payment_OE_Outgoing_Bank_Transfer_(USD-USD)_UAT Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information USD on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Bic|
      |CITIUS30            |USD                 |2003              |USD142000001        |CITISGS0    |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page to OE Outgoing_Bank_Transfer
    Then I enter View Details Page