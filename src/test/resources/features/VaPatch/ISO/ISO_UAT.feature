@VaPatch_ISO_UAT
Feature: VaPatch_ISO_UAT

  @ISO-001_UAT
  Scenario:ISO to CNP_UAT
    Given logon "ISO_UAT" on ISO
    When enter the CNP

  @ISO-002_UAT
  Scenario:ISO to CPS_UAT
    Given logon "ISO_UAT" on ISO
    When enter the CPS

  @ISO-003_UAT
  Scenario:ISO to DFT_UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT

  @ISO-004_UAT
  Scenario:ISO to EBK_UAT
    Given logon "ISO_UAT" on ISO
    When enter the EBK

  @ISO-005_UAT
  Scenario:ISO to ESC_UAT
    Given logon "ISO_UAT" on ISO
    When enter the ESC

  @ISO-006_UAT
  Scenario:ISO to EST_UAT
    Given logon "ISO_UAT" on ISO
    When enter the EST

  @ISO-007_UAT
  Scenario:ISO to IMS_UAT
    Given logon "ISO_UAT" on ISO
    When enter the IMS

  @ISO-008_UAT
  Scenario:ISO to SCF_UAT
    Given logon "ISO_UAT" on ISO
    When enter the SCF

  @ISO-009_UAT
  Scenario:ISO to SCF-JOB_UAT
    Given logon "ISO_UAT" on ISO
    When enter the SCF-JOB

  @ISO-0010_UAT
  Scenario:ISO to SmartBI_UAT
    Given logon "ISO_UAT" on ISO
    When enter the SmartBI

  @ISO-0011_UAT
  Scenario:ISO to login_UAT
    Given logon "ISO_UAT" on ISO
    When check ISO

  @ISO-0012_UAT
  Scenario:ISO to logout_UAT
    Given logon "ISO_UAT" on ISO
    When logout ISO

  @ISO-0012_UAT
  Scenario:ISO to logout_UAT
    Given logon "ISO_UAT" on ISO