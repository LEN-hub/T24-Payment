@Auto_Test1
Feature: Auto_Test1



  #BEFORE 1105
#  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-001before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-001before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9001                |11010006320         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |LEN&DEB   |honghai     |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-002before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-002before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |900002              |11010006320         |AED                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |LEN&DEB   |honghai     |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|AED        |
#
#  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-003before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-003before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9003                |11010006320         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |LEN&DEB   |honghai     |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-004before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-004before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9004                |11010006320         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-005before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-005before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |900005              |11010006320         |AED                   |56456465        |LEI&(1)'.,    |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |Hai&13,.()'|testabc   |SG              |12345    |11021162906          |LEN&DEB   |honghai     |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|AED        |
#
#  @Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-008before
#  Scenario:Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-008before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |EBILAEA0            |AED                 |9008              |11010006320         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
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
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-009before
#  Scenario:Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-009before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |EBILAEA0            |AED                 |9009              |11010006320         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
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
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|AED        |
#
#  #其它币种
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_T24-012before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_T24-012before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |9000012             |11010006320         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-013before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-013before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9000013             |11010006320         |USD                   |56456465        |LEI&13,.()'   |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|USD        |
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-014before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-014before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9000014             |11021162906         |USD                   |56456465        |LE            |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_UAT_T24-015before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_UAT_T24-015before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |3915                |11021162906         |HKD                   |56456465        |LE            |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|HKD        |
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_UAT_T24-016before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_UAT_T24-016before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |3916                |11021162906         |EUR                   |56456465        |LE&           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|EUR        |
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_UAT_T24-017before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_UAT_T24-017before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000917             |11021162906         |CNY                   |56456465        |LE&           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|CNY        |
#
#  @Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-018before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-018before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9900918             |11021162906         |AUD                   |56456465        |LE&           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-019before
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-019before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9000919             |11021162906         |AUD                   |56456465        |LE&           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|AUD        |

#after 1105
  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-001after
  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-001after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |EBILAEA0            |AED                 |9000001             |11010006762         |AED                   |56456465        |Lei&(),.- 12  |SHAR         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
      |Li&(),.- 12|testabc   |SG              |12345    |11010006762          |LEN&DEB   |Hi&(),.- 13 |23456     |teste     |SG            |
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
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account IDCA
    Then I find account
      |Arrangement|
      |11010006762|

  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-002after
  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-002after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |EBILAEA0            |AED                 |9002                |11021210463         |AED                   |56456465        |Lei&(),.- 12  |DEBT         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
      |Li&(),.- 12|testabc   |SG              |12345    |11021210463          |LEN&DEB   |Hi&(),.- 13|23456     |teste     |SG            |
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
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account ID
    Then I find account CASGD
      |Arrangement|Currency   |
      |11021162884|AED        |

  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-003after
  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-003after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |EBILAEA0            |AED                 |9000003             |11010006762         |AED                   |56456465        |Lei&(),.- 12  |CRED         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
      |Li&(),.- 12|testabc   |SG              |12345    |11010006762          |LEN&DEB   |Hi&(),.- 13 |23456     |teste     |SG            |
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
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account IDCA
    Then I find account
      |Arrangement|
      |11010006762|

  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-004after
  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-004after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |EBILAEA0            |AED                 |9000004             |11010006762         |AED                   |56456465        |Lei&(),.- 12  |CRED         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
      |Li&(),.- 12|testabc   |SG              |12345    |11010006762          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account IDCA
    Then I find account
      |Arrangement|
      |11010006762|

  @Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-005after
  Scenario:Payment_OE_Outgoing_Customer_Transfer_AED-AED_UAT_T24-005after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
      |EBILAEA0            |AED                 |9000005             |11021210463         |AED                   |56456465        |Lei&(),.- 12  |DEBT         |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
      |Li&(),.- 12|testabc   |SG              |12345    |11021210463          |LEN&DEB   |Hi&(),.- 13 |23456     |teste     |SG            |
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
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account ID
    Then I find account CASGD
      |Arrangement|Currency   |
      |11021162884|AED        |

  @Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-008after
  Scenario:Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-008after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |EBILAEA0            |AED                 |9000008           |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
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
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account IDCA
    Then I find account
      |Arrangement|
      |11010006762|

  @Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-009after
  Scenario:Payment_OE_Outgoing_Bank_Transfer_AED-AED_UAT_T24-009after
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |EBILAEA0            |AED                 |9000009           |11021210463         |4656465         |CITISGS0    |New&(2)',.e  |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
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
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account ID
    Then I find account CASGD
      |Arrangement|Currency   |
      |11021162884|AED        |

  #其它币种

