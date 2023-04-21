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

  @ESC-022_UAT
  Scenario:Signing Completed Page See button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check See button the Signing Completed Page

  @ESC-023_UAT
  Scenario:Signing Completed Page Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the Signing Completed Page

  @ESC-024_UAT
  Scenario:Signing Completed Page Search button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the Signing Completed Page

  @ESC-025_UAT
  Scenario:Signing Completed Page Reset button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Signing Completed Page

  @ESC-026_UAT
  Scenario:Signing Completed Page batch Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the Signing Completed Page

  @ESC-027_UAT
  Scenario:Signing Failed Page See button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check See button the Signing Failed Page

  @ESC-028_UAT
  Scenario:Signing Failed Page Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the Signing Failed Page

  @ESC-029_UAT
  Scenario:Signing Failed Page Search button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the Signing Failed Page

  @ESC-030_UAT
  Scenario:Signing Failed Page Reset button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Signing Failed Page

  @ESC-031_UAT
  Scenario:Signing Failed Page batch Download button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the Signing Failed Page

  @ESC-032_UAT
  Scenario:Contract Management Page Initiate contract button upload check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then upload document the Initiate contract Page

  @ESC-033_UAT
  Scenario:Contract Management Page Initiate contract button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Initiate contract button the Contract Management Page
    Then check Use template the Template Management Page

  @ESC-034_UAT
  Scenario:Template Management Page Query button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Query button the Template Management Page

  @ESC-035_UAT
  Scenario:Template Management Page Reset button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Template Management Page

  @ESC-036_UAT
  Scenario:Template Management Page Create button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check create Template on Template Management Page
    And  check Deactivate button the Template Management Page

  @ESC-037_UAT
  Scenario:Template Management Page See button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check See button the Template Management Page

  @ESC-038_UAT
  Scenario:Template Management Page Deactivate button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check create Template on Template Management Page
    And  check Deactivate button the Template Management Page

  @ESC-039_UAT
  Scenario:Template Management Page Copy template button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check create Template on Template Management Page
    And check copy Template the Template Management Page

  @ESC-040_UAT
  Scenario:Template Management Page Use template button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Use template the Template Management Page

  @ESC-041_UAT
  Scenario:Template Management Page Journal button check
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Journal button the Template Management