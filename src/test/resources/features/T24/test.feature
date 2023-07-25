@Auto_Test
Feature: Auto_Test

#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount>threshold1
#  Scenario:Regression-Outgoing T24-0001-1,4
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11010000489         |DBSSSGS0                |USD                   |USD                 |1000001           |56456465           |LEI             |SHA          |
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
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount>threshold2
#  Scenario:Regression-Outgoing T24-0002-1,4
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11010000489         |DBSSSGS0                |USD                   |USD                 |1000002           |56456465           |LEI             |BEN          |
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
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount>threshold3
#  Scenario:Regression-Outgoing T24-0003-1,4
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11010000489         |DBSSSGS0                |USD                   |USD                 |1000003           |56456465           |LEI             |OUR          |
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
#
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_Amount>threshold4
#  Scenario:Regression-Outgoing T24-0005-1,4
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000004             |11010000470         |SGD                   |56456465        |LEI           |SHAR         |
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
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_Amount>threshold5
#  Scenario:Regression-Outgoing T24-0006-1,4
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000005             |11010000470         |SGD                   |56456465        |LEI           |CRED         |
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
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_UAT_Amount>threshold6
#  Scenario:Regression-Outgoing T24-0007-1,4
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000006             |11010000470         |SGD                   |56456465        |LEI           |DEBT         |
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
#
#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<threshold1
#  Scenario:Regression-Outgoing- T24-LOAN Disbursement-0002-2,4
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
#      |18500003189         |SGD           |SGD             |12            |345665                |CITISGS0            |lei             |
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
#
#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold2
#  Scenario: Regression-Outgoing- T24-LOAN Disbursement-0004-1,4
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18000001802         |USD           |250008          |USD             |11010002228     |
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
#


  @Incoming_Payment_999-1
  Scenario:Regression-Incoming-0004-1，4
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205HCK0HF00|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010002228    |
    When I click Find Butt
    Then Assert enter Account Details Page



  @Incoming_Payment_999-2
  Scenario:Regression-Incoming-0005-1，4
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205JBF0M0MD|
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
  Scenario:Regression-Incoming-0012-1，4
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205LFFCMFBF|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010002716    |
    When I click Find Butt
    Then Assert enter Account Details Page


  @Incoming_Payment_999-4
  Scenario:Regression-Incoming-0013-1，4
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205DLJCHLML|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010000314    |
    When I click Find Butt
    Then Assert enter Account Details Page



  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K-1
  Scenario: Regression-Outgoing- T24-LOAN Disbursement-0004-1,3
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions
    When I Input incomplete information on AA Disbursement Internal page
      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
      |18000001802         |USD           |1000005         |USD             |11010002228     |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan Internal
    Then I Assert enter View Details Page



  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<250K-2
  Scenario: Regression-Outgoing- T24-LOAN Disbursement-0003-1,3
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions
    When I Input incomplete information on AA Disbursement Internal page
      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
      |18500003189         |SGD           |1000002         |SGD             |11010002716     |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan Internal
    Then I Assert enter View Details Page