#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_T24-012after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_T24-012after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |9012                |11010006320         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-013after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-013after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9013                |11010006320         |USD                   |56456465        |LEI&13,.()'   |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|USD        |
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-014after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_T24-014after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9014                |11021162906         |USD                   |56456465        |LE            |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_UAT_T24-015after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_UAT_T24-015after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |9000015             |11021162906         |HKD                   |56456465        |LE            |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|HKD        |
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_UAT_T24-016after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_UAT_T24-016after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000016             |11021162906         |EUR                   |56456465        |LE&           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|EUR        |
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_UAT_T24-017after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_UAT_T24-017after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9017                |11021162906         |CNY                   |56456465        |LE&           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|CNY        |
#
#  @Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-018after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-018after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9018                |11021162906         |AUD                   |56456465        |LE&           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#  @Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-019after
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_AUD-AUD_UAT_T24-019after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9019                |11021162906         |AUD                   |56456465        |LE&           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1 |Post Code1|Town Name1|Debtor Country|
#      |li&12,.()' |test      |SG              |12345    |11021162906          |Le&12,.()'|Hai&13,.()'  |23456     |teste     |SG            |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|AUD        |




#GLDBCR-1100

#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_SIT_Amount<threshold
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |100                 |11021083925         |SGD                   |56456465        |LEI           |DEBT         |
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
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020236302|
#







 #UAT GLDBCR-1054 before


#  @Payment_OE_PACS008_AUD-AUD_UAT_Amount<threshold_T24-009before
#  Scenario:Payment_OE_PACS008_AUD-AUD_UAT_Amount<threshold_T24-009before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11010006320         |ANZBAU30                |AUD                   |AUD                 |6009             |56456465           |LEI             |SHA          |
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
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#

#案例继续

#  @Payment_OE_PACS009_AUD-AUD_UAT_Amount<threshold_T24-016before
#  Scenario:Payment_OE_PACS009_AUD-AUD_UAT_Amount<threshold_T24-016before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |ANZBAU30            |AUD                 |60016             |11010006320         |4656465         |CITISGS0    |rew          |
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
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#incoming

#  @Incoming_Payment_999_001_before
#  Scenario:Incoming_Payment_999_001_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23324BBJJDHFK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006320|
#
#
#  @Incoming_Payment_999_002_before
#  Scenario:Incoming_Payment_999_002_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23324GGDCDLDC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11021162884|AUD        |
#


#UAT GLDBCR-26



 # SIT GLDBCR-1040

#  @Ordering_Customer_Name>35char_INB_Overseas_Test001_SGD-SGD
#  Scenario:Ordering Customer Name>35char INB Overseas Test001 SGD-SGD
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges|
#      |1101 0003 321 |SHA                     |
#    And I choose the payment currency
#      |Currency|
#      |SGD     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0DOD     |
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
#      |Bic is DBS SGD-SGD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-SGD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS SGD-SGD |

