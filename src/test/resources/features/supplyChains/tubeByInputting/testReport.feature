@testReportForSCF
Feature: test report for scf

      @scf1
  Scenario:Create supplier customer Full KYC
    Given logon "environments_1" on tube by inputting system
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
    #Given logon "environments_1" on tube by inputting system
    #When Approval in the supply chain system
    #Then Switch To the Assign To Me page and perform the corresponding operations


    @scf2
  Scenario:Create supplier customer profile Full KYC and Account
    Given logon "environments_1" on tube by inputting system
    When open the email browser page
    #      And I switch to the SCF page
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
    |KYC Mode                     |Input by|
    |Full KYC + Account Opening   |Customer|
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
    #Given logon "environments_1" on tube by inputting system
    #When Approval in the supply chain system
    #Then Switch To the Assign To Me page and perform the corresponding operations