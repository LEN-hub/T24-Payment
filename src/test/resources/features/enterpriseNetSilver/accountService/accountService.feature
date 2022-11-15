@accountService12345
Feature: accountService
  @accountService01
  Scenario:process for uerying the account list
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account Details menu in the account
  @accountService02
  Scenario:account details page display
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When account details page display

@accountService03
  Scenario:alias setting main process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click the Account Details menu and set alias information
    Then alias entered and saved successfully
@accountService04
  Scenario:click Download after the file is generated successfully
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Download after the file is generated successfully
  @accountService05
  Scenario:successfully downloaded batch new domestic payee template
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When succeeded in downloading the batch added domestic payee template
  @accountService06
  Scenario:personal information management Basic information management, modify customer nicknames
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When modifying customer nicknames
    Then the customer nickname is changed successfully
  @accountService07
  Scenario:query operation logs of the personal center
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When query operation logs of the personal center
    Then operation logs of the personal center are successfully queried
  @accountService08
  Scenario:personal center online banking transaction query screening conditions
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When personal center online banking transaction query screening conditions
  @accountService09
  Scenario:personal center online banking transaction query submission time selection nearly seven days
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When personal center online banking transaction query submission time selection nearly seven days


#    @accountServices
#  Scenario:Authorization Center
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I click My Tasks button on the logon page
#    Then I should direct to the Awaiting authorization page
#    When I click on the first piece of data to authorize
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
##    When I click next to continue
#
#
#  @accountServices1234
#  Scenario:Authorization Center2
###    Given logon "EnrollerAccount" on enterprise net silver
##    Given logon second "Level1AuthorizedAccount" on enterprise net silver
##    When I click transferMoney button
##    When I click addPayee button and input information
##    When I get the TC code and click Next
##    When I typed TC Code and click Authenticate Now
##    When I should switch to the second authorized account
#    Given logon second "Level1AuthorizedAccount" on enterprise net silver
#    When I click My Tasks button on the logon page
#    Then I should direct to the Awaiting authorization page
#    When I click on the first piece of data to authorize
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    When I should switch to the second authorized account
##   When I switched to the account of the Level two Authorized
##    Given logon "Level2AuthorizedAccount" on enterprise net silver
#    Given logon second "Level2AuthorizedAccount" on enterprise net silver
#    When I click My Tasks button on the logon page
#    Then I should direct to the Awaiting authorization page
#    When I click on the first piece of data to authorize
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
#
##为二级审批制造数据的脚本。
#  Scenario:Authorization Center1
##    Given logon "EnrollerAccount" on enterprise net silver
#    Given logon second "Level1AuthorizedAccount" on enterprise net silver
#    When I click transferMoney button
#    When I click addPayee button and input information
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
