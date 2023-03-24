@Onboarding_SIT
Feature: On Boarding SIT

#  供应商建档FULL KYC
  @@supplier_Full_KYC_SIT
  Scenario:On Boarding supplier FULL KYC
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window to supplier
      |KYC Mode   |Input by|Customer Type|
      |Full KYC   |Customer|Supplier     |
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
    When I click agree Service Agreement
    Then I jump to the Tell Us About Your Company page
    When I entered information on the Tell Us About Your Company page
    Then Check whether to jump to the next page after filling in the content of Company page
    When Fill in the administrator information on the People page and click Next to go to the Next page
    When I click next Button on the page
    Then Verify whether the Shareholder page is displayed
    When Fill in the user information on the Shareholder page
      |allocation |
      |SGD        |
    Then Verify whether the Beneficial page is displayed
    When Fill in the information on the Beneficial page
      |allocation |
      |SGD        |
    When Click the Submit button on the Confirm page
    When End the current browser process
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver
    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver

   #  供应商建档FULL KYC Account
  @supplier_Full_KYC_Account_Opening_SIT
  Scenario:On Boarding supplier FULL KYC Account
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window to supplier
      |KYC Mode                  |Input by|Customer Type|
      |Full KYC + Account Opening|Customer|Supplier     |
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
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver
    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I Check data status
    When I close driver

#     买方 建档 FULL KYC
   @BuyerFULLKYC_SIT
  Scenario:On Boarding Buyer FULL KYC
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window buyer
      |KYC Mode   |Input by|
      |Full KYC   |Customer|
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
    When I click agree Service Agreement
    Then I jump to the Tell Us About Your Company page
    When I entered information on the Tell Us About Your Company page
    Then Check whether to jump to the next page after filling in the content of Company page
    When Fill in the administrator information on the People page and click Next to go to the Next page
    When I click next Button on the page
    Then Verify whether the Shareholder page is displayed
    When Fill in the user information on the Shareholder page
      |allocation |
      |SGD        |
    Then Verify whether the Beneficial page is displayed
    When Fill in the information on the Beneficial page
      |allocation |
      |SGD        |
    When Click the Submit button on the Confirm page
    When End the current browser process
     Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When Approval in the buyer chain system
    Then Switch To the Assign To Me page and perform the corresponding operations buyer
    When I close driver
     Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    When Approval in the buyer chain system
    Then Switch To the Assign To Me page and perform the corresponding operations buyer
    When I close driver

#  买方建档FULL KYC + Account
  @buyer_Full_KYC_Account_Opening_SIT
  Scenario:On Boarding Buyer FULL KYC Account
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window buyer
      |KYC Mode                    |Input by|
      |Full KYC + Account Opening  |Customer|
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
    When I click agree Service Agreement
    Then I jump to the Tell Us About Your Company page
    When I entered information on the Tell Us About Your Company page
    Then Check whether to jump to the next page after filling in the content of Company page
    When Fill in the administrator information on the People page and click Next to go to the Next page
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
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When Approval in the buyer chain system
    Then Switch To the Assign To Me page and perform the corresponding operations buyer
    When I close driver
    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    When Approval in the buyer chain system
    Then Switch To the Assign To Me page and perform the corresponding operations buyer
    When I close driver

    # 买方 simple 核心不存在 无管理员
  @sanity_pack_supplier_simple_kyc_buyer_sit
  Scenario:Simple buyer does not T24 , No administrator
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window to buyer
      |KYC Mode    |Input by|Customer Type|
      |Simple KYC  |Operator|Buyer        |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC No Administrator
    When I fill in Simple KYC customer information on the page No Administrator
      |Nature of Business   |Customer Type|
      |Agriculture & Fishing|Buyer        |
    When I authorize on the Onboarding Review page
      |Result |Customer Type|
      |Approve|Buyer        |
    When I close driver
    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |Customer Type|
      |Approve|Buyer        |
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Result  |Customer Type|
      |Approved|Buyer        |
    When I close driver