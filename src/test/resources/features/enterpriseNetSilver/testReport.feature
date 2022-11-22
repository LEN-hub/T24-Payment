@testReport
Feature: e-Statement
  @testcodeNewTrack1
    #正常开户新流程——单币种账户——新币
  Scenario:openAccount_track1 Singapore enterprise_SGD
    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
    When I enter the myinfo page and complete Step 1 information input
      |currency|
      |SGD     |
    When I open the myinfo Mock and get the bezel information
      |url|
      |UAT|
    When I enter information in Step 3 and jump to the next step
    When I enter information in Step 4 and jump to the next step
    When I enter information in Step 5 and jump to the next step
    When I enter information in Step 6 and jump to the next step
    When I enter information in Step 7 and jump to the next step
    When I enter information in Step 8 and jump to the next step
    When I enter information in Step 9 and jump to the next step


  @newUsers1
#    新增用户
  Scenario:Add the user operation flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click on Add user
      |TimeLimit |birthday  |countries|
      |2029-05-21|1999-05-20|+86      |
    When I get the OTP verification code from the server
    When fill in my email
    When I get the OTP verification code from the server
    And fill in and submit the new user information
    Then I click Next
    When I initiate captcha verification
    Then I Verify success
    When The program is finished I will release the Linux SSH connection
