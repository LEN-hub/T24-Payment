@changePassword
Feature: changePassword

#  @forgotPassWord
#  Scenario:Forgot password users log in normally after resetting their passwords
##    Given I am on the login screen
##    When I click forgotPassword button
#    When I login and manage the platform
#      |url                                            |username|password|
#      |http://10.24.9.100:8080/mweb/emptyTrs.do#/login|2000018 |1234    |
#    When I click the Enterprise User Management button
#    When I input select client number
#      |clientNumber|
#      |201297      |
#    When I choose to modify the account details
#      |email                 |
#      |cyq2412337655@163.com |



#    When I input other information on the forgotPassword page

  @forgotPassWordIDCard
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


  @forgotPassWordPssPort
  Scenario:passport Forgot password users log in normally after resetting their passwords
    Given open "netSilverEnvTian" on enterprise net silver
    When I click forgotPassword button
    When I input Enterprise customer number and other information
      |customerNumber |
      |201741         |
    When I click passPort button and input passPortNumber
      |passPortNumber|
      |S4589632C     |
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








