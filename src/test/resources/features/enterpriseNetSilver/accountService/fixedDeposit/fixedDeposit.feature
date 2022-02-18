@accountService
Feature: fixedDeposit

  Scenario:fixedDeposit
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then To create fixedDeposit
    And View details of fixedDeposit