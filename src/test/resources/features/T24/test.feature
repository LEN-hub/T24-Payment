@Auto_Test1
Feature: Auto_Test1

  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-004before
  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-004before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000004           |56456465           |LEI             |SHA          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936576|

  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-005before
  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-005before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000005           |56456465           |LEI             |BEN          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936576|

  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-006before
  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-006before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000006           |56456465           |LEI             |OUR          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936576|

  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-007before
  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-007before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6007              |56456465           |LEI             |SHA          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936622|

  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-008before
  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-008before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6008              |56456465           |LEI             |BEN          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936622|

  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-009before
  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-009before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6009              |56456465           |LEI             |OUR          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936622|

  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-010before
  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-010before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000010           |56456465           |LEI             |SHA          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936606|

  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-011before
  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-011before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000011           |56456465           |LEI             |BEN          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936606|

  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-012before
  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-012before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000012           |56456465           |LEI             |OUR          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936606|

  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-013before
  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-013before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6013              |56456465           |LEI             |SHA          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936649|

  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-014before
  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-014before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6014              |56456465           |LEI             |BEN          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936649|

  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-015before
  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-015before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6015              |56456465           |LEI             |OUR          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936649|

  @Payment_OE_Outgoing_Bank_USD-USD_SIT_Amount<Threshold-017before
  Scenario:Payment_OE_Outgoing__Bank_USD-USD_SIT_Amount<Threshold-017before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |USD                 |6017              |11020936592         |4656465         |CITISGS0    |rew          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936576|

  @Payment_OE_Outgoing_Bank_EUR-EUR_SIT_Amount<Threshold-018before
  Scenario:Payment_OE_Outgoing__Bank_EUR-EUR_SIT_Amount<Threshold-018before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |EUR                 |6018              |11020936673         |4656465         |CITISGS0    |rew          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936622|

  @Payment_OE_Outgoing_Bank_HKD-HKD_SIT_Amount<Threshold-019before
  Scenario:Payment_OE_Outgoing__Bank_HKD-HKD_SIT_Amount<Threshold-019before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |HKD                 |6019              |11020936665         |4656465         |CITISGS0    |rew          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936606|

  @Payment_OE_Outgoing_Bank_CNY-CNY_SIT_Amount<Threshold-020before
  Scenario:Payment_OE_Outgoing__Bank_CNY-CNY_SIT_Amount<Threshold-020before
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |CNY                 |6020              |11020936681         |4656465         |CITISGS0    |rew          |
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
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936649|



#  @Incoming_Payment_999_0027_After
#  Scenario:Incoming_Payment_999_0027_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249DMHLGJGC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_235-999_0028_After
#  Scenario:Incoming_Payment_235-999_0028_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249LKCFLHCK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_999_0030_After
#  Scenario:Incoming_Payment_999_0030_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249CL0M00KC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_999_0031_After
#  Scenario:Incoming_Payment_999_0031_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249BKJCBL0D|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_999_0032_After
#  Scenario:Incoming_Payment_999_0032_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249MHKCMKCC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Payment_OE_008_After_Amount<threshold
#  Scenario:Payment_OE_008_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |608               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_012_After_Amount<threshold
#  Scenario:Payment_OE_012_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |612               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_016_After_Amount<threshold
#  Scenario:Payment_OE_016_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |616               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_020_After_Amount<threshold
#  Scenario:Payment_OE_020_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |620               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_027_After_Amount<threshold
#  Scenario:Payment_OE_027_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |627               |11021162906         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_028_After_Amount<threshold
#  Scenario:Payment_OE_028_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |628               |11021200646         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_029_After_Amount<threshold
#  Scenario:Payment_OE_029_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |629               |11021200662         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_030_After_Amount<threshold
#  Scenario:Payment_OE_030_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |630               |11021200638         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#


#
#  @Incoming_Payment_999_0029_After
#  Scenario:Incoming_Payment_999_0029_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23244GCKMMKL0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#
#  @Payment_OE_004_After_Amount>threshold
#  Scenario:Payment_OE_004_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000003             |11021162892         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_026_After_Amount>threshold
#  Scenario:Payment_OE_026_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |6000021           |11021162892         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page



