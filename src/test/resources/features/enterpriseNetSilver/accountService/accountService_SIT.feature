@accountService_SIT
Feature: accountService
  @accountService_SIT01
  Scenario:process for querying the account list_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click the Account Details menu in the account
  @accountService_SIT02
  Scenario:account details page display
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When account details page display

  @accountService_SIT03
  Scenario:alias setting main process_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click the Account Details menu and set alias information
    Then alias entered and saved successfully
  @accountService_SIT04
  Scenario:click Download after the file is generated successfully_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Download after the file is generated successfully
  @accountService_SIT05
  Scenario:successfully downloaded batch new domestic payee template_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When succeeded in downloading the batch added domestic payee template
  @accountService_SIT06
  Scenario:personal information management Basic information management, modify customer nicknames_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When modifying customer nicknames
    Then the customer nickname is changed successfully
  @accountService_SIT07
  Scenario:query operation logs of the personal center_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When query operation logs of the personal center
    Then operation logs of the personal center are successfully queried
  @accountService_SIT08
  Scenario:personal center online banking transaction query screening conditions_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When personal center online banking transaction query screening conditions
  @accountService_SIT09
  Scenario:personal center online banking transaction query submission time selection nearly seven days_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When personal center online banking transaction query submission time selection nearly seven days

  @accountService_SIT10
  Scenario:I query the transaction details list on the page_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I query the transaction details list on the page
      |AccountNum    |
      |1102 0327 405 |
