@Auto_Test1
Feature: Auto_Test1


  @Payment_OE_001_before_Amount<threshold
  Scenario:Payment_OE_001_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |DBSSSGS0            |SGD                 |1001                |11021162892         |SGD                   |56456465        |LEI           |SHAR         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
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
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_002_before_Amount<threshold
  Scenario:Payment_OE_002_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |DBSSSGS0            |SGD                 |1002                |11021162892         |SGD                   |56456465        |LEI           |CRED         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
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
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_003_before_Amount<threshold
  Scenario:Payment_OE_003_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |DBSSSGS0            |SGD                 |1003                |11021162892         |SGD                   |56456465        |LEI           |DEBT         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
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
    When I Assert enter View Page
    Then I Assert enter View Details Page


  @Payment_OE_005_before_Amount>threshold
  Scenario:Payment_OE_005_before_Amount>threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021162906         |DBSSSGS0                |USD                   |USD                 |6000005           |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_006_before_Amount>threshold
  Scenario:Payment_OE_006_before_Amount>threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021162906         |DBSSSGS0                |USD                   |USD                 |6000006           |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_007_before_Amount>threshold
  Scenario:Payment_OE_007_before_Amount>threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021162906         |DBSSSGS0                |USD                   |USD                 |6000007           |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_009_before_Amount<threshold
  Scenario:Payment_OE_009_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |609               |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_010_before_Amount<threshold
  Scenario:Payment_OE_010_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |610               |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_011_before_Amount<threshold
  Scenario:Payment_OE_011_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |611               |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_013_before_Amount>threshold
  Scenario:Payment_OE_013_before_Amount>threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |6000013           |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_014_before_Amount>threshold
  Scenario:Payment_OE_014_before_Amount>threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |6000014           |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_015_before_Amount>threshold
  Scenario:Payment_OE_015_before_Amount>threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |6000015           |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_017_before_Amount<threshold
  Scenario:Payment_OE_017_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |617               |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_018_before_Amount<threshold
  Scenario:Payment_OE_018_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |618               |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_019_before_Amount<threshold
  Scenario:Payment_OE_019_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |619               |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
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
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_021_before_Amount<threshold
  Scenario:Payment_OE_021_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |SGD                 |621               |11021162892         |4656465         |CITISGS0    |rew          |
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

  @Payment_OE_022_before_Amount<threshold
  Scenario:Payment_OE_022_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |USD                 |622               |11021162906         |4656465         |CITISGS0    |rew          |
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

  @Payment_OE_023_before_Amount<threshold
  Scenario:Payment_OE_023_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |EUR                 |623               |11021200662         |4656465         |CITISGS0    |rew          |
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

  @Payment_OE_024_before_Amount<threshold
  Scenario:Payment_OE_024_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |HKD                 |624               |11021200646         |4656465         |CITISGS0    |rew          |
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

  @Payment_OE_025_before_Amount<threshold
  Scenario:Payment_OE_025_before_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |CNY                 |625               |11021200638         |4656465         |CITISGS0    |rew          |
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

#  @Incoming_Payment_999_0001_After
#  Scenario:Incoming_Payment_999_0001_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL232420LCGGMJD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page



#  @Regression-Outgoing-Channel0017-Before
#  Scenario:Regression-Outgoing-Channel0017-Before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentHKD
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |HKD     |
#    And I choose the payment currency
#      |Currency|
#      |HKD     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#
#
#  @Regression-Outgoing-Channel0024-Before
#  Scenario:Regression-Outgoing-Channel0024-Before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentCNY
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |CNY     |
#    And I choose the payment currency
#      |Currency|
#      |CNY     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#







