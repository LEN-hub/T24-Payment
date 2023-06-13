@Auto_Test
Feature: Auto_Test

  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<250K_Beneficiary_Country_Code=HK
  Scenario:AA Disbursement External USD-USD Amount<250K Beneficiary Country Code=HK
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA Disbursement External Button
    Then I enter input the Disbursement External Page
    Then Assert enter Disbursement External Page
    When I input information on the Loan Disbursement External Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
      |18500002891         |USD           |USD             |2150          |HK                      |
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

  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<250K_Beneficiary_Country_Code=US
  Scenario:AA Disbursement External USD-USD Amount<250K Beneficiary Country Code=US
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA Disbursement External Button
    Then I enter input the Disbursement External Page
    Then Assert enter Disbursement External Page
    When I input information on the Loan Disbursement External Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
      |18500002891         |USD           |USD             |2160          |US                      |
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

  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<250K_Beneficiary_Country_Code=HK
  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount<250K Beneficiary Country Code=HK
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA AA Disbursement (SGMEPS) Button
    Then I enter input the Disbursement SGMEPS Page
    When I input information on the Loan Disbursement SGMEPS Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
      |18000001608         |SGD           |SGD             |2200          |345665                |CITISGS0            |lei             |
    Then I input information on the SGMEPS Beneficiary Details Page
      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
      |teselei                |1234                 |SINGRORE             |HK                 |HK                           |
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


  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<250K_Beneficiary_Country_Code=US
  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount<250K Beneficiary Country Code=US
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA AA Disbursement (SGMEPS) Button
    Then I enter input the Disbursement SGMEPS Page
    When I input information on the Loan Disbursement SGMEPS Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
      |18000001608         |SGD           |SGD             |2180          |345665                |CITISGS0            |lei             |
    Then I input information on the SGMEPS Beneficiary Details Page
      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
      |teselei                |1234                 |SINGRORE             |US                 |US                           |
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