#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(SGD-SGD)Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2500001             |11010003321         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(USD-USD)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2500002           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(EUR-EUR)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2500003           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(HKD-HKD)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2500004           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(CNY-CNY)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2500005           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(SGD-SGD)Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |25001               |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(USD-USD)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |25002             |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(EUR-EUR)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |25003             |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(HKD-HKD)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |25004             |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(CNY-CNY)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |25005             |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##网银案例
#
#
#  @Payment_Overseas_Transfer_SGD-SGD_SIT
#  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->SGD)
##    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
##    When I click on overseas transfer payment and select the account
##    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
##      |Account Number|Payment Mode for Charges|
##      |1101 0003 321 |SHA                     |
##    And I choose the payment currency
##      |Currency|
##      |SGD     |
##    When I enter the payee information
##      |Payee's Account Number|Payee's Name|
##      |667812798             |lucky       |
##    When I choose the receiving bank
##      |Beneficiary Bank|
##      |DBSSSGS0DOD     |
##    When I choose the recipient country
##      |Payee's Address |Payee's Country|Comments For Payee|
##      |countries & len |UNITED STATES  |ok                |
##    When I choose the nature of payment
##      |Purpose of Transfer|
##      |Commission         |
##    When I choose to submit the transfer information
##    When Vkey authorization for Payment transactions in the SIT environment
##    Then I will compare all the data on FX Payment MX Message
##      |WordPath          |
##      |Bic is DBS SGD-SGD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-SGD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS SGD-SGD |
#
#
#
#  @Payment_Overseas_Transfer_MCY_USD-USD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(USD-USD)(SIT_MCY)
##    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
##    When I click on overseas transfer payment and select the account
##    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
##      |Account Number|Payment Mode for Charges |Currency|
##      |1102 0938 757 |OUR                      |USD     |
##    And I choose the payment currency
##      |Currency   |
##      |USD        |
##    When I enter the payee information
##      |Payee's Account Number|Payee's Name|
##      |667812798             |lucky       |
###    When I click on the receiving bank drop down box
##    When I choose the receiving bank
##      |Beneficiary Bank|
##      |DBSSSGS0VEC     |
##    When I choose the recipient country
##      |Payee's Address |Payee's Country|Comments For Payee|
##      |countries       |UNITED STATES  |ok                |
##    When I choose the nature of payment
##      |Purpose of Transfer|
##      |Commission         |
##    When I choose to submit the transfer information
##    When Vkey authorization for Payment transactions in the SIT environment
##    Then I will compare all the data on FX Payment MX Message
##      |WordPath          |
##      |Bic is DBS USD-USD|
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
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936754|
#
#
#
#  @Payment_Overseas_Transfer_MCY_HKD-HKD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(HKD-HKD)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |HKD     |
#    And I choose the payment currency
#      |Currency   |
#      |HKD        |
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
#      |Bic is DBS HKD-HKD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS HKD-HKD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS HKD-HKD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS HKD-HKD|Bic is DBS HKD-HKD|
#
#
#
#  @Payment_Overseas_Transfer_MCY_EUR-EUR_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(EUR-EUR)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |EUR     |
#    And I choose the payment currency
#      |Currency   |
#      |EUR        |
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
#      |Bic is DBS EUR-EUR|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS EUR-EUR|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS EUR-EUR|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS EUR-EUR|Bic is DBS EUR-EUR|
#
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0024before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)_0024before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
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
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#
#
#
#
#
##第二次跑
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(SGD-SGD)Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2600001             |11010003321         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(USD-USD)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2600002           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(EUR-EUR)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2600003           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(HKD-HKD)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2600004           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(CNY-CNY)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2600005           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(SGD-SGD)Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2601                |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(USD-USD)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2602              |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(EUR-EUR)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2603              |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(HKD-HKD)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2604              |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(CNY-CNY)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2605              |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##第三次跑
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(SGD-SGD)Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2700001             |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(USD-USD)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2700002           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(EUR-EUR)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2700003           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(HKD-HKD)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2700004           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(CNY-CNY)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2700005           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##第四次跑，需要特殊的多币种账户，账户名称特殊，替换里面的账户
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(SGD-SGD)Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2710001             |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(USD-USD)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2710002           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(EUR-EUR)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2710003           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(HKD-HKD)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2710004           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(CNY-CNY)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2710005           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##第5次跑
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(SGD-SGD)Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                           |
#      |DBSSSGS0            |SGD                 |2501                |11010003321         |SGD                   |56456465        |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(USD-USD)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                        |
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2502              |56456465           |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666|
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(EUR-EUR)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                         |
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2503              |56456465           |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666 |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(HKD-HKD)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                         |
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2504              |56456465           |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666 |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(CNY-CNY)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                    |
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2505              |56456465           |Best & Good etc 1Best & Good etc 999999999888888881234567890ABCDEFJ |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(SGD-SGD)Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2800001             |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(USD-USD)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2800002           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(EUR-EUR)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2800003           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(HKD-HKD)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2800004           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(CNY-CNY)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2800005           |56456465           |Best & Good etc |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#
## 第6次跑收款账户的地址
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(SGD-SGD)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2601                |11020938765         |SGD                   |56456465        |Kang           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name                                                                      |Town Name                                                     |Creditor Country|
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888  |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#    #收款账户地址大于35会报错并强制为35以内
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(USD-USD)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(EUR-EUR)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |1003              |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(HKD-HKD)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |1004              |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(CNY-CNY)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |1005              |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(SGD-SGD)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2900001             |11020938765         |SGD                   |56456465        |Kang           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name        |Town Name                |Creditor Country|
#      |Best & Good etc#*  |Best & Good etc 123456#* |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#    #收款账户地址大于35会报错并强制为35以内
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(USD-USD)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2900002           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(EUR-EUR)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2900003           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(HKD-HKD)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2900004           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(CNY-CNY)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2900005           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#   #结束
#
#
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                     |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name       |Town Name         |Creditor Country|
#      |SINGAPORE         |WANGKUNG          |SG              |
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
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                   |
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff            |
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
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kang           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name                                               |Town Name                                                 |Creditor Country|
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |SG              |
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
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                        |Beneficiary Town                                        |
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff    |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff |
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
#    #修改Debitor相关信息再执行脚本
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                     |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name                                               |Town Name                                                 |Creditor Country|
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |SG              |
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
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                   |
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                        |Beneficiary Town                                        |
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff    |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff |
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
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name             |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Best & Good etc           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name       |Town Name         |Creditor Country|
#      |Best & Good etc   |Best & Good etc   |SG              |
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
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name           |
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Best & Good etc            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |Best & Good etc    |Best & Good etc |
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








