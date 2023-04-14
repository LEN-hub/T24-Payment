@VaPatch_ESC_UAT
Feature: VaPatch_ESC_UAT

  @ESC-001_UAT
  Scenario:All Files page check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check AllFiles Data

  @ESC-002_UAT
  Scenario:To Be Signed page check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check To Be Signed Page

  @ESC-003_UAT
  Scenario:Signing In Progress page check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Signing In Progress Page

  @ESC-004_UAT
  Scenario:Signing Completed page check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Signing Completed Page

  @ESC-005_UAT
  Scenario:Signing Failed page check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Signing Failed Page

  @ESC-006_UAT
  Scenario:Template Management page check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Template Management Page

  @ESC-007_UAT
  Scenario:AllFiles Page See button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check see button

  @ESC-008_UAT
  Scenario:AllFiles Page Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button

  @ESC-009_UAT
  Scenario:AllFiles Page Search button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button

  @ESC-010_UAT
  Scenario:AllFiles Page Reset button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button

  @ESC-011_UAT
  Scenario:AllFiles Page batch Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button

  @ESC-012_UAT
  Scenario:To Be Signed Page See button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check see button the To Be Sign Page

  @ESC-013_UAT
  Scenario:To Be Signed Page Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the To Be Sign Page

  @ESC-014_UAT
  Scenario:To Be Signed Page Search button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the To Be Sign Page

  @ESC-015_UAT
  Scenario:To Be Signed Page Reset button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the To Be Sign Page

  @ESC-016_UAT
  Scenario:To Be Signed Page batch Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the To Be Sign Page

  @ESC-017_UAT
  Scenario:Signing In Progress Page see button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check see button the Signing In Progress Page

  @ESC-018_UAT
  Scenario:Signing In Progress Page Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the Signing In Progress Page

  @ESC-019_UAT
  Scenario:Signing In Progress Page Search button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the Signing In Progress Page

  @ESC-020_UAT
  Scenario:Signing In Progress Page Reset button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Signing In Progress Page

  @ESC-021_UAT
  Scenario:Signing In Progress Page batch Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the Signing In Progress Page