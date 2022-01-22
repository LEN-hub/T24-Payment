@tubeByInputting
Feature: tube By Inputtingt


  Scenario:Create buyer's customer file selection: operator input, operator input buyer's basic information, no need to review, create buyer's customer successfully
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the buyer information in the pop-up window
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 buyer information on the Authorized Person page
    Then Successfully create buyer customer information


  Scenario:Create your own profile and send invitations
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page
    And I click the email icon to send the email
    And I received an email from Green Union Bank on the email page
    Then I check that the email has been sent successfully

    @ext
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully
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
      When I get the verification code in the email and click to jump to the GLDB page to fill in the information and generate the verification code
      And I went back to the email page to get the verification code
      And I enter Company ID and click Login button
      Then Click login to jump to the Set New Password page
      When After login Set a New Password on the Set New Password page
      Then I jump to the login page
      When I fill in the content on the login page and click operation
#      Given logon "environments_3" test code
#      When I login service agreement window
      When I click agree Service Agreement
      Then I jump to the Tell Us About Your Company page
      When I entered information on the Tell Us About Your Company page
      Then Check whether to jump to the next page after filling in the content of Company page
      When Fill in the administrator information on the People page and click Next to go to the Next page
      Then Verify whether the director page is displayed
      When Fill in the board information on the current page and click the Next button
      Then Verify whether the Shareholder page is displayed
      When Fill in the user information on the Shareholder page
      Then Verify whether the Beneficial page is displayed
      When Fill in the information on the Beneficial page
      Then Verify whether the Account page is displayed
      When Enter the Account information
