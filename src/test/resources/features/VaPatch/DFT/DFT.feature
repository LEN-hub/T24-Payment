@VaPatch_DFT
Feature: VaPatch_DFT

  @UAT-DFT-001
  Scenario:check Storage Capacity Statistics Date Ranking the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check Storage Capacity Statistics Date Ranking the DFT System
    Then I close driver

  @UAT-DFT-002
  Scenario:check Requests Statistics Date Ranking the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check Requests Statistics Date Ranking the DFT System
    Then I close driver

  @UAT-DFT-003
  Scenario:check logout the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check logout button the DFT System
    Then I close driver

  @UAT-DFT-004
  Scenario:Input SystemID check Query button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then Input SystemID check Query button the DFT System
    Then I close driver

  @UAT-DFT-005
  Scenario:Input SystemName check Query button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then Input SystemName check Query button the DFT System
    Then I close driver

  @UAT-DFT-006
  Scenario:Input SystemID And SystemName check Query button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then Input SystemID And SystemName check Query button the DFT System
    Then I close driver

  @UAT-DFT-007
  Scenario:Input SystemID check Reset button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then Input SystemID check Reset button the DFT System
    Then I close driver

  @UAT-DFT-008
  Scenario:Input 传输ID check 查询 button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then input Transfer Id check Query button the DFT Transfer Record Page
    Then I close driver

  @UAT-DFT-009
  Scenario:Input 发送方 check 查询 button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then input transmit leg check Query button the DFT Transfer Record Page
    Then I close driver

  @UAT-DFT-010
  Scenario:Input 传输ID And 发送方 check 查询 button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then input Transfer Id And transmit leg check Query button the DFT Transfer Record Page
    Then I close driver

  @UAT-DFT-011
  Scenario:Input 传输ID And 发送方 check Reset button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check Reset button the DFT Transfer Record Page
    Then I close driver

  @UAT-DFT-012
  Scenario:openAccount Track3 UAT check Upload Files
    Given open "netSilverEnv_Kevin" enterprise net silver page
    When click open Account New page
    Then New Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|2009117799 |