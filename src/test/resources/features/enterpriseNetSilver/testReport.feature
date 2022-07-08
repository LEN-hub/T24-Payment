@testReport
Feature: e-Statement

  @ext1238892
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
#    When I click My Downloads Btn
#    When I see My Downloads List

  @ext12300912
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
#    When I click My Downloads Btn
#    When I see My Downloads List



  @ModifyingAccountRights
#    账户修改
  Scenario:Modify the enterprise management console account
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I hit Permissions modify
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningSGD
#    CA账户SGD开立
  Scenario:Enterprise management console CA account SGD opened
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account SGD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful


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

    #  @ChangingMobilePhoneNumber
#    修改手机号
  @userManagement123422
  Scenario:Process for modifying user information
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu
      |emailAddress         |
      |yk13008553349@163.com|
    Then I click Next
    When I initiate captcha verification

   #SDG->SDG
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount |
      |1101 0000 179   |1101 0000 330|10.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
  @test19912221
  #USD->CNY
  Scenario:Oneself mutual turn with currency mutual turn (CNY) trade flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount |
      |1101 0000 047   |1101 0000 039|10.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
  @test19912221332
    #时间选择每月(SDG->SDG)
  Scenario:Intra-line transfer time per month (SDG->SDG)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
      |BANK OF CHINA LIMITED           |TSC1643346550706|11010000039      |0.1              |Business Expenses|1101 0000 179      |
    When I select date on the domestic transfer bank page
      |trasferOutDate|selectDate |
      |2025-01-01    |Monthly    |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010000039      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010000039      |0.10             |Business Expenses|


#  @overseasTransfer01
#  Scenario:Positive process of overseas transfer(USD--SGD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|enterAmount|expense                                  |
#      |1101 0000 047|60         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |SGD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204      |luckys   |
#    When I click on the receiving bank drop down box
#    When I click the recipient bank is Singapore
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |110200083204      |

  @newUsers1
#    新增用户
  Scenario:Add the user operation flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click on Add user
      |TimeLimit |birthday  |countries|
      |2026-08-18|1998-05-20|+86      |
    When I get the OTP verification code from the server
    When fill in my email
    When I get the OTP verification code from the server
    And fill in and submit the new user information
    Then I click Next
    When I initiate captcha verification
    Then I Verify success
    When The program is finished I will release the Linux SSH connection


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


  @testcode123
    #正常开户流程——单币种账户——新币
  Scenario:openAccount Singapore enterprise
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |cheek      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
#    Then get Organisation ID

#  修改密码
  @157647
  Scenario:idCard Forgot password users log in normally after resetting their passwords
    Given open "netSilverEnv_Kevin" on enterprise net silver
    When I click forgotPassword button
    When I input Enterprise customer number and other information
      |customerNumber |
      |200032         |
    When I click idCard button and input idCardNumber
      |idCardNumber|
      |T3676263H   |
    And I Select country code and enter mobile number
      |countryCode|iphoneNumber|
      |+86        |13008553349 |
    When I click get verification code button
    When I input email address
      |emailAddress     |
      |617558302@qq.com |
    When I click get verification code button
    When I click next button on the change Password page
    When I input new password and click confirm button
    When The program is finished I will release the Linux SSH connection
#
