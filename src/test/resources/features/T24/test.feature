@Auto_Test
Feature: Auto_Test



  @Payment_OE_Outgoing_Bank_Transfer_USD-USD_UAT_Amount<threshold
  Scenario:Payment_OE_Outgoing_Bank_Transfer_(USD-USD)_UAT Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information USD on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Bic|
      |CITIUS30            |USD                 |19989             |USD142000001        |CITISGS0    |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page


  @Payment_OE_Outgoing_Bank_Transfer_SGD-SGD_UAT_Amount<threshold
  Scenario:Payment_OE_Outgoing_Bank_Transfer_(SGD-SGD)_UAT Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |SGD                 |10531             |SGD142000001        |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page