# UAT GLDBCR-1025

#  @Payment_OE_Outgoing_ISO_Customer_SGD-SGD_UAT_berore-001
#  Scenario:Payment_OE_Outgoing_ISO_Customer_SGD-SGD_UAT_berore-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |100                 |11010005898         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency|
#      |11021162884|SGD     |






#  @Payment_OE_Outgoing_ISO_Customer_SGD-SGD_UAT_Amount>Threshold-001
#  Scenario:Payment_OE_Outgoing_ISO_Customer_UAT(SGD-SGD)_Amount>threshold-001
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |9000001             |11021162892         |SGD                   |56456465        |LEI           |CRED         |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|






#  @Payment_Overseas_Transfer_MCY_USD-USD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(USD-USD)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0927 720 |OUR                      |USD     |
#    And I choose the payment currency
#      |Currency   |
#      |USD        |
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
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936754|

#
#
#  @Payment_Overseas_Transfer_MCY_HKD-HKD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(HKD-HKD)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |HKD     |
#    And I choose the payment currency
#      |Currency   |
#      |HKD        |
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
#      |Bic is DBS HKD-HKD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS HKD-HKD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS HKD-HKD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS HKD-HKD|Bic is DBS HKD-HKD|
#
#
#
#  @Payment_Overseas_Transfer_MCY_EUR-EUR_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(EUR-EUR)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |EUR     |
#    And I choose the payment currency
#      |Currency   |
#      |EUR        |
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
#      |Bic is DBS EUR-EUR|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS EUR-EUR|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS EUR-EUR|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS EUR-EUR|Bic is DBS EUR-EUR|
#
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0024before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)_0024before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
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
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0025before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)_0025before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
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
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0026before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)0026before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |SHA                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
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
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0027before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY) 0027before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
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
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0028before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY) 0028before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
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
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|


#  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold_001after
#  Scenario:AA Disbursement External USD-USD Amount<threshold_001after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
#      |18000000504         |USD           |USD             |1000          |HK                      |
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
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_003after
#  Scenario: AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_003after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500003294         |SGD           |100000.00       |SGD             |11021162892     |
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

#
#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold_004after
#  Scenario: Regression-Outgoing-T24-LOAN Disbursement-004after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18000000490         |USD           |2500024         |USD             |11010002015     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page

#  @Payment_Overseas_Transfer_SGD-USD_SIT_0005before
#  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->USD)_0005before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |
#      |1101 0000 470 |BEN                      |
#    And I choose the payment currency
#      |Currency|
#      |USD     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0DOD     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment
#      |WordPath          |
#      |Bic is DBS SGD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-USD|
#    Then I do field mapping for Channel and T24 in FX Payment
#      |WordPath          |
#      |Bic is DBS SGD-USD|
#    When I compare the amount is normal
#      |WordPath          |
#      |Bic is DBS SGD-USD|
#    When I compare the data generated by Outgoing Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS SGD-USD|Bic is DBS SGD-USD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS SGD-USD |
#
#
#  @Payment_Overseas_Transfer_USD-USD_SIT_0007before
#  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->USD)_0007before
#    Given logon "INB-automation-SIT-login2" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges|
#      |1101 0005 332 |SHA                     |
#    And I choose the payment currency
#      |Currency   |
#      |USD        |
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
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS USD-USD |






