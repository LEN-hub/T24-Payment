@fixedDeposit
Feature: fixedDeposit

  #定期存款_新币_六个月_不转存
  @report
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD SixMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_美元_六个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD SixMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_新币_六个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD SixMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_美元_六个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD SixMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_新币_六个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD SixMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  #定期存款_美元_六个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD SixMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

    #定期存款_新币_九个月_不转存
  @report
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD NineMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_美元_九个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD NineMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_新币_九个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD NineMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_美元_九个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD NineMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_新币_九个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD NineMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  #定期存款_美元_九个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD NineMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

        #定期存款_新币_十二个月_不转存
  @report
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD TwelveMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_美元_十二个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD TwelveMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_新币_十二个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD TwelveMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_美元_十二个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD TwelveMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_新币_十二个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD TwelveMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  #定期存款_美元_十二个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD TwelveMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  #定期存款_新币_十八个月_不转存
  @report
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD EighteenMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_美元_十八个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD EighteenMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #定期存款_新币_十八个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD EighteenMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_美元_十八个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD EighteenMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #定期存款_新币_十八个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD EighteenMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  #定期存款_美元_十八个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD EighteenMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit