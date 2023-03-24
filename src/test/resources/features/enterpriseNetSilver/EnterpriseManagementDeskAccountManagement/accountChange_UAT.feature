@accountChange_UAT
Feature: accountChange


  @Modifying_Account_Rights_UAT
#    账户修改
  Scenario:Modify the enterprise management console account_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I hit Permissions modify
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful



  @account_Opening_SGD_UAT
#    CA账户SGD开立
  Scenario:Enterprise management console CA account SGD opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @account_Opening_USD_UAT
    #    CA账户USD开立
  Scenario:Enterprise management console CA account USD opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @account_Opening_CNY_UAT
#    CA账户CNY开立
  Scenario:Enterprise management console CA account CNY opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningHKD_UAT
#    CA账户HKD开立
  Scenario:Enterprise management console CA account HKD opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningEUR_UAT
#    CA账户EUR开立
  Scenario:Enterprise management console CA account EUR opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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


  @accountOpeningMCACNY_UAT
#  MCA账户,默认选择SGD，SGD+CNY开立
  Scenario:Enterprise management console MCA account CNY opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @account_Opening_MCA_SGD&USD_UAT
#  MCA账户,默认选择SGD，SGD+USD开立
  Scenario:Enterprise management console MCA account USD opened_UAT
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


  @accountOpeningMCAHKD_UAT
#  MCA账户,默认选择SGD，SGD+HKD开立
  Scenario:Enterprise management console MCA account HKD opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningMCAEUR_UAT
#  MCA账户,默认选择SGD，SGD+EUR开立
  Scenario:Enterprise management console MCA account EUR opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningMCAAll_UAT
#  MCA账户,默认选择SGD，SGD+USD+CNY+HKD+EUR开立
  Scenario:Enterprise management console MCA account All opened_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningMCA01_UAT
#  MCA账户,默认选择SGD，SGD+USD+CNY开立
  Scenario:Enterprise Management Console MCA account has CNY USD SGD enabled_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningMCA02_UAT
#  MCA账户,默认选择SGD，SGD+USD+EUR开立
  Scenario:Enterprise Management Console MCA account has EUR USD SGD enabled_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningMCA03_UAT
#  MCA账户,默认选择SGD，SGD+USD+HKD开立
  Scenario:Enterprise Management Console MCA account has HKD USD SGD enabled_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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

  @accountOpeningMCA04_UAT
#  MCA账户,默认选择SGD，SGD+CNY+HKD开立
  Scenario:Enterprise Management Console MCA account has CNY HKD SGD enabled_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
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



  @delete_Currency_UAT
#    删除币种
  Scenario:The enterprise management console deletes the currency_UAT
    Given logon "netSilverEnv_Kevin2" on enterprise net silver
    When I click on the Enterprise Administration Desk and select Account Management
    When I click delete currency information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I verify that the transaction is successful


#  @Authorization_Mode_Double_UAT
##  授权模式双人
#  Scenario:Enterprise management desk two-person authorization mode
#    Given logon "netSilverEnv_Kevin2" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose two-person authorization management mode
#    And Confirm the authorization mode and submit it
#    When secondary authorized person notification is then displayed
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful


#  @Authorization_Mode_Single_UAT
##  授权模式单人
#  Scenario:Enterprise management console single-person authorization mode
#    Given logon "netSilverEnv_Kevin2" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose single-player license management mode
#    And Confirm the authorization mode and submit it
#    When secondary authorized person notification is then displayed
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful


#  @Unauthorization_Mode_UAT
##  无授权模式
#  Scenario:Enterprise management console in unauthorized mode
#    Given logon "netSilverEnv_Kevin2" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When click authorization
#    When I choose unlicensed management mode
#    And Confirm the authorization mode and submit it
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I verify that the transaction is successful
#
#  @Link_Account_UAT
##    账户加挂，从注册绑定vkey开始跑头开始跑
#  Scenario:The enterprise management console account is added
#    Given logon second "netSilverEnv_Kevin2" on enterprise net silver
#    When I click on the Enterprise Administration Desk and select Account Management
#    When I click link account
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
#  @add_Currency_UAT
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