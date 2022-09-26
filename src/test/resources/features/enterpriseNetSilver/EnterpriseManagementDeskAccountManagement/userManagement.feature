@userManagement
Feature: userManagements

#  @ChangingMobilePhoneNumber
#    修改手机号
  @userManagement123
  Scenario:Process for modifying user information
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu
    |emailAddress         |
    |yk13008553349@163.com|
    Then I click Next
    When I initiate captcha verification


  @newUsers
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


  @stopUser
#    停止用户
  Scenario:Stop the user operation flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click on user deactivate confirm
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
    Then End the deal




#   @startUser
#    启动用户
  Scenario:Start the user operation flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click launch user and click ok
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
    Then End the deals


#  @UserCancellation
#    用户注销
  Scenario:Process for querying the New users
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click the menu select User Logout
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
