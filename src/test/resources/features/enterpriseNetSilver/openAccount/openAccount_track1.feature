@openAccountNew
Feature: openAccount_track1

  Background:
    Given open "netSilverEnv_Kevin_Payment" enterprise net silver page

  @testcodeNew
    #正常开户新流程——单币种账户——新币
  Scenario:openAccount_track1 Singapore enterprise
    When I enter the myinfo page and complete Step 1 information input
    When I open the myinfo Mock and get the bezel information
    When I enter information in Step 3 and jump to the next step
