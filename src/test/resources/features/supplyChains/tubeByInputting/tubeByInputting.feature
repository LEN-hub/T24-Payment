@tubeByInputting
Feature: tube By Inputting


  Scenario:Create buyer's customer file selection: operator input, operator input buyer's basic information, no need to review, create buyer's customer successfully
    Given logon "environments_1" on tube by inputting system
    When open the email browser page
    And I switch to the SCF page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the buyer information in the pop-up window
#    Then I verify whether the current page is redirected


  Scenario:Create your own profile and send invitations
    Given logon "environments_1" on tube by inputting system
    When open the email browser page
    And I switch to the SCF page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page
    And I click the email icon to send the email
    And I received an email from Green Union Bank on the email page
    Then I check that the email has been sent successfully

  @supplierFullKYC
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully
      Given logon "environments_2" on tube by inputting system
      When open the email browser page
#      And I switch to the SCF page
      When I click Customers and select Onboarding List
      And I click Create Customer and fill in the supplier information in the pop-up window
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
#      Given logon "environments_3" test code
#      When I login service agreement window
      When I click agree Service Agreement
      Then I jump to the Tell Us About Your Company page
#       When I click next Button on the page
      When I entered information on the Tell Us About Your Company page
      Then Check whether to jump to the next page after filling in the content of Company page
      When Fill in the administrator information on the People page and click Next to go to the Next page
      When I click next Button on the page
#      Then Verify whether the director page is displayed
#      When Fill in the board information on the current page and click the Next button
      Then Verify whether the Shareholder page is displayed
      When Fill in the user information on the Shareholder page
        |allocation |
        |SGD        |
      Then Verify whether the Beneficial page is displayed
      When Fill in the information on the Beneficial page
        |allocation |
        |SGD        |
#      Then Verify whether the Account page is displayed
#      When Enter the Account information
#        |currency |
#        |SGD      |
#      Then Check whether the Questionnaire page is displayed
#      When Enter information on the Questionnaire page
#        |currency         |num    |
#        |SGD 0 - 10,000   |1 to 20|
#      Then Verify whether the Confirm page is displayed
      When Click the Submit button on the Confirm page
      When End the current browser process
#      Given logon "environments_1" on tube by inputting system
#      When Approval in the supply chain system
#      Then Switch To the Assign To Me page and perform the corresponding operations


  @text123456
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully Account
    Given logon "environments_1" on tube by inputting system
    When open the email browser page
#      And I switch to the SCF page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
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
#      Given logon "environments_3" test code
#      When I login service agreement window
    When I click agree Service Agreement
    Then I jump to the Tell Us About Your Company page
#       When I click next Button on the page
    When I entered information on the Tell Us About Your Company page
    Then Check whether to jump to the next page after filling in the content of Company page
    When Fill in the administrator information on the People page and click Next to go to the Next page
    When I click next Button on the page
#      Then Verify whether the director page is displayed
#      When Fill in the board information on the current page and click the Next button
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
#    Given logon "environments_1" on tube by inputting system
#    When Approval in the supply chain system
#    Then Switch To the Assign To Me page and perform the corresponding operations


#  买方建档
  @BuyerFULLKYC
  Scenario:Create buyer customer profile select: the customer input, the customer input related information, the buyer customer created successfully
    Given logon "environments_1" on tube by inputting system
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


    @BuyerFULLKYCAccount
    Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully Account
      Given logon "environments_1" on tube by inputting system
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


  @approve
  Scenario:sagasfasda
      Given logon "environments_1" on tube by inputting system
      When Approval in the buyer chain system
      Then Switch To the Assign To Me page and perform the corresponding operations buyer
      When I close driver
      Given logon "environments_2" on tube by inputting system
      When Approval in the buyer chain system
      Then Switch To the Assign To Me page and perform the corresponding operations buyer
      When I close driver

  #1.simple（核心不存在、非自主、无管理员）
  @simpleKYC01
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully Account Simple KYC No Administrator
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode    |Input by|
      |Simple KYC  |Operator|
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC No Administrator
    When I fill in Simple KYC customer information on the page No Administrator
      |Nature of Business   |
      |Agriculture & Fishing|
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I close driver
    Given logon "environments_2" on tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Status |
      |Approve|

    #2.simple（核心不存在、非自主、管理员）
  @simpleKYC02
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully Account Simple KYC
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode    |Input by|
      |Simple KYC  |Operator|
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC
    When I fill in Simple KYC customer information on the page
      |Nature of Business   |Id Type |
      |Agriculture & Fishing|Passport|
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I close driver
    Given logon "environments_2" on tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I click Customers and select Onboarding List
    Then I compare Registration Status on the page
    And I click the email icon to send the email
    When open the email browser page
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox
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
    Given logon "environments_2" on tube by inputting system
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Status |
      |Approve|

    #3.(1)simple（无管理员）--full（customer）
  @simpleKYC03
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully Account Simple KYC No Administrator full customer
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode    |Input by|
      |Simple KYC  |Operator|
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC No Administrator
    When I fill in Simple KYC customer information on the page No Administrator
      |Nature of Business   |
      |Agriculture & Fishing|
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I close driver
    Given logon "environments_2" on tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Status |
      |Approve|
    When I click Upgrade KYC on the page and process the corresponding information
      |Upgrade Mode|Input By|
      |Full KYC    |Customer|
    When I enter the information of Administrator 1 and Administrator 2 of Upgrade KYC respectively on the page
    Then I compare Approved Status on the page
      |Status |
      |Upgrade|
    And I click the email icon to send the email
    When open the email browser page
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox
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

       #2.simple（核心不存在、非自主、管理员）
  @simpleKYC02
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully Account Simple KYC
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
      |KYC Mode    |Input by|
      |Simple KYC  |Operator|
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC
    When I fill in Simple KYC customer information on the page
      |Nature of Business   |Id Type |
      |Agriculture & Fishing|Passport|
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I close driver
    Given logon "environments_2" on tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |
      |Approve|
    When I click Customers and select Onboarding List
    Then I compare Registration Status on the page
    And I click the email icon to send the email
    When open the email browser page
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox
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
    Given logon "environments_2" on tube by inputting system
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Status |
      |Approve|
    When I click Upgrade KYC on the page and process the corresponding information
      |Upgrade Mode|Input By|
      |Full KYC    |Customer|
    When I enter the information of Administrator 1 and Administrator 2 of Upgrade KYC respectively on the page
    Then I compare Approved Status on the page
      |Status |
      |Upgrade|
    And I click the email icon to send the email
    When open the email browser page
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox
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