#  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold_after001
#  Scenario:AA_Disbursement_External_USD-USD_Amount<threshold_after001
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
#      |18500002891         |USD           |USD             |100             |HK                    |
#    Then I input information on the Beneficiary Details Page
#      |Beneficiary Account No|Beneficiary Name|
#      |3242343               |kang            |
#    When I enter Routing Details Page and added information
#      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
#      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page

#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount>threshold_after_002
#  Scenario:AA_Disbursement_(SGMEPS)_SGD-SGD_Amount>threshold_after_002
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
#      |18500002905         |SGD           |SGD             |1000007        |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page
#      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
#      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code SGD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan SGMEPS
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_after_003
#  Scenario: AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_after_003
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500003189         |SGD           |9000            |SGD             |11010001981     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page

#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold_after004
#  Scenario: AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold_after004
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500002891         |USD           |250007          |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page


#  @Payment_OE_001_After_Amount>threshold
#  Scenario:Payment_OE_001_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000001             |11021162892         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_002_After_Amount>threshold
#  Scenario:Payment_OE_002_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000002             |11021162892         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_003_After_Amount>threshold
#  Scenario:Payment_OE_003_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000003             |11021162892         |SGD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_005_After_Amount<threshold
#  Scenario:Payment_OE_005_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |205               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_006_Before_Amount>threshold
#  Scenario:Payment_OE_006_Before_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |6000006           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_007_After_Amount<threshold
#  Scenario:Payment_OE_007_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |607               |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_009_After_Amount>threshold
#  Scenario:Payment_OE_009_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |6000009           |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_010_After_Amount>threshold
#  Scenario:Payment_OE_010_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |6000010           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_011_After_Amount>threshold
#  Scenario:Payment_OE_011_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |6000011           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_013_After_Amount<threshold
#  Scenario:Payment_OE_013_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |613               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_014_After_Amount<threshold
#  Scenario:Payment_OE_014_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |614               |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page


#  @Payment_OE_015_Before_Amount>threshold
#  Scenario:Payment_OE_015_Before_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |6000015           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page


#  @Payment_OE_017_Before_Amount<threshold
#  Scenario:Payment_OE_017_Before_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |617               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_018_Before_Amount<threshold
#  Scenario:Payment_OE_018_Before_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |618               |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_019_Before_Amount<threshold
#  Scenario:Payment_OE_019_Before_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |619               |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page

#  @Payment_OE_021_After_Amount>threshold
#  Scenario:Payment_OE_021_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |6000021           |11021162892         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_022_After_Amount>threshold
#  Scenario:Payment_OE_022_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |6000022           |11021162906         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_023_After_Amount>threshold
#  Scenario:Payment_OE_023_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |6000023           |11021200662         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_024_After_Amount>threshold
#  Scenario:Payment_OE_024_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |6000024           |11021200646         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_025_After_Amount>threshold
#  Scenario:Payment_OE_025_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |6000025           |11021200638         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page


#  @Payment_Loan_Disbursement_External_USD-USD_Amount>threshold_001_before
#  Scenario:AA_Disbursement_External_USD-USD_Amount>threshold_001
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|
#      |18500002891         |USD           |USD             |10000001       |
#    Then I input information on the Beneficiary Details Page
#      |Beneficiary Account No|Beneficiary Name|
#      |3242343               |kang            |
#    When I enter Routing Details Page and added information
#      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
#      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#
#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<threshold_002_before
#  Scenario:AA_Disbursement_(SGMEPS)_SGD-SGDAmount<250K_002_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
#      |18000001608         |SGD           |SGD             |1002          |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page
#      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
#      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan SGMEPS
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount>threshold_003_before
#  Scenario: AA_Disbursement_Internal_SGD-SGD_Amount>threshold_003_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500003189         |SGD           |1000003         |SGD             |11010002716     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K_004_before
#  Scenario: AA_Disbursement_Internal_SGD-SGD_Amount>threshold_004_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500002891         |USD           |1004            |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page



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







