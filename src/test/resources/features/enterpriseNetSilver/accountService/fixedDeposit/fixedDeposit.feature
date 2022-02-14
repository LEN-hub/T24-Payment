@accountService
Feature: fixedDeposit

  @ext
  Scenario:fixedDeposit
    Given logon "netSilverEnv" on enterprise net silver
    When click Fixed Deposits menu
    Then To create fixedDeposit
    And View details of fixedDeposit