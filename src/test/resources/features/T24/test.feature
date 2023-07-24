@Auto_Test
Feature: Auto_Test




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

  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold
  Scenario:AA Disbursement External USD-USD Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA Disbursement External Button
    Then I enter input the Disbursement External Page
    Then Assert enter Disbursement External Page
    When I input information on the Loan Disbursement External Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
      |13000000879         |USD           |USD             |10            |HK                    |
    Then I input information on the Beneficiary Details Page
      |Beneficiary Account No|Beneficiary Name|
      |3242343               |kang            |
    When I enter Routing Details Page and added information
      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
      |CITISGS0              |SINGAPORE             |SG                       |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page


  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<threshold
  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA AA Disbursement (SGMEPS) Button
    Then I enter input the Disbursement SGMEPS Page
    When I input information on the Loan Disbursement SGMEPS Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
      |13600000284         |SGD           |SGD             |12            |345665                |CITISGS0            |lei             |
    Then I input information on the SGMEPS Beneficiary Details Page
      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan SGMEPS
    Then I Assert enter View Details Page



