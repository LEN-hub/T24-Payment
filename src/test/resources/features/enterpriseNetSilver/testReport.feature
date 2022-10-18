@testReport
Feature: e-Statement


  @loanApplication2
  Scenario:Select “>1,000,000 and ≤20,000,000” for “Corporate Turnover (SGD)”, select “Current Asset Loan” for the loan type, select the collateral: real estate, select the guarantor: personal guarantee - two directors, input the loan amount: 200,000; 30-Day Accounts Receivable Financing Product Loan Application Successful (Loan Currency Selection: USD)
#     收账融资
    Given logon "netSilverEnv_Kevin" on enterprise net silver
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


#    #    在线开户+小额透支贷款
#  @testLoan0291
##  单币种 新币+贷款
#  Scenario: The new bank customer initiated the "new auto financing" product loan application successfully
#    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
#    When click open Account page
#    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD and loan
#    And Provide Essential Information
#      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
#      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|200808897E |
#    Then Enter Connected People's Details
#    And Enter Connected Entities’ Details
#    Then Create Company Administrators’ Profiles
#    And Share Account’s Risk Profile
#    When I click the continue button to go to the loan page
#      |loan Amount |
#      |100000      |
#    Then Upload Supporting Documents on loan page
#    And Review Details
##    Then get Organisation ID
#
#  @openAccountUSD
#    #单币种账户——美元+贷款
#  Scenario:openAccount Current Account CA_USD and loan
#    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
#    When click open Account page
#    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_USD and loan
#    And Provide Essential Information
#      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
#      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
#    Then Enter Connected People's Details
#    And Enter Connected Entities’ Details
#    Then Create Company Administrators’ Profiles
#    And Share Account’s Risk Profile
#    When I click the continue button to go to the loan page
#      |loan Amount |
#      |100000      |
#    Then Upload Supporting Documents on loan page
#    And Review Details
#    Then get Organisation ID


    #    贷款支用。无授权
  @loanApplication4
  Scenario:Accounts Payable Financing Loan Draw Application Process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
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


  @loanApplication5
  Scenario:2Accounts Payable Financing Loan Disbursement Application Process (The payment currency is USD, no review is required)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
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


     #定期存款_新币_六个月_不转存
  @reporttest123
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|1                    |

      #六个月_新币_不转存_全部支取
  @report444
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits First menu
    Then I operate on the current page data information
      | fdAccountNumber |
      | 16010002192     |
