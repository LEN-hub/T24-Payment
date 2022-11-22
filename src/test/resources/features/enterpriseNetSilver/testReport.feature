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
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
    Then End the deals


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
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
    Then End the deal

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

