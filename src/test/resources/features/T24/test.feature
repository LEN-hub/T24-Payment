@Auto_Test1
Feature: Auto_Test1




  @T24-OECutOff-001-Before
  Scenario:T24-OE CutOff-001-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |DBSSSGS0            |SGD                 |102                 |11010000470         |SGD                   |56456465        |LEI           |SHAR         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page


  @T24-OECutOff-002-Before
  Scenario:T24-OE CutOff-002-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |DBSSSGS0            |SGD                 |103                 |11010000470         |SGD                   |56456465        |LEI           |CRED         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page




  @T24-OECutOff-003-Before
  Scenario:T24-OE CutOff-003-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |DBSSSGS0            |SGD                 |104                 |11010000470         |SGD                   |56456465        |LEI           |DEBT         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page



  @T24-OECutOff-005-Before
  Scenario:T24-OECutOff-005-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11010000489         |DBSSSGS0                |USD                   |USD                 |270001            |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-006-Before
  Scenario:T24-OECutOff-006-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11010000489         |DBSSSGS0                |USD                   |USD                 |270002            |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @T24-OECutOff-007-Before
  Scenario:T24-OECutOff-007-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11010000489         |DBSSSGS0                |USD                   |USD                 |270003            |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-009-Before
  Scenario:T24-OECutOff-009-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931892         |DBSSSGS0                |EUR                   |EUR                 |301               |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-010-Before
  Scenario:T24-OECutOff-010-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931892         |DBSSSGS0                |EUR                   |EUR                 |302               |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-011-Before
  Scenario:T24-OECutOff-011-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931892         |DBSSSGS0                |EUR                   |EUR                 |304               |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-013-Before
  Scenario:T24-OECutOff-013-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931914         |DBSSSGS0                |HKD                   |HKD                 |500000            |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page




  @T24-OECutOff-014-Before
  Scenario:T24-OECutOff-014-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931914         |DBSSSGS0                |HKD                   |HKD                 |500001            |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-015-Before
  Scenario:T24-OECutOff-015-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931914         |DBSSSGS0                |HKD                   |HKD                 |500002            |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page




  @T24-OECutOff-017-Before
  Scenario:T24-OECutOff-017-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931906         |DBSSSGS0                |CNY                   |CNY                 |501               |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-018-Before
  Scenario:T24-OECutOff-018-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931906         |DBSSSGS0                |CNY                   |CNY                 |502               |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-019-Before
  Scenario:T24-OECutOff-019-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020931906         |DBSSSGS0                |CNY                   |CNY                 |503               |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @T24-OECutOff-021-Before
  Scenario:T24-OECutOff-021-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |SGD                 |600               |SGD142000001        |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page




  @T24-OECutOff-022-Before
  Scenario:T24-OECutOff-022-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information USD on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Bic|
      |CITIUS30            |USD                 |603               |USD142000001        |DBSSSGS0    |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page



  @T24-OECutOff-023-Before
  Scenario:T24-OECutOff-023-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |EUR                 |610               |EUR142000001        |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page




  @T24-OECutOff-024-Before
  Scenario:T24-OECutOff-024-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |HKD                 |611               |HKD142000001        |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page



  @T24-OECutOff-025-Before
  Scenario:T24-OECutOff-025-Before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |CNY                 |612               |CNY142000001        |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page