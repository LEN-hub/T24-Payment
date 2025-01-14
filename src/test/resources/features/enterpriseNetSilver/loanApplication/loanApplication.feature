@loanApplication
Feature: loan application

  @loan_Application_Micro_Current_Overdraft_UAT
    #微型活期透支
  Scenario:Select "≤1,000,000" for "Corporate Turnover (SGD)", select "Current Assets Loan" for the loan type, select the guarantor: Director, select the duration of the financial report: six months, enter the application amount: 10,000 Singapore dollars, "Micro Current "Overdraft" product loan application successful
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I hover over the loan business
    When I continue to fill in the information
      |amount|
      |10000 |
    When I select personal guarantor
      |name   |birthday  |idCard   |phoneNum   |email           |experience|
      |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
    When I declare my financial situation
      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
      |2020-12-08 |12       |11          |25          |12        |
    When I announce my financial report two
      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
      |2020-12-08 |12       |11          |25          |12        |
    When I fill out other financial commitments
      |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
      |test123                  |12      |1              |0                   |1   |
    When I upload the three required documents
    When I click next button on the upLoadFile page


  @loan_Application_Overdraft_UAT
    Scenario:Select “>1,000,000 and ≤ 20,000,000” for “Corporate Turnover (SGD)”, “Current Asset Loan” for the loan type, select collateral: real estate, select guarantor: personal guarantee-director; input the loan amount: 200,000; "Overdraft" product loan application successful
#     活期透支
      Given logon "INB-automation-SIT-login" on enterprise net silver
      When I hover over the loan business
      When I choose a turnover of one million to two million
        |amount|
        |200000|
      When I select real estate mortgage
        |houseAddress|zipCode|constructionArea|
        |test123     |123456 |140             |
      When I select personal guarantor
        |name   |birthday  |idCard   |phoneNum   |email           |experience|
        |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
      When I fill out other financial commitments on real estate mortgage
        |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
        |test123                  |12      |1              |0                   |1   |
      When I upload the five required documents
      When I click next button on the upLoadFile page

  @loan_Application_Collection_Financing_UAT
    Scenario:Select “>1,000,000 and ≤20,000,000” for “Corporate Turnover (SGD)”, select “Current Asset Loan” for the loan type, select the collateral: real estate, select the guarantor: personal guarantee - two directors, input the loan amount: 200,000; 30-Day Accounts Receivable Financing Product Loan Application Successful (Loan Currency Selection: USD)
#     收账融资
      Given logon "INB-automation-SIT-login" on enterprise net silver
      When I hover over the loan business
      When I choose collection financing
        |amount|
        |200000|
      When I select real estate mortgage
        |houseAddress|zipCode|constructionArea|
        |test123     |123456 |140             |
      When I select personal guarantor
        |name   |birthday  |idCard   |phoneNum   |email           |experience|
        |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
      When I fill out other financial commitments on real estate mortgage
        |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
        |test123                  |12      |1              |0                   |1   |
      When I provide primary buyer information
        |name   |RelationshipYears  |annualSales  |creditPeriod |
        |WANG WU|3                  |12           |12           |
      When I provide primary supplier information
        |name   |RelationshipYears  |annualSales  |creditPeriod |
        |WANG WU|3                  |12           |12           |
      When I upload the five required documents
      When I click next button on the upLoadFile page

  @loan_Application_Fixed_Asset_UAT
  Scenario:Select “>1,000,000 and ≤20,000,000” for “Corporate Turnover (SGD)”, select “Fixed Assets Loan” for the loan type, select the guarantor: Corporate Guarantee - a corporate shareholder, input the loan amount: 1.2 million; 1-year new auto financing product successful loan application
#    固定资产
    Given logon "INB-automation-SIT-login" on enterprise net silver
    When I hover over the loan business
    When I choose fixed asset loan
      |amount |
      |20000  |
    When I choose corporate guarantor
      |registeredName          |RegistrationNumber |registrationDate|address|city    |zipCode|Sex|
      |China Technology Group  |123123             |2010-02-14      |china  |beijing |713548 |Mr |
    When I fill out other financial commitments on company guarantee page
      |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|Reporting Period|second Reporting Period|
      |test123                  |12      |1              |0                   |1   |6 months        |12 months              |
