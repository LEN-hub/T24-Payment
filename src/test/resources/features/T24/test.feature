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








#
#
##  @T24-LOAN_Disbursement-0002-Before
##  Scenario:T24-LOAN_Disbursement-0002-Before
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I click Loan Transactions Button
##    Then I click AA AA Disbursement (SGMEPS) Button
##    Then I enter input the Disbursement SGMEPS Page
##    When I input information on the Loan Disbursement SGMEPS Page
##      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
##      |19900000048         |SGD           |SGD             |10            |345665                |CITISGS0            |lei             |
##    Then I input information on the SGMEPS Beneficiary Details Page
##      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
##      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
##    Then I get LoanPINumber
##    Then I click pre-submit button
##    When I click Accept Overrides
##    Then Assert Result whether Successful
##    And I close driver
##    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
##    When I click Loan Transactions Button
##    Then I click Authorise/Delete Arrangements (PO) Button
##    Then I input PI Number and click Find
##    Then Assert Result whether Successful
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the Payments Enquiry - Transaction wise page
##    Then I input LoanPINumber and click Find
##    When I Assert enter View Page to USD Loan SGMEPS
##    Then I Assert enter View Details Page
#
#
#
#
#  @T24-LOAN_Disbursement-0003-Before
#  Scenario: T24-LOAN_Disbursement-0003-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500001089         |SGD           |1000050         |SGD             |11010000470     |
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
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page
#
#
#
#
#
#  @T24-LOAN_Disbursement-0004-Before
#  Scenario: T24-LOAN_Disbursement-0004-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18000000490         |USD           |7               |USD             |11010000489     |
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
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page



#  @Regression-Incoming-0003-Before
#  Scenario:Regression-Incoming-0003-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23234HLDG0GMH|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#
#  @Regression-Incoming-0005-Before
#  Scenario:Regression-Incoming-0005-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23234GCCKM0DK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#
#  @Regression-Incoming-0011-Before
#  Scenario:Regression-Incoming-0011Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23234HLLGBKBH|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#
#  @Regression-Incoming-0004-Before
#  Scenario:Regression-Incoming-0004-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL232340M0DKLKK|
#    When I change status code SGD
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL232340M0DKLKK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page





#  @T24-LOAN_Disbursement-0001-Before
#  Scenario: T24-LOAN_Disbursement-0001-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|
#      |18000000490         |USD           |USD             |1000007       |
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
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page




#
#  @Regression-Incoming-0012-Before
#  Scenario:Regression-Incoming-0012-Before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23234DL0CKBHG|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page


  @Regression-Incoming-0001-Before
  Scenario:Regression-Incoming-0001-Before
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23234J0GMGBDJ|
    When I change status code USD
    Then I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23234J0GMGBDJ|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page




