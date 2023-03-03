@Health_Check_INB_SIT

Feature: Health Check INB SIT Test Case

  Scenario: INB to t24
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When view meps account

  Scenario: INB to SCF
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When jump to SCF

  Scenario:INB to DFT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Download after the file is generated successfully