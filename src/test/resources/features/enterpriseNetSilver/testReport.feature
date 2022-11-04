@testReport
Feature: e-Statement

  @testcodeNewTrack1
    #正常开户新流程——单币种账户——新币
  Scenario:openAccount_track1 Singapore enterprise
    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
    When I enter the myinfo page and complete Step 1 information input
    When I open the myinfo Mock and get the bezel information
    When I enter information in Step 3 and jump to the next step
    When I enter information in Step 4 and jump to the next step
    When I enter information in Step 5 and jump to the next step
    When I enter information in Step 6 and jump to the next step
    When I enter information in Step 7 and jump to the next step
    When I enter information in Step 8 and jump to the next step
    When I enter information in Step 9 and jump to the next step


        #正常开户流程——单币种账户——新币
  Scenario:openAccount Singapore enterprise
    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|200911779N |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    When I close driver

  @testcodeNew
    #正常开户新流程——单币种账户——新币
  Scenario:openAccountNew Singapore enterprise
    Given open "netSilverEnv_ycjpt_uat" enterprise net silver page
    When click open Account New page
    Then New Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|200911779N |
    Given logon "environments_5" on tube by inputting system online bank
    When I into the rear tube Supplementary account opening information
      |chekk      |
      |200911779N |
    Given logon "environments_6" on tube by inputting system online bank
    When I enter the back tube for authorization
    When I enter the mailbox