#    When I enter vehicle details
#      |brand      |price |
#      |Lamborghini|20000 |
#    When I upload the five required documents
    When I upload the three required documents
    When I click next button and submit button


#    贷款支用。无授权
  @Loan_Drawdown-SGD
  Scenario:Accounts Payable Financing Loan Draw Application Process
    Given logon "INB-automation-SIT-login" on enterprise net silver
    When I click the loan draw button
    When I choose a product type to fill in the information
    |product type         |
    |Receivable Financing |
#    When I choose to apply for disbursement of financing receivables
    When I choose Singapore Dollar
    When I have filled in the other information
      |amount|dayNum|goodsDescr|
      |100   |30    |testAnd12 |
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
#    Then I should see Submitted successfully page


  @Loan_Drawdown-USD
  Scenario:Accounts Payable Financing Loan Disbursement Application Process (The payment currency is USD, no review is required)
    Given logon "INB-automation-SIT-login" on enterprise net silver
    When I click the loan draw button
    When I choose a product type to fill in the information
      |product type         |
      |Receivable Financing |
#    When I choose to apply for disbursement of financing receivables
    When I choose US Dollar
    When I have filled in the other information
      |amount|dayNum|goodsDescr|
      |100   |30    |testAnd12 |
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I should see Submitted successfully page

##    单人授权。需要提前更改账号的授权模式。
#  @loanApplication6
#  Scenario:Accounts2 Payable Financing Loan Draw Application Process
#    Given logon "netSilverEnvLoan_Tian" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose single-player license management mode
#    And Confirm the authorization mode and submit it
#    When secondary authorized person notification is then displayed
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful
#    When I should switch to the second authorized account
#    When logon second "netSilverEnvLoan_Tian2" on enterprise net silver
#    When I click My Tasks button on the logon page
#    Then I should direct to the Awaiting authorization page
#    When I click on the first piece of data to authorize
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    When I should switch to the second authorized account
#    When  logon second "netSilverEnvLoan_Tian" on enterprise net silver
#    When I click the loan draw button
#    When I choose to apply for disbursement of financing receivables
#    When I choose Singapore Dollar
#    When I have filled in the other information
#      |amount|dayNum|goodsDescr|fileAddress|
#      |100   |30    |testAnd12 |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    When I should switch to the second authorized account
#    Given logon second "netSilverEnvLoan_Tian2" on enterprise net silver
#    When I click My Tasks button on the logon page
#    Then I should direct to the Awaiting authorization page
#    When I click on the first piece of data to authorize
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now



#    还款。
    @Loan_Repayment_SGD
Scenario:For accounts receivable financing products, the repayment date is 5 days after the current date, within 1 month, if it does not exceed the due date, and it is fully settled in advance (loan currency: SGD, product term: 30 days), the repayment is successful
      Given logon "INB-automation-SIT-login" on enterprise net silver
      When I click the loan Manage ment Button
      When I click SGD Prepay button
#      Then TC code is then required for Vkey authentication
#      When I get the TC code and click Next
#      When I typed TC Code and click Authenticate Now
#      Then I should see Submitted successfully page

#        @Loan_Repayment_USD
# Scenario:For accounts receivable financing products, the repayment date is 5 days after the current date, within 1 month, if it does not exceed the due date, and it is fully settled in advance (loan currency: USD, product term: 30 days), the repayment is successful
#      Given logon "INB-automation-SIT-login" on enterprise net silver
#      When I click the loan Manage ment Button
#      When I click USD Prepay button
#      Then TC code is then required for Vkey authentication
#      When I get the TC code and click Next
#      When I typed TC Code and click Authenticate Now
#      Then I should see Submitted successfully page






