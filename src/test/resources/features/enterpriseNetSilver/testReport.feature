@testReport
Feature: e-Statement
  @accountService_SIT01
  Scenario:process for uerying the account list_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click the Account Details menu in the account
  @accountService_SIT02
  Scenario:account details page display
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When account details page display

  @accountService_SIT03
  Scenario:alias setting main process_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click the Account Details menu and set alias information
    Then alias entered and saved successfully
  @accountService_SIT04
  Scenario:click Download after the file is generated successfully_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Download after the file is generated successfully
  @accountService_SIT05
  Scenario:successfully downloaded batch new domestic payee template_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When succeeded in downloading the batch added domestic payee template
  @accountService_SIT06
  Scenario:personal information management Basic information management, modify customer nicknames_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When modifying customer nicknames
    Then the customer nickname is changed successfully
  @accountService_SIT07
  Scenario:query operation logs of the personal center_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When query operation logs of the personal center
    Then operation logs of the personal center are successfully queried
  @accountService_SIT08
  Scenario:personal center online banking transaction query screening conditions_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When personal center online banking transaction query screening conditions
  @accountService_SIT09
  Scenario:personal center online banking transaction query submission time selection nearly seven days_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When personal center online banking transaction query submission time selection nearly seven days


  @ext123_SIT
  Scenario:Download e-Statement file successfully_SIT
#    Given Closing the Browser driver
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11010000608  |
    And I click search button
    Then I should see Account List
    When I click on the first data to download
#    When I click My Downloads Btn
#    When I see My Downloads List


  @ext123test122_SIT
  Scenario:Download past e-statements successfully_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11010000608  |
    And I click search button
    Then I should see Account List
    When I click on the past data to download
#    When I click My Downloads Btn
#    When I see My Downloads List


  @ext123test_SIT
  Scenario:Download the electronic notice and successfully generate the download task_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eAdvices Btn
    When I click select button on the View eAdvices page
    When I click first data to download on the view eAdvices page
#    When I click My Downloads Btn
#    When I see My Downloads List

  @startUser_SIT
#    启动用户
  Scenario:Start the user operation flow_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration as well user administration
    When I click launch user and click ok
      |emailAddress     |
      |sxqc6@126.com    |


  @UserCancellation_SIT
#    用户注销
  Scenario:Process for querying the New users_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration as well user administration
    When I click the menu select User Logout
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification

  @newUsers_SIT
#    新增用户
  Scenario:Add the user operation flow_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration as well user administration
    When I click on Add user
      |TimeLimit |birthday  |countries|
      |2026-08-18|1998-05-20|+86      |
    When I get the OTP verification code from the server
    When fill in my email
    When I get the OTP verification code from the server
    And fill in and submit the new user information

  @stopUser_SIT
#    停止用户
  Scenario:Stop the user operation flow_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration as well user administration
    When I click on user deactivate confirm
      |emailAddress     |
      |sxqc6@126.com    |

  @forgotPassWordIDCard123
  Scenario:idCard Forgot password users log in normally after resetting their passwords
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
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


  @ModifyingAccountRights_SIT
#    账户修改
  Scenario:Modify the enterprise management console account_SIT
    Given logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration Desk and select Account Management
    When I hit Permissions modify

  @accountOpeningSGD_SIT
