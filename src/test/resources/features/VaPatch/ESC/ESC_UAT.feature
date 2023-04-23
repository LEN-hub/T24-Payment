@VaPatch_ESC_UAT
Feature: VaPatch_ESC_UAT

  @ESC-001_UAT
  Scenario:All Files page check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check AllFiles Data
    Then I close driver

  @ESC-002_UAT
  Scenario:To Be Signed page check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check To Be Signed Page
    Then I close driver

  @ESC-003_UAT
  Scenario:Signing In Progress page check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Signing In Progress Page
    Then I close driver

  @ESC-004_UAT
  Scenario:Signing Completed page check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Signing Completed Page
    Then I close driver

  @ESC-005_UAT
  Scenario:Signing Failed page check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Signing Failed Page
    Then I close driver

  @ESC-006_UAT
  Scenario:Template Management page check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check the Template Management Page
    Then I close driver

  @ESC-007_UAT
  Scenario:AllFiles Page See button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check see button
    Then I close driver

  @ESC-008_UAT
  Scenario:AllFiles Page Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button
    Then I close driver

  @ESC-009_UAT
  Scenario:AllFiles Page Search button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button
    Then I close driver

  @ESC-010_UAT
  Scenario:AllFiles Page Reset button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button
    Then I close driver

  @ESC-011_UAT
  Scenario:AllFiles Page batch Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button
    Then I close driver

  @ESC-012_UAT
  Scenario:To Be Signed Page See button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check see button the To Be Sign Page
    Then I close driver

  @ESC-013_UAT
  Scenario:To Be Signed Page Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the To Be Sign Page
    Then I close driver

  @ESC-014_UAT
  Scenario:To Be Signed Page Search button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the To Be Sign Page
    Then I close driver

  @ESC-015_UAT
  Scenario:To Be Signed Page Reset button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the To Be Sign Page
    Then I close driver

  @ESC-016_UAT
  Scenario:To Be Signed Page batch Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the To Be Sign Page
    Then I close driver

  @ESC-017_UAT
  Scenario:Signing In Progress Page see button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check see button the Signing In Progress Page
    Then I close driver

  @ESC-018_UAT
  Scenario:Signing In Progress Page Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the Signing In Progress Page
    Then I close driver

  @ESC-019_UAT
  Scenario:Signing In Progress Page Search button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the Signing In Progress Page
    Then I close driver

  @ESC-020_UAT
  Scenario:Signing In Progress Page Reset button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Signing In Progress Page
    Then I close driver

  @ESC-021_UAT
  Scenario:Signing In Progress Page batch Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the Signing In Progress Page
    Then I close driver

  @ESC-022_UAT
  Scenario:Signing Completed Page See button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check See button the Signing Completed Page
    Then I close driver

  @ESC-023_UAT
  Scenario:Signing Completed Page Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the Signing Completed Page
    Then I close driver

  @ESC-024_UAT
  Scenario:Signing Completed Page Search button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the Signing Completed Page
    Then I close driver

  @ESC-025_UAT
  Scenario:Signing Completed Page Reset button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Signing Completed Page
    Then I close driver

  @ESC-026_UAT
  Scenario:Signing Completed Page batch Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the Signing Completed Page
    Then I close driver

  @ESC-027_UAT
  Scenario:Signing Failed Page See button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check See button the Signing Failed Page
    Then I close driver

  @ESC-028_UAT
  Scenario:Signing Failed Page Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Download button the Signing Failed Page
    Then I close driver

  @ESC-029_UAT
  Scenario:Signing Failed Page Search button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Search button the Signing Failed Page
    Then I close driver

  @ESC-030_UAT
  Scenario:Signing Failed Page Reset button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Signing Failed Page
    Then I close driver

  @ESC-031_UAT
  Scenario:Signing Failed Page batch Download button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check batch Download button the Signing Failed Page
    Then I close driver

  @ESC-032_UAT
  Scenario:Contract Management Page Initiate contract button upload check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then upload document the Initiate contract Page
    Then I close driver

  @ESC-033_UAT
  Scenario:Contract Management Page Initiate contract button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Initiate contract button the Contract Management Page
    Then check Use template the Template Management Page
    Then I close driver

  @ESC-034_UAT
  Scenario:Template Management Page Query button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Query button the Template Management Page
    Then I close driver

  @ESC-035_UAT
  Scenario:Template Management Page Reset button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Reset button the Template Management Page
    Then I close driver

  @ESC-036_UAT
  Scenario:Template Management Page Create button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check create Template on Template Management Page
    And  check Deactivate button the Template Management Page
    Then I close driver

  @ESC-037_UAT
  Scenario:Template Management Page See button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check See button the Template Management Page
    Then I close driver

  @ESC-038_UAT
  Scenario:Template Management Page Deactivate button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check create Template on Template Management Page
    And  check Deactivate button the Template Management Page
    Then I close driver

  @ESC-039_UAT
  Scenario:Template Management Page Copy template button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check create Template on Template Management Page
    And check copy Template the Template Management Page
    Then I close driver

  @ESC-040_UAT
  Scenario:Template Management Page Use template button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Use template the Template Management Page
    Then I close driver

  @ESC-041_UAT
  Scenario:Template Management Page Journal button check UAT
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then check Journal button the Template Management
    Then I close driver