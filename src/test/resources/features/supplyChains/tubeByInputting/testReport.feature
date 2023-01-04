@testReportForSCF
Feature: test report for scf
 #1.simple（核心不存在、非自主、无管理员）
  @simpleKYC01_SIT
  Scenario:Simple (core does not exist, non autonomous, no administrator)_SIT
    Given logon "scf_sit1" on sit tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode    |Input by|Customer Type|
      |Simple KYC  |Operator|Buyer        |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC No Administrator
    When I fill in Simple KYC customer information on the page No Administrator
      |Nature of Business   |
      |Agriculture & Fishing|
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I close driver
    Given logon "scf_sit2" on sit tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Status  |
      |Approved|
    When I close driver

     #2.simple（核心不存在、非自主、管理员）
  @simpleKYC02_SIT
  Scenario: Simple (non-existent core, non autonomous, administrator)_SIT
    Given logon "scf_sit1" on sit tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode    |Input by|Customer Type|
      |Simple KYC  |Operator|Buyer        |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC
    When I fill in Simple KYC customer information on the page
      |Nature of Business   |Id Type |
      |Agriculture & Fishing|Passport|
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I close driver
    Given logon "scf_sit2" on sit tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I click Customers and select Onboarding List
    Then I compare Registration Status on the page
    And I click the email icon to send the email
    When open the email browser page
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox on scf sit env
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
    When I click agree Service Agreement on simple KYC
    When I click the Confirmation Information button on the page
    When I close driver
    Given logon "scf_sit2" on sit tube by inputting system
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Status  |
      |Approved|
    When I close driver
