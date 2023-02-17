@Health_Check_SCF_UAT

Feature: Health Check SCF SIT Test Case

    #1.T24系统Health Check
  @T24_Health_Check_UAT
  Scenario:T24 System Health Check UAT
    Given logon "scf_environments_1_yang" on tube by inputting system
    When I enter the Rating&Limits page
    When I operate with fixed data on the page
      |Test Data|Check Data        |
      |20230112A|YAYA 20230112A LTD|
    Then Verify whether the page Limit for THIS Product is consistent with the Proposed Limit value
      |amount|
      |10000 |
    Then I check whether the page prompts success information

  #2.ESSO系统Health Check
  @ESSO_Health_Check_UAT
  Scenario:ESSO System Health Check UAT
    Given logon "environments_SCF_UAT" test code
    When client login success
      |Email Name|
      |v8c1pwr9  |

    #3.CPS系统Health Check
  @CPS_Health_Check_UAT
  Scenario:CPS System Health Check UAT
    Given logon "scf_environments_1_yang" on tube by inputting system
    When I enter the Underwriting Approval page
    When I select data and credit on the page
      |Test Data   |
      |Brittanyw76m|

    #4.ISSO系统Health Check
  @ISSO_Health_Check_UAT
  Scenario:ISSO System Health Check UAT
    Given logon "scf_environments_1_yang" on tube by inputting system
    Then Login succeeded jump to SCF homepage

    #5.IMS系统Health Check
  @IMS_Health_Check_UAT
  Scenario:IMS System Health Check UAT
    Given logon "scf_environments_1_yang" on tube by inputting system
    When I click on the first Customers
    And click ContractManagement
    Then Upload RPA file in UAT

    #6.CNP系统Health Check
  @CNP_Health_Check_UAT
  Scenario:CNP System Health Check UAT
    Given logon "scf_environments_1_yang" on tube by inputting system
    When open the email browser page
    #And I switch to the SCF page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode                    |Input by|Customer Type|
      |Full KYC + Account Opening  |Customer|Supplier     |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page
    And I click the email icon to send the email
    And I received an email from Green Union Bank on the email page
    Then I check that the email has been sent successfully
    When I get the verification code in the email and click to jump to the GLDB page to fill in the information and generate the verification code
    And I went back to the email page to get the verification code
    And I enter Company ID and click Login button
    Then Click login to jump to the Set New Password page
    When After login Set a New Password on the Set New Password page
      |first_new_password|second_new_password|
      |P@ssw0rd_123      |P@ssw0rd_123       |
    Then I jump to the login page
    When I fill in the content on the login page and click operation
      |password    |
      |P@ssw0rd_123|

    #7.INB系统Health Check
  @INB_Health_Check_UAT
  Scenario:INB System Health Check UAT
    Given logon "environments_SCF_UAT" test code
    When client login success
      |Email Name|
      |v8c1pwr9  |
    When click Go to Digibank Link
    Then Check page jump success uat

 #8.AML系统Health Check
  @AML_Health_Check_UAT
  Scenario:AML System Health Check UAT
    Given logon "scf_environments_1_yang" on tube by inputting system
    When Financing application for approval
    And I close driver
    When logon "scf_environments_2_yang" on tube by inputting system
    Then Financing application for approval Return
