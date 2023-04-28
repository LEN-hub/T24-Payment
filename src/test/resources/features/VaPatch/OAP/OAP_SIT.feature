@VaPatch_OAP_SIT
Feature: VaPatch_OAP_SIT

  @OAP-002_SIT
  Scenario:Create chekk Customer
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    Then I input check Data Create Customer
      |KYC Mode                  |Input by|Customer Type|Company Name                 |Company Id |Country   |
      |Full KYC + Account Opening|Customer|Supplier     |FANDA PERFUME COMPANY LIMITED|0081837    |Hong Kong |
    When Fill in email 1 and email 2 supplier information on the Authorized Person page
    When I close driver
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
#   打开邮箱 找到IDV 链接
    Then I check IDV link
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
    When I click Customers and select Onboarding List
    Then I delete check Data
      |Company Name                 |
      |FANDA PERFUME COMPANY LIMITED|
    When I close driver



  @OAP-003_SIT
  Scenario:Cross-currency transfer SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0002 414   |1101 0000 489|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
    When I close driver

  @OAP-004_SIT
  Scenario:Login CNP Short message resend SIT
    Given logon "ISO_SIT" on ISO
    When enter the CNP resend Short message SIT
    When I close driver

  @OAP-005_SIT
  Scenario:High risk of overseas transfer SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                  |
      |1101 0003 747 |The expenses shall be borne by each party |
    And I choose the payment currency
      |Currency   |
      |SGD        |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |344444                |RRRRR       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBS BANK LTD    |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |AFGHANISTAN    |ok                |
    When I input high-risk data
    When I close driver