#    CA账户SGD开立
  Scenario:Enterprise management console CA account SGD opened_SIT
    Given logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account SGD
    When I select account permissions

    #本人互转
  @localPaymentSGDToSGD
  Scenario:Local Payment Data Mapping FX Payment (SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 438   |1101 0000 470|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath                  |
      |Internal Transfer SGD-SGD |
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath                  |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Internal Transfer SGD-SGD |
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath                  |
      |FUNDS.TRANSFER|Internal Transfer SGD-SGD |
    Then I will map the page data
      |WordPath                  |
      |Internal Transfer SGD-SGD |

  @LocalPaymentTestSGDToSGD
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |UOB          |TSC1643346550706|678321687312          |Business Expenses   |1101 0000 438 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on same Currency Payment
      |WordPath                   |
      |Local Fund Payment SGD-SGD |
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Fund Payment SGD-SGD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                   |
      |Pending and Processed Payments - SIT GLDB|Local Fund Payment SGD-SGD |
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                   |
      |Local Fund Payment SGD-SGD |
    When I compare the amount is normal on Mx Message
      |WordPath                   |
      |Local Fund Payment SGD-SGD |
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath                   |Name                       |
      |Local Fund Payment SGD-SGD |Local Fund Payment SGD-SGD |



    #本人互转
  @SIT_MCY01
   #USD->SGD
  Scenario:I have successfully changed us dollars into Singapore dollars and T24(SIT_MCY)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0327 162   |1101 0000 438|USD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
      |WordPath   |
      |USD-SGD MCY|
    Given Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |WordPath   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |WordPath   |
      |Pending and Processed Payments - UAT GLDB|USD-SGD MCY|
    Then I do field mapping for Channel and T24 in Own FX Payment
      |WordPath   |
      |USD-SGD MCY|
    When I compare the amount is normal To Local Payment
      |WordPath   |
      |USD-SGD MCY|
    When I compare the data generated by Outgoing Message is correct On Local Payment
      |Name                         |
      |Internal Transfer USD-SGD MCY|
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |WordPath   |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|USD-SGD MCY|


  @SIT_MCY05
    #境内转账多币种-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)(SIT_MCY)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account |
      |BANK OF CHINA LIMITED  |TSC1643346550706|11010001426           |Business Expenses   |1102 0327 162|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    Then I will compare all the data on same Currency Payment
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    Given Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                 |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Payment SGD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                 |
      |Pending and Processed Payments - UAT GLDB|Local Payment SGD-SGD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath             |Name                     |
      |Local Payment SGD-SGD|Local Payment SGD-SGD MCY|

  @FxPaymentSGDToSGD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 438 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0LAO     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS SGD-SGD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|

   #境外转账
  @SIT_MCY10
  Scenario:Positive process of overseas transfer Bic Is Bank of China(USD--USD)(SIT_MCY)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0327 162 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency   |
      |USD        |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    Then I will compare all the data on FX Payment MX Message
      |WordPath                        |
      |Bic is Bank of China USD-USD MCY|
    Given Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is Bank of China USD-USD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                        |
      |Pending and Processed Payments - UAT GLDB|Bic is Bank of China USD-USD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                        |
      |Bic is Bank of China USD-USD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath                        |
      |Bic is Bank of China USD-USD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath                        |Name                            |
      |Bic is Bank of China USD-USD MCY|Bic is Bank of China USD-USD MCY|

    @LocalPaymentTestSGDToUSD
    #境内转账-行内转账时间选择每周一(SGD->USD)
  Scenario:Transfer time within the line is selected every Monday (SGD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank                    |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010000489           |Business Expenses   |1101 0000 438 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on same Currency Payment
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I type in the content and click the search button
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|
      |FUNDS.TRANSFER|
    Then I will map the page data

          #PayNow签约
  @Paynow01
  Scenario:PayNow Signing Process
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I execute manage PayNow Profile transaction on the page
    Given logon second "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  @Paynow01
  Scenario:PayNow Signing Off
    Given logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When I sign and cancel the transaction on the page

  @Paynow01
  Scenario:PayNow Signing Modify
    Given logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When I carry out the signing and modification process on the page
      |AccountNu    |
      |1101 0002 449|


    #     活期透支
  @loanApplication1
  Scenario:Select “>1,000,000 and ≤ 20,000,000” for “Corporate Turnover (SGD)”, “Current Asset Loan” for the loan type, select collateral: real estate, select guarantor: personal guarantee-director; input the loan amount: 200,000; "Overdraft" product loan application successful
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
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


    #    贷款支用。无授权
  @loanApplication4
  Scenario:Accounts Payable Financing Loan Draw Application Process
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
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

    #    还款。
  @loanApplication7
  Scenario:For accounts receivable financing products, the repayment date is 5 days after the current date, within 1 month, if it does not exceed the due date, and it is fully settled in advance (loan currency: SGD, product term: 30 days), the repayment is successful
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click the loan Manage ment Button
    When I click SGD Prepay button


    #    在线开户+小额透支贷款
  @testLoan0291
#  单币种 新币+贷款
  Scenario: The new bank customer initiated the "new auto financing" product loan application successfully
    Given open "netSilverEnv_Kevin_SIT" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|200808897E |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details


  @testcodeNewTrack123
    #正常开户新流程——单币种账户——新币
  Scenario:openAccount_track1 Singapore enterprise_SGD
    Given open "netSilverEnv_Kevin_SIT" enterprise net silver page
    When I enter the myinfo page and complete Step 1 information input
      |currency|
      |SGD     |
    When I open the myinfo Mock and get the bezel information
      |url|
      |SIT|
    When I enter information in Step 3 and jump to the next step
    When I enter information in Step 4 and jump to the next step
    When I enter information in Step 5 and jump to the next step
    When I enter information in Step 6 and jump to the next step
    When I enter information in Step 7 and jump to the next step
    When I enter information in Step 8 and jump to the next step
    When I enter information in Step 9 and jump to the next step


      #多币种账户 新币+美元
  Scenario:openAccount Current Account MCA_SGD_USD
    Given open "netSilverEnv_Kevin_SIT" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|200911779N |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
#    Then get Organisation ID
    When I close driver

  @testcodeNew
    #正常开户新流程——单币种账户——新币
  Scenario:openAccountNew Singapore enterprise
    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
    When click open Account New page
    Then New Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|200911779N |
    Given logon "environments_5" on tube by inputting system online bank
    When I into the rear tube Supplementary account opening information
      |chekk      |
      |200911779N |
    Given logon "environments_6" on tube by inputting system online bank
    When I enter the back tube for authorization
    When I enter the mailbox

        #授权
    #定期存款_新币_一个月_不转存
  @fixedDeposit01_authorization_SIT
  Scenario:fixedDeposit_SGD_OneMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |1 Month |1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

      #一个月_新币_不转存_全部支取
  @report444
  Scenario:fixedDepositWithdrawFD_SGD_OneMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits First menu
    Then I operate on the current page data information
      | fdAccountNumber |
      | 16010002192     |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization



