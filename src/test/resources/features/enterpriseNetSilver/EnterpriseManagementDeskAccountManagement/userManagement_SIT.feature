@userManagement_SIT
Feature: userManagements

#  @ChangingMobilePhoneNumber
#    修改手机号
  @userManagement123_SIT
  Scenario:Process for modifying user information_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu
      |emailAddress         |
      |2022003@MailTemp.top |
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
#    Then I click Next
#    When I initiate captcha verification
#    Then I Verify success
#    When The program is finished I will release the Linux SSH connection


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
