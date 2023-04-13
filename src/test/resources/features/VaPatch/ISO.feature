@VaPatch_ISO
Feature: VaPatch_ISO

  @ISO-001
  Scenario:ISO to CNP
    Given logon "ISO_UAT" on ISO
    When enter the CNP

  @ISO-002
  Scenario:ISO to CPS
    Given logon "ISO_UAT" on ISO
    When enter the CPS

  @ISO-003
  Scenario:ISO to DFT
    Given logon "ISO_UAT" on ISO
    When enter the DFT

  @ISO-004
  Scenario:ISO to EBK
    Given logon "ISO_UAT" on ISO
    When enter the EBK

  @ISO-005
  Scenario:ISO to ESC
    Given logon "ISO_UAT" on ISO
    When enter the ESC

  @ISO-006
  Scenario:ISO to EST
    Given logon "ISO_UAT" on ISO
    When enter the EST

  @ISO-007
  Scenario:ISO to IMS
    Given logon "ISO_UAT" on ISO
    When enter the IMS

  @ISO-008
  Scenario:ISO to SCF
    Given logon "ISO_UAT" on ISO
    When enter the SCF

  @ISO-009
  Scenario:ISO to SCF-JOB
    Given logon "ISO_UAT" on ISO
    When enter the SCF-JOB

  @ISO-0010
  Scenario:ISO to SmartBI
    Given logon "ISO_UAT" on ISO
    When enter the SmartBI

  @ISO-0011
  Scenario:ISO to login
    Given logon "ISO_UAT" on ISO
    When check ISO

  @ISO-0012
  Scenario:ISO to logout
    Given logon "ISO_UAT" on ISO
    When logout ISO