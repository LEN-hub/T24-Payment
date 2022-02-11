@accountService
Feature: accountService


  Scenario:process for querying the account list
    Given logon "netSilverEnv" on enterprise net silver
    When click the Account Details menu in the account

  Scenario:alias setting main process
    Given logon "netSilverEnv" on enterprise net silver
    When click the Account Details menu and set alias information
    Then alias entered and saved successfully

  Scenario:click Download after the file is generated successfully
    Given logon "netSilverEnv" on enterprise net silver
    When click Download after the file is generated successfully

  Scenario:successfully downloaded batch new domestic payee template
    Given logon "netSilverEnv" on enterprise net silver
    When succeeded in downloading the batch added domestic payee template

  Scenario:personal information management Basic information management, modify customer nicknames
    Given logon "netSilverEnv" on enterprise net silver
    When modifying customer nicknames
    Then the customer nickname is changed successfully

  Scenario:query operation logs of the personal center
    Given logon "netSilverEnv" on enterprise net silver
    When query operation logs of the personal center
    Then operation logs of the personal center are successfully queried

  Scenario:personal center online banking transaction query screening conditions
    Given logon "netSilverEnv" on enterprise net silver
    When personal center online banking transaction query screening conditions
  @ext
  Scenario:personal center online banking transaction query submission time selection nearly seven days
    Given logon "netSilverEnv" on enterprise net silver
    When personal center online banking transaction query submission time selection nearly seven days