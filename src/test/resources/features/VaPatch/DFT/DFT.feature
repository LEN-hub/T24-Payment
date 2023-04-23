@VaPatch_DFT
Feature: VaPatch_DFT

  @UAT-DFT-001
  Scenario:check Storage Capacity Statistics Date Ranking the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check Storage Capacity Statistics Date Ranking the DFT System

  @UAT-DFT-002
  Scenario:check Requests Statistics Date Ranking the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check Requests Statistics Date Ranking the DFT System

  @UAT-DFT-003
  Scenario:check logout the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then check logout button the DFT System

  @UAT-DFT-004
  Scenario:Input SystemID check Query button the DFT UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then Input SystemID check Query button the DFT System
