@accountChange
Feature: accountChange


  @ModifyingAccountRights
#    账户修改
  Scenario:Modify the enterprise management console account
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I hit Permissions modify
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful



  @accountOpeningSGD
#    CA账户SGD开立
  Scenario:Enterprise management console CA account SGD opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account SGD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningUSD
    #    CA账户USD开立
  Scenario:Enterprise management console CA account USD opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account USD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningCNY
#    CA账户CNY开立
  Scenario:Enterprise management console CA account CNY opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account CNY
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningHKD
#    CA账户HKD开立
  Scenario:Enterprise management console CA account HKD opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account HKD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningEUR
#    CA账户EUR开立
  Scenario:Enterprise management console CA account EUR opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account EUR
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful


  @accountOpeningMCACNY
#  MCA账户,默认选择SGD，SGD+CNY开立
  Scenario:Enterprise management console MCA account CNY opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open CNY
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCAUSD
#  MCA账户,默认选择SGD，SGD+USD开立
  Scenario:Enterprise management console MCA account USD opened
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open USD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful


  @accountOpeningMCAHKD
#  MCA账户,默认选择SGD，SGD+HKD开立
  Scenario:Enterprise management console MCA account HKD opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open HKD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCAEUR
#  MCA账户,默认选择SGD，SGD+EUR开立
  Scenario:Enterprise management console MCA account EUR opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open EUR
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCAAll
#  MCA账户,默认选择SGD，SGD+USD+CNY+HKD+EUR开立
  Scenario:Enterprise management console MCA account All opened
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open All
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCA01
#  MCA账户,默认选择SGD，SGD+USD+CNY开立
  Scenario:Enterprise Management Console MCA account has CNY USD SGD enabled
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open SGD USD CNY
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCA02
#  MCA账户,默认选择SGD，SGD+USD+EUR开立
  Scenario:Enterprise Management Console MCA account has EUR USD SGD enabled
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open SGD USD EUR
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCA03
#  MCA账户,默认选择SGD，SGD+USD+HKD开立
  Scenario:Enterprise Management Console MCA account has HKD USD SGD enabled
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open SGD USD HKD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful

  @accountOpeningMCA04
#  MCA账户,默认选择SGD，SGD+CNY+HKD开立
  Scenario:Enterprise Management Console MCA account has CNY HKD SGD enabled
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open SGD CNY HKD
    When I select account permissions
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful



  @deleteCurrency
#    删除币种
  Scenario:The enterprise management console deletes the currency
    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click delete currency information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful


#  @AuthorizationMode01
##  授权模式双人
#  Scenario:Enterprise management desk two-person authorization mode
#    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose two-person authorization management mode
#    And Confirm the authorization mode and submit it
#    When secondary authorized person notification is then displayed
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful


#  @AuthorizationMode02
##  授权模式单人
#  Scenario:Enterprise management console single-person authorization mode
#    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose single-player license management mode
#    And Confirm the authorization mode and submit it
#    When secondary authorized person notification is then displayed
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful


#  @AuthorizationMode03
##  无授权模式
#  Scenario:Enterprise management console in unauthorized mode
#    Given logon "netSilverEnv_Kevin_two" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose unlicensed management mode
#    And Confirm the authorization mode and submit it
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful
#
#  @LinkAccount
##    账户加挂，从注册绑定vkey开始跑头开始跑
#  Scenario:The enterprise management console account is added
#    Given logon second "netSilverEnv_Kevin_two" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When I click link account
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
#  @addCurrency
##    新增币种,注意，此case需要双人管理模式，需要后管设置管理模式，换号授权
#  Scenario:Enterprise management desk new currency
#    Given Closing the Browser driver
#    When logon "netSilverEnv_susu" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When I click add currency to fill in the information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then verify whether to wait for authorization
#    Given logon second "netSilverEnv_susu" on enterprise net silver
#    When I click My Tasks button on the logon page
#    Then I should direct to the Awaiting authorization page
#    When I click on the first piece of data to authorize
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now