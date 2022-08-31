@testReport
Feature: e-Statement

  @test19912221332312
    #时间选择每月(SGD->SGD)
  Scenario:Intra-line transfer time per month (SDG->SDG)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank                    |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |BANK OF CHINA LIMITED           |TSC1643346550706|11010000039           |Business Expenses   |1101 0000 179 |
    When I select date on the domestic transfer bank page
      |trasferOutDate|selectDate |
      |2025-01-01    |Monthly    |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer purpose |
      |TSC1643346550706|11010000039      |Business Expenses|

    #  修改密码
  @forgotPassWordIDCard123
  Scenario:idCard Forgot password users log in normally after resetting their passwords
    Given open "netSilverEnv_Kevin" on enterprise net silver
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

     #SDG->SDG
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 179   |1101 0001 639|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

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


    #       电子通知
  @ext123test122
  Scenario:Download past e-statements successfully
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11010000187  |
    And I click search button
    Then I should see Account List
    When I click on the past data to download