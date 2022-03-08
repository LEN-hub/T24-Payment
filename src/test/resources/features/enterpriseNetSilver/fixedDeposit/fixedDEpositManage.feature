@fixedDepositManage
Feature: fixedDepositManage

  #六个月_新币_不转存_全部支取
  @report
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD About SGD SixMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #六个月_美元_不转存_全部支取
  @fixedDepositManage02
  Scenario:fixedDepositWithdrawFD_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD About USD SixMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  #六个月_新币_本金续存_全部支取
  @fixedDepositManage03
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD About SGD SixMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #六个月_美元_本金续存_全部支取
  @fixedDepositManage04
  Scenario:fixedDepositWithdrawFD_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD About USD SixMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  #六个月_新币_本息续存_全部支取
  @fixedDepositManage05
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD About SGD SixMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  #六个月_美元_本息续存_全部支取
  @fixedDepositManage06
  Scenario:fixedDepositWithdrawFD_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given Closing the Browser driver
    When logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD About USD SixMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit