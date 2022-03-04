@userManagement
Feature: userManagements

  @ChangingMobilePhoneNumber
#    修改手机号
  Scenario:Process for modifying user information
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu
    Then I click Next
    When I initiate captcha verification


  @newUsers
#    新增用户
  Scenario:Add the user operation flow
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click on Add user
      |TimeLimit |birthday  |countries|
      |2026-08-18|1998-05-20|CHINESE  |
    Then I click Next
    When I initiate captcha verification
    Then I  Verify success



  @stopUser
#    停止用户
  Scenario:Stop the user operation flow
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click on user deactivate confirm
    Then I click Next
    When I initiate captcha verification
    Then End the deal




   @startUser
##    启动用户
  Scenario:Start the user operation flow
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click launch user and click ok
    Then I click Next
    When I initiate captcha verification
    Then End the deals

  @UserCancellation
#    用户注销
  Scenario:Process for querying the New users
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click the menu select User Logout
    Then I click Next
    When I initiate captcha verification
