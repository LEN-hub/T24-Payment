@PaymentUat_Loan
Feature: Payment Order(Loan Disbursement)

#  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<250K
#  Scenario:AA Disbursement External USD-USD Amount<250K
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|
#      |18000000490         |USD           |USD             |200           |
#    Then I input information on the Beneficiary Details Page
#      |Beneficiary Account No|Beneficiary Name|
#      |3242343               |kang            |
#    When I enter Routing Details Page and added information
#      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
#      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I enter View Page to USD Loan
#    Then I enter View Details Page


  @Payment_Loan_Disbursement_External_USD-USD_Amount=100M
  Scenario:AA Disbursement External USD-USD Amount=100M
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA Disbursement External Button
    Then I enter input the Disbursement External Page
    When I input information on the Loan Disbursement External Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|
      |18000000490         |USD           |USD             |750000        |
    Then I input information on the Beneficiary Details Page
      |Beneficiary Account No|Beneficiary Name|
      |3242343               |kang            |
    When I enter Routing Details Page and added information
      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
      |CITISGS0              |SINGAPORE             |SG                       |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I change status code USD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page to USD Loan
    Then I enter View Details Page




#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<100M
#  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount<100M
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
#      |18500001089         |SGD           |SGD             |1000000       |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page
#      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
#      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I enter View Page to USD Loan SGMEPS
#    Then I enter View Details Page


  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount=100M
  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount=100M
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA AA Disbursement (SGMEPS) Button
    Then I enter input the Disbursement SGMEPS Page
    When I input information on the Loan Disbursement SGMEPS Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
      |18500001089         |SGD           |SGD             |1000000       |345665                |CITISGS0            |lei             |
    Then I input information on the SGMEPS Beneficiary Details Page
      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I enter View Page to USD Loan SGMEPS
    Then I enter View Details Page

#
##    AA Disbursement Internal USD-USD
#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K
#  Scenario: AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500002891         |USD           |9              |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I enter View Page to USD Loan Internal
#    Then I enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<250K
#  Scenario: AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18000000040         |SGD           |9               |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I enter View Page to USD Loan Internal
#    Then I enter View Details Page