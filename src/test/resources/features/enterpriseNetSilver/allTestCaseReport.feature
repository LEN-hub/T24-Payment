@loanApplicationabcd
Feature: loan application

  @loanApplication0
  Scenario:Select "≤1,000,000" for "Corporate Turnover (SGD)", select "Current Assets Loan" for the loan type, select the guarantor: Director, select the duration of the financial report: six months, enter the application amount: 10,000 Singapore dollars, "Micro Current "Overdraft" product loan application successful
    Given logon "netSilverEnv_Kevin" on enterprise net silver
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


  @loanApplication1
  Scenario:Select “>1,000,000 and ≤ 20,000,000” for “Corporate Turnover (SGD)”, “Current Asset Loan” for the loan type, select collateral: real estate, select guarantor: personal guarantee-director; input the loan amount: 200,000; "Overdraft" product loan application successful
#     活期透支
    Given logon "netSilverEnv_Kevin" on enterprise net silver
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

  @loanApplication3
  Scenario:Select “>1,000,000 and ≤20,000,000” for “Corporate Turnover (SGD)”, select “Fixed Assets Loan” for the loan type, select the guarantor: Corporate Guarantee - a corporate shareholder, input the loan amount: 1.2 million; 1-year new auto financing product successful loan application
#    固定资产
    Given logon "netSilverEnv_Kevin" on enterprise net silver
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
  Scenario:Accounts Payable Financing Loan Disbursement Application Process (The payment currency is USD, no review is required)
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
  @loanApplication7
  Scenario:For accounts receivable financing products, the repayment date is 5 days after the current date, within 1 month, if it does not exceed the due date, and it is fully settled in advance (loan currency: SGD, product term: 30 days), the repayment is successful
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click the loan Manage ment Button
    When I click SGD Prepay button
#      Then TC code is then required for Vkey authentication
#      When I get the TC code and click Next
#      When I typed TC Code and click Authenticate Now
#      Then I should see Submitted successfully page

    @loanApplication48
 Scenario:For accounts receivable financing products, the repayment date is 5 days after the current date, within 1 month, if it does not exceed the due date, and it is fully settled in advance (loan currency: USD, product term: 30 days), the repayment is successful
      Given logon "netSilverEnv_Kevin" on enterprise net silver
      When I click the loan Manage ment Button
      When I click USD Prepay button
#      Then TC code is then required for Vkey authentication
#      When I get the TC code and click Next
#      When I typed TC Code and click Authenticate Now
#      Then I should see Submitted successfully page



  Scenario:process for querying the account list
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account Details menu in the account

  @test99872
  Scenario:personal center online banking transaction query submission time selection nearly seven days
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When personal center online banking transaction query submission time selection nearly seven days

  Scenario:Transaction details list query process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click account Details to query and verify the presence of elements

  Scenario:Transaction query page flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account details query and click the query button to query

#  电子通知
  @ext123
  Scenario:Download e-Statement file successfully
#    Given Closing the Browser driver
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11020004223  |
    And I click search button
    Then I should see Account List
    When I click on the first data to download


#       电子通知
  @ext123test122
  Scenario:Download past e-statements successfully
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11020002212  |
    And I click search button
    Then I should see Account List
    When I click on the past data to download


#   电子通知
  @ext123test
  Scenario:Download the electronic notice and successfully generate the download task
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click My Downloads Btn
    When I click View eAdvices Btn
    When I click select button on the View eAdvices page
    When I click first data to download on the view eAdvices page


#      转存方式1代表不转存，2代表本金续存，3代表本息续存
#
#  定期存款_新币_六个月_不转存
#  @reporttest123
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|1                    |
#
#
  #定期存款_美元_六个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 047       |11020004223 |10000  |6 Months|1                    |

  #定期存款_新币_六个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|2                    |

  #定期存款_美元_六个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 047       |11020004223 |10000  |6 Months|2                    |

  #定期存款_新币_六个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|3                    |

  #定期存款_美元_六个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 047       |11020004223 |10000  |6 Months|3                    |


#  修改密码
  @forgotPassWordIDCard123
  Scenario:idCard Forgot password users log in normally after resetting their passwords
    Given open "netSilverEnvTian" on enterprise net silver
    When I click forgotPassword button
    When I input Enterprise customer number and other information
      |customerNumber |
      |200032         |
    When I click idCard button and input idCardNumber
      |idCardNumber|
      |S9421475A   |
    And I Select country code and enter mobile number
      |countryCode|iphoneNumber|
      |+86        |13094575647 |
    When I click get verification code button
    When I input email address
      |emailAddress        |
      |2022022@MailTemp.top|
    When I click get verification code button
    When I click next button on the change Password page
    When I input new password and click confirm button
    When The program is finished I will release the Linux SSH connection
    When I close driver


    #正常开户流程——单币种账户——新币
  Scenario:openAccount Singapore enterprise
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|202120268C |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    When I close driver


     #多币种账户 新币+美元
  Scenario:openAccount Current Account MCA_SGD_USD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
#    Then get Organisation ID
    When I close driver

#    #USD->USD
#  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow report
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |rollOutAccount  |intoAccount  |amount |
#      |1101 0001 345   |1101 0000 187|77.12  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully