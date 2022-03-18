@fixedDepositManage
Feature: fixedDepositManage

  #六个月_新币_不转存_全部支取
  @report
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | 16010005531     |
    And View details of fixedDeposit

  #六个月_美元_不转存_全部支取
  @fixedDepositManage02
  Scenario:fixedDepositWithdrawFD_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | 16010005191     |
    And View details of fixedDeposit

  #六个月_新币_本金续存_全部支取
  @fixedDepositManage03
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | 16010005205     |
    And View details of fixedDeposit

  #六个月_美元_本金续存_全部支取
  @fixedDepositManage04
  Scenario:fixedDepositWithdrawFD_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | 16010005213     |
    And View details of fixedDeposit

  #六个月_新币_本息续存_全部支取
  @fixedDepositManage05
  Scenario:fixedDepositWithdrawFD_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | 16010005221     |
    And View details of fixedDeposit

  #六个月_美元_本息续存_全部支取
  @fixedDepositManage06
  Scenario:fixedDepositWithdrawFD_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | 16010005248     |
    And View details of fixedDeposit

      #九个月_新币_不转存_全部支取
  @report
  Scenario:fixedDepositWithdrawFD_SGD_NINEMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To WithdrawFD
      | fdAccountNumber |
      | test            |
    And View details of fixedDeposit