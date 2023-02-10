@Health_Check_SCF_SIT

Feature: Health Check SCF SIT Test Case

    #1.T24系统Health Check
  @T24_Health_Check_SIT
  Scenario:T24 System Health Check SIT
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I enter the Rating&Limits page
    When I operate with fixed data on the page
      |Test Data|Check Data        |
      |20221124B|YAYA 20221124B LTD|
    Then Verify whether the page Limit for THIS Product is consistent with the Proposed Limit value
      |amount|
      |10000 |
    Then I check whether the page prompts success information

  #2.ESSO系统Health Check
  @ESSO_Health_Check_SIT
  Scenario:ESSO System Health Check SIT
    Given logon "environments_SCF_SIT" test code
    When client login success
      |Email Name|
      |3t7ezhh7  |

    #3.CPS系统Health Check
  @CPS_Health_Check_SIT
  Scenario:CPS System Health Check SIT
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I enter the Underwriting Approval page
    When I select data and credit on the page
      |Test Data|
      |20221124B|

    #4.IMS系统Health Check
  @IMS_Health_Check_SIT
  Scenario:IMS System Health Check SIT
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click on the first Customers
    And click ContractManagement
    Then Enter the name of the supplier to filter

    #5.CNP系统Health Check
  @CNP_Health_Check_SIT
  Scenario:CNP System Health Check SIT
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
#      And I switch to the SCF page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode |Input by|Customer Type|
      |Full KYC |Customer|Supplier     |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page
    And I click the email icon to send the email
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

    #6.IB系统Health Check
  @IB_Health_Check_SIT
  Scenario:IB System Health Check SIT
    Given logon "environments_SCF_SIT" test code
    When client login success
      |Email Name|
      |p165662w  |
    When click Go to Digibank Link
    Then Check page jump success