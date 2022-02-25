@accountChange
Feature: accountChange

  @ModifyingAccountRights
#    账户修改
  Scenario:Process for querying the account change
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I hit Permissions modify
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

  @LinkAccount
#    账户加挂
  Scenario:Process for querying the link account
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click link account
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  @accountOpeningCA
#    CA账户开立
  Scenario:Process for querying the account opening ac
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

  @accountOpeningMCA
#  MCA账户开立
  Scenario:Process for querying the account opening mca
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When click open account and select MCA
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

  @Authorization
#  授权模式
  Scenario:Process for querying the authorization
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When click authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

  @addCurrency
#    新增币种
  Scenario:Process for querying the add currency
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click add currency to fill in the information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now



  @deleteCurrency
#    删除币种
  Scenario:Process for querying the delete currency
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click delete currency information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
