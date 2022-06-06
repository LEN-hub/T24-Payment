@e-Statement
Feature: e-Statement

  @ext123
  Scenario:Download e-Statement file successfully
#    Given Closing the Browser driver
    Given logon "netTestTian" on enterprise net silver
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



  @ext123
Scenario:Download past e-statements successfully
  Given logon "netTestTian" on enterprise net silver
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


  @ext123
Scenario:Download the electronic notice and successfully generate the download task
  Given logon "netTestTian" on enterprise net silver
  When I click My Downloads Btn
  When I click View eAdvices Btn
  When I click select button on the View eAdvices page
  When I click first data to download on the view eAdvices page
#    When I click My Downloads Btn
#    When I see My Downloads List



#  修改密码
  Scenario:idCard Forgot password users log in normally after resetting their passwords
    Given open "netSilverEnvTian" on enterprise net silver
    When I click forgotPassword button
    When I input Enterprise customer number and other information
      |customerNumber |
      |201741         |
    When I click idCard button and input idCardNumber
      |idCardNumber|
      |S4589632C   |
    And I Select country code and enter mobile number
      |countryCode|iphoneNumber|
      |+86        |15229856144 |
    When I click get verification code button
    When I input email address
      |emailAddress     |
      |986735326@qq.com |
    When I click get verification code button
    When I click next button on the change Password page
    When I input new password and click confirm button
    When The program is finished I will release the Linux SSH connection



