@VaPatch_ISO_UAT
Feature: VaPatch_ISO_UAT

  @ISO-001_UAT
  Scenario:ISO to CNP_UAT
    Given logon "ISO_UAT" on ISO
    When enter the CNP
    Then I close driver

  @ISO-002_UAT
  Scenario:ISO to CPS_UAT
    Given logon "ISO_UAT" on ISO
    When enter the CPS
    Then I close driver


  @ISO-003_UAT
  Scenario:ISO to DFT_UAT
    Given logon "ISO_UAT" on ISO
    When enter the DFT
    Then I close driver


  @ISO-004_UAT
  Scenario:ISO to EBK_UAT
    Given logon "ISO_UAT" on ISO
    When enter the EBK
    Then I close driver


  @ISO-005_UAT
  Scenario:ISO to ESC_UAT
    Given logon "ISO_UAT" on ISO
    When enter the ESC
    Then I close driver


  @ISO-006_UAT
  Scenario:ISO to EST_UAT
    Given logon "ISO_UAT" on ISO
    When enter the EST
    Then I close driver


  @ISO-007_UAT
  Scenario:ISO to IMS_UAT
    Given logon "ISO_UAT" on ISO
    When enter the IMS
    Then I close driver


  @ISO-008_UAT
  Scenario:ISO to SCF_UAT
    Given logon "ISO_UAT" on ISO
    When enter the SCF
    Then I close driver


  @ISO-009_UAT
  Scenario:ISO to SCF-JOB_UAT
    Given logon "ISO_UAT" on ISO
    When enter the SCF-JOB
    Then I close driver


  @ISO-0010_UAT
  Scenario:ISO to SmartBI_UAT
    Given logon "ISO_UAT" on ISO
    When enter the SmartBI
    Then I close driver


  @ISO-0011_UAT
  Scenario:ISO to login_UAT
    Given logon "ISO_UAT" on ISO
    When check ISO
    Then I close driver


  @ISO-0012_UAT
  Scenario:ISO to logout_UAT
    Given logon "ISO_UAT" on ISO
    When logout ISO
    Then I close driver


  @ISO-0013_UAT
  Scenario:ISOBackStage to login_UAT
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When check IOS_BackStage
    Then I close driver


  @ISO-0014_UAT
  Scenario:ISOBackStage to logout_UAT
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When logout ISOBackStage
    Then check ISOBackStage logout
    Then I close driver


  @ISO-0015_UAT
  Scenario:Add ISO users
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When add IOS user
    Then check IOS New User Uat
    Then I close driver


  @ISO-0016_UAT
  Scenario:Change ISO users
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When change ISO user
    Then check change ISO user
    Then I close driver


#  先查询 在删除。
  @ISO-0019_UAT
  Scenario:Select ISO users
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When select ISO user
    Then I close driver


#    先重置在删除
  @ISO-0018_UAT
  Scenario:Reset ISO user password
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When Reset ISO user password
    Then check Reset ISO user password
    Then I close driver


  @ISO-0017_UAT
  Scenario:Delete ISO users
    Given logon "ISO_UAT_BackStage" on ISOBackStage
    When Delete ISO user
    Then check Delete ISO user
    Then I close driver





