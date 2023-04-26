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


  @ESC-044_UAT
  Scenario:Sign BR check ESC system
    Given logon "scf_environments_1_tian" on tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window to supplier
      |KYC Mode                  |Input by|Customer Type|
      |Full KYC + Account Opening|Customer|Supplier     |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page
    And I click the email icon to send the email
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox on scf uat env
    And I get the verification code on the email interface
    And I enter Company ID and click Login button
    Then Click login to jump to the Set New Password page
    When After login Set a New Password on the Set New Password page
      |first_new_password|second_new_password|
      |P@ssw0rd_123      |P@ssw0rd_123       |
    Then I jump to the login page
    When I entered new login information and successfully logged in
      |password    |
      |P@ssw0rd_123|
    When I click agree Service Agreement
    Then I jump to the Tell Us About Your Company page
    When I entered information on the Tell Us About Your Company page Full KYC
    Then Check whether to jump to the next page after filling in the content of Company page
    When Fill in the administrator information on the People page and click Next to go to the Next page
    When I modify the director's email address
    When I click next Button on the page
    Then Verify whether the Shareholder page is displayed
    When Fill in the user information on the Shareholder page
      |allocation |
      |SGD        |
    Then Verify whether the Beneficial page is displayed
    When Fill in the information on the Beneficial page
      |allocation |
      |SGD        |
    Then Verify whether the Account page is displayed
    When Enter the Account information
      |currency |
      |SGD      |
    Then Check whether the Questionnaire page is displayed
    When Enter information on the Questionnaire page
      |currency         |num    |
      |SGD 0 - 10,000   |1 to 20|
    Then Verify whether the Confirm page is displayed
    When Click the Submit button on the Confirm page
    When End the current browser process
    Given logon "scf_environments_1_tian" on tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver
    Given logon "scf_environments_2_tian" on tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I Check data status
    When I close driver
    Given Open Supplier Portal URL UAT
    When I input login data and click on the Login Supplier Portal URL
      |pass word   |Company ID|
      |P@ssw0rd_123|1234      |
    When I click Pending Signature button
    And I click confirm Button
    Then I close driver
    When I to sign one
    Then I to sign Two
    Given logon "ISO_UAT" on ISO
    When Enter the AllFiles Page
    Then input ContractId check


  @ESC-042_UAT
    #track3开户，签约 去ESC查看合同
  Scenario:openAccount Track3 check ESC system
    Given open "INB-automation-SIT-login" enterprise net silver page
    When click open Account New page
    Then New Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|2009117799 |
    Given logon "environments_5" on tube by inputting system online bank
    When I into the rear tube Supplementary account opening information
    When I close driver
    Given logon "environments_6" on tube by inputting system online bank
    When I enter the back tube for authorization
    When I enter the mailbox
    When I enter the track3 Applicant Email
