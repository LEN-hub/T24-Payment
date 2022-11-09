@openAccountNew
Feature: openAccount_track1

  Background:
    Given open "netSilverEnv_Kevin_SIT" enterprise net silver page

  @testcodeNewTrack123
    #正常开户新流程——单币种账户——新币
  Scenario:openAccount_track1 Singapore enterprise_SGD
    When I enter the myinfo page and complete Step 1 information input
      |currency|
      |SGD     |
    When I open the myinfo Mock and get the bezel information
      |url|
      |SIT|
    When I enter information in Step 3 and jump to the next step
    When I enter information in Step 4 and jump to the next step
    When I enter information in Step 5 and jump to the next step
    When I enter information in Step 6 and jump to the next step
    When I enter information in Step 7 and jump to the next step
    When I enter information in Step 8 and jump to the next step
    When I enter information in Step 9 and jump to the next step

  @testcodeNewTrack2
    #正常开户新流程——单币种账户——美元
  Scenario:openAccount_track1 Singapore enterprise_USD
    When I enter the myinfo page and complete Step 1 information input
      |currency|
      |USD     |
    When I open the myinfo Mock and get the bezel information
    When I enter information in Step 3 and jump to the next step
    When I enter information in Step 4 and jump to the next step
    When I enter information in Step 5 and jump to the next step
    When I enter information in Step 6 and jump to the next step
    When I enter information in Step 7 and jump to the next step
    When I enter information in Step 8 and jump to the next step
    When I enter information in Step 9 and jump to the next step
