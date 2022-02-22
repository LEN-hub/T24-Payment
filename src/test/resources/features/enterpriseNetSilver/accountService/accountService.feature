@accountService
Feature: accountService


  Scenario:process for querying the account list
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account Details menu in the account

  Scenario:account details page display
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When account details page display

  Scenario:alias setting main process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account Details menu and set alias information
    Then alias entered and saved successfully

  Scenario:click Download after the file is generated successfully
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Download after the file is generated successfully

  Scenario:successfully downloaded batch new domestic payee template
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When succeeded in downloading the batch added domestic payee template

  Scenario:personal information management Basic information management, modify customer nicknames
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When modifying customer nicknames
    Then the customer nickname is changed successfully

  Scenario:query operation logs of the personal center
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When query operation logs of the personal center
    Then operation logs of the personal center are successfully queried

  Scenario:personal center online banking transaction query screening conditions
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When personal center online banking transaction query screening conditions

  Scenario:personal center online banking transaction query submission time selection nearly seven days
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When personal center online banking transaction query submission time selection nearly seven days

  Scenario:Transaction details list query process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click account Details to query and verify the presence of elements

  Scenario:Transaction query page flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account details query and click the query button to query

    @accountServices
  Scenario:Authorization Center
    Given logon "netSilverEnvAuthorizationCenter" on enterprise net silver
    When I click My Tasks button on the logon page
    Then I should direct to the Awaiting authorization page
    When I click on the first piece of data to authorize
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
#    When I click next to continue


  @SecondaryApproval
  Scenario:Authorization Center
    Given logon "EnrollerAccount" on enterprise net silver
    When I click transferMoney button
    When I click addPayee button and input information
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    When I should switch to the second authorized account
    Given logon second "Level1AuthorizedAccount" on enterprise net silver
    When I click My Tasks button on the logon page
    Then I should direct to the Awaiting authorization page
    When I click on the first piece of data to authorize
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    When I should switch to the second authorized account
#   When I switched to the account of the Level two Authorized
#    Given logon "Level2AuthorizedAccount" on enterprise net silver
    Given logon second "Level2AuthorizedAccount" on enterprise net silver
    When I click My Tasks button on the logon page
    Then I should direct to the Awaiting authorization page
    When I click on the first piece of data to authorize
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


#  @SecondaryApproval1
#  Scenario:Authorization Center1
#    Given logon "EnrollerAccount" on enterprise net silver
#    When I click transferMoney button
#    When I click addPayee button and input information
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now

