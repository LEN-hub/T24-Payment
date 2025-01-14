@e-Statement_SIT
Feature: e-Statement

  @Download_e-Statement_file_Successfully_SIT
  Scenario:Download e-Statement file successfully_SIT
#    Given Closing the Browser driver
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11010003747  |
    And I click search button
    Then I should see Account List
    When I click on the first data to download
#    When I click My Downloads Btn
#    When I see My Downloads List


  @Download_Past_e-Statement_file_Successfully_SIT
  Scenario:Download past e-statements successfully_SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
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


  @Download_Electronic_Notice_Successfully_SIT
  Scenario:Download the electronic notice and successfully generate the download task_SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eAdvices Btn
    When I click select button on the View eAdvices page
    When I click first data to download on the view eAdvices page
#    When I click My Downloads Btn
#    When I see My Downloads List



##  修改密码
#  @forgetPassword
#  Scenario:idCard Forgot password users log in normally after resetting their passwords
#    Given open "netSilverEnv_Kevin" on enterprise net silver
#    When I click forgotPassword button
#    When I input Enterprise customer number and other information
#      |customerNumber |
#      |200032         |
#    When I click idCard button and input idCardNumber
#      |idCardNumber|
#      |T3676263H   |
#    And I Select country code and enter mobile number
#      |countryCode|iphoneNumber|
#      |+86        |13008553349 |
#    When I click get verification code button
#    When I input email address
#      |emailAddress     |
#      |617558302@qq.com |
#    When I click get verification code button
#    When I click next button on the change Password page
#    When I input new password and click confirm button
#    When The program is finished I will release the Linux SSH connection



