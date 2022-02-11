@accountService
Feature: accountService

  @ext
  Scenario:Process for querying the account list
    Given logon "netSilverEnv" on enterprise net silver
    When click the Account Details menu in the account