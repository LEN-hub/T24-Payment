@userManagement_UAT
Feature: userManagements

#  @ChangingMobilePhoneNumber
#    修改手机号
  @Changing_Mobile_Number_UAT
  Scenario:Process for modifying user information_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu
    |emailAddress         |
    |yk13008553349@163.com|
    Then I click Next
    When I initiate captcha verification


  @add_user_Operation_Flow_UAT
#    新增用户
  Scenario:Add the user operation flow_UAT
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


  @stop_User_Operation_Flow_UAT
#    停止用户
  Scenario:Stop the user operation flow_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click on user deactivate confirm
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
    Then End the deal




  @start_User_Operation_Flow_UAT
#    启动用户
  Scenario:Start the user operation flow_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click launch user and click ok
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
    Then End the deals


  @User_Cancellation_UAT
#    用户注销
  Scenario:Process for querying the New users_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click the menu select User Logout
      |emailAddress          |
      |yk13008553349@163.com |
    Then I click Next
    When I initiate captcha verification