#  @Payment_OE_Outgoing_Customer_USD-USD_SIT-022before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT-022before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020327189         |DBSSSGS0                |USD                   |USD                 |1000              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936754|
#
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT-023before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT-023before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |2023              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
##    When I Assert enter View Page to USD
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT-024before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT-024before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |20024             |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
##    When I Assert enter View Page to USD
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT-025before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT-025before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |2025              |56456465           |LEI             |SHA          |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|

#
#  @Payment_OE_Outgoing_Bank_USD-USD_SIT-027before
#  Scenario:Payment_OE_Outgoing__Bank_USD-USD_SIT-027before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |9000027           |11020936770         |4656465         |CITISGS0    |rew          |
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
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936754|
#
#  @Payment_OE_Outgoing_Bank_EUR-EUR_SIT-028before
#  Scenario:Payment_OE_Outgoing__Bank_EUR-EUR_SIT-028before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |900028            |11020936673         |4656465         |CITISGS0    |rew          |
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
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936622|
#
#  @Payment_OE_Outgoing_Bank_HKD-HKD_SIT-029before
#  Scenario:Payment_OE_Outgoing__Bank_HKD-HKD_SIT-029before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |90029             |11020936665         |4656465         |CITISGS0    |rew          |
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
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936606|
#
#  @Payment_OE_Outgoing_Bank_CNY-CNY_SIT-030before
#  Scenario:Payment_OE_Outgoing__Bank_CNY-CNY_SIT-030before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |90030             |11020936681         |4656465         |CITISGS0    |rew          |
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
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936649|
#
#
#
#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT-021before
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_021before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |40                  |SGD140200001        |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Bank_SGD-SGD_SIT-026before
#  Scenario:Payment_OE_Outgoing__Bank_SGD-SGD_SIT-026before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |5026              |11020936584         |4656465         |CITISGS0    |rew          |
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
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936576|


#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT_Amount>Threshold-002after
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_Amount>threshold-002after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |6000002             |11020936584         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT_Amount>Threshold-003after
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_Amount>threshold-003after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |6000003             |11020936584         |SGD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Bank_SGD-SGD_SIT_Amount>Threshold-016after
#  Scenario:Payment_OE_Outgoing__Bank_SGD-SGD_SIT_Amount>Threshold-016after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |6000016           |11020936584         |4656465         |CITISGS0    |rew          |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|

#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT_Amount<Threshold-021before
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_Amount<threshold-021before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |900021              |11020236310         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
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
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020236302|
#



#  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-004before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-004before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000004           |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-005before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-005before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000005           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-006before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-006before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000006           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-007before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-007before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6007              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-008before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-008before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6008              |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-009before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-009before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6009              |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-010before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-010before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000010           |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-011before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-011before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000011           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-012before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-012before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000012           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-013before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-013before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6013              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-014before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-014before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6014              |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-015before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-015before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6015              |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
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
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|
#
#  @Payment_OE_Outgoing_Bank_USD-USD_SIT_Amount<Threshold-017before
#  Scenario:Payment_OE_Outgoing__Bank_USD-USD_SIT_Amount<Threshold-017before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |6017              |11020936592         |4656465         |CITISGS0    |rew          |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Bank_EUR-EUR_SIT_Amount>Threshold-018after
#  Scenario:Payment_OE_Outgoing__Bank_EUR-EUR_SIT_Amount>Threshold-018after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |6000018           |11020936673         |4656465         |CITISGS0    |rew          |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Bank_HKD-HKD_SIT_Amount>Threshold-019after
#  Scenario:Payment_OE_Outgoing__Bank_HKD-HKD_SIT_Amount>Threshold-019after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |6000019           |11020936665         |4656465         |CITISGS0    |rew          |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Bank_CNY-CNY_SIT_Amount>Threshold-020after
#  Scenario:Payment_OE_Outgoing__Bank_CNY-CNY_SIT_Amount>Threshold-020after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |6000020           |11020936681         |4656465         |CITISGS0    |rew          |
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
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|



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







