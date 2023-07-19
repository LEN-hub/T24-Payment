@Auto_Test
Feature: Auto_Test


  @Incoming_Payment_999_3
  Scenario:Regression-Incoming-0013
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23199KJLG0DLC|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11020233869    |
    When I click Find Butt
    Then Assert enter Account Details Page


  @Payment_Own_Transfer_USD-USD_SIT1
  Scenario:Regression-Outgoing Channel-0004
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 489   |1101 0005 332|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath|
      |USD-USD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath|
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-USD |
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath|
      |FUNDS.TRANSFER|USD-USD |
    Then I will map the page data
      |WordPath|
      |USD-USD |
    When I check the deduction amount on the Find Account page On Local Payment
      |windows Title            |WordPath|
      |AA Arrangement - SIT GLDB|USD-USD |




  @Payment_OE_Outgoing_Bank_Transfer_SGD-SGD_UAT_Amount<threshold1
  Scenario:Regression-Outgoing T24-0012-2,3
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |SGD                 |1054              |SGD142000001        |4656465         |CITISGS0    |rew          |
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


  @Payment_OE_Outgoing_Bank_Transfer_USD-USD_UAT_Amount<threshold2
  Scenario:Regression-Outgoing T24-0011-2,3
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information USD on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Bic|
      |CITIUS30            |USD                 |2000              |USD142000001        |CITISGS0    |
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

  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold1
  Scenario:Regression-Outgoing- T24-LOAN Disbursement-0001
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA Disbursement External Button
    Then I enter input the Disbursement External Page
    Then Assert enter Disbursement External Page
    When I input information on the Loan Disbursement External Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
      |17100007089         |USD           |USD             |100             |HK                    |
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
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page

  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<threshold2
  Scenario:Regression-Outgoing- T24-LOAN Disbursement-0002
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA AA Disbursement (SGMEPS) Button
    Then I enter input the Disbursement SGMEPS Page
    When I input information on the Loan Disbursement SGMEPS Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
      |13000001182         |SGD           |SGD             |101           |345665                |CITISGS0            |lei             |
    Then I input information on the SGMEPS Beneficiary Details Page
      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan SGMEPS
    Then I Assert enter View Details Page