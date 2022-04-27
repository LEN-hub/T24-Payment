@testReportTest
Feature: testReportTest
#
#  Scenario:After the download is successful, you can view the document statement
#    Given logon "environments_3" test code
#    When I enter login information
#    When I click report button
#    When I close driver
#
#
#  Scenario:Create buyer's customer file selection: operator input, operator input buyer's basic information, no need to review, create buyer's customer successfully
#    Given logon "environments_1" on tube by inputting system
#    When open the email browser page
#    And I switch to the SCF page
#    When I click Customers and select Onboarding List
#    And I click Create Customer and fill in the buyer information in the pop-up window
#    When I close driver
#
#
#
#  Scenario:Buyer The operator binds a supplier relationship that does not exist between a single system for the buyer's customer, and the binding is successful
#    Given logon "environments_1" on tube by inputting system
#    When I click Customers and select Customers Mapping
#    Then I should direct to the Customers Mapping page
#    When I click the Create New Buyer Relationship button and Create a New Relationship
#    When I click Create New Counter button on the page
#    And I should bind a Supplier information in his upstream
#    When I close driver
#
#  Scenario:createBuyerCreditFile
#    Given logon "environments_1" on tube by inputting system
#    When login successfully and click the SCF link to createBuyerCreditFile
#    And edit Buyer Credit Profile
#    Then submit Buyer Credit Profile
#    And  to Buyer Credit Profile Review page
#    Then buyer Credit Profile L1 Review
#    And change user To L2 Review
#    Then login "environments_2" on tube by inputting system
#    And use UserL2 to Review
#    When I close driver
#
#  Scenario:Buyer The operator initiated Buyer Entity Flow & Buyer Entity Public to grant credit to buyer customers, and the credit was successfully granted, and the limit and rating were obtained
#    Given logon "environments_1" on tube by inputting system
#    When I click UnderWriting and UnderWriting Approval
#    Then I should direct to the UnderWriting Approval page
##    When I click buyer Assign to Me button on UnderWriting Approval page
#    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
#    When I click Assign to ME title on the on UnderWriting Approval page
#    Then I should see Proceed Button on the UnderWriting Approval page
##    When I changed Rating is BB
#    When I click Result button on the UnderWriting Approval page
#    And I click Approve button and click Submit button on the page
#    When I click Completed Button on the UnderWriting Approval page
#    Given logon "environments_2" on tube by inputting system
#    When I click UnderWriting and UnderWriting Approval
#    Then I should direct to the UnderWriting Approval page
##    When I click buyer Assign to Me button on UnderWriting Approval page
#    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
#    When I click Assign to ME title on the on UnderWriting Approval page
#    Then I should see Proceed Button on the UnderWriting Approval page
#    When I click Result button on the UnderWriting Approval page
#    And I click Approve and click Submit button on the page
#    When I the second click Completed Button on the UnderWriting Approval page
#    When I click UnderWriting List button on the page
#    When I close driver
#
#
#  Scenario:When the supplier administrator creates a new user, the new user is a non-Internet banking user. The user receives an email and successfully logs in to the supplier portal according to the email prompt.
#    Given logon "environments_3" test code
#    When I input login information
#    When I click create user button
#      |first_new_password|second_new_password|
#      |P@ssw0rd_123      |P@ssw0rd_123       |
#    Then I jump to the login page
#    When I close driver
#
#  Scenario:Login home
#    Given logon "environments_1" on tube by inputting system
#    When I should see home after login
#    When I close driver

#  Scenario:Create your own profile and send invitations
#    Given logon "environments_1" on tube by inputting system
#    When open the email browser page
#    And I switch to the SCF page
#    When I click Customers and select Onboarding List
#    And I click Create Customer and fill in the supplier information in the pop-up window
#    Then I Check to see if you jump to the Authorized Person page
#    When Fill in email 1 and email 2 supplier information on the Authorized Person page
#    And I click the email icon to send the email
#    And I received an email from Green Union Bank on the email page
#    Then I check that the email has been sent successfully
#    When I close driver


  Scenario:Authorization Center2
    Given logon "EnrollerAccount" on enterprise net silver
    When I click transferMoney button
    When I click addPayee button and input information
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    When I should switch to the second authorized account
    Given logon second "Level1AuthorizedAccount" on enterprise net silver
    When I click My Tasks button on the logon page
    Then I should direct to the Awaiting authorization page
    When I click on the first piece of data to authorize
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    When I should switch to the second authorized account
#   When I switched to the account of the Level two Authorized
#    Given logon "Level2AuthorizedAccount" on enterprise net silver
    Given logon second "Level2AuthorizedAccount" on enterprise net silver
    When I click My Tasks button on the logon page
    Then I should direct to the Awaiting authorization page
    When I click on the first piece of data to authorize
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now