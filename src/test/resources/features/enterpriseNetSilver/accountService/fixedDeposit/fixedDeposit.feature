@accountService
Feature: fixedDeposit

  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD SixMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD SixMonth DoNotRenewOrWithdrawAutomatically
    And View details of fixedDeposit

  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD SixMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD SixMonth RenewPrincipalAmountAndWithdrawInterest
    And View details of fixedDeposit

  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About SGD SixMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit

  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then Use "netSilverEnv_FixedDeposit" To create fixedDeposit About USD SixMonth RenewPrincipalAmountAndInterest
    And View details of fixedDeposit