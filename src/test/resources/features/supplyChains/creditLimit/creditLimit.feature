@creditLimit
Feature: test creditLimit

  Scenario:The operator initiated Buyer Entity Flow & Buyer Entity Public to grant credit to buyer customers, and the credit was successfully granted, and the limit and rating were obtained
    Given logon "environments_1" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
    When I click buyer Assign to Me button on UnderWriting Approval page
#    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    Then I should see Proceed Button on the UnderWriting Approval page
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
    When I click Completed Button on the UnderWriting Approval page
    Given logon "environments_2" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
    When I click buyer Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    Then I should see Proceed Button on the UnderWriting Approval page
    When I click Result button on the UnderWriting Approval page
    And I click Approve and click Submit button on the page
    When I the second click Completed Button on the UnderWriting Approval page
    When I click UnderWriting List button on the page


@test
Scenario:The operator initiates the supplier's credit, the whole process is approved, the credit is successful, and the limit and rating are obtained
  Given logon "environments_1" on tube by inputting system
  When I click UnderWriting and UnderWriting Approval
  Then I should direct to the UnderWriting Approval page
  When I click Supplier Assign to Me button on UnderWriting Approval page
#  When I click buyer Assign to Me button on UnderWriting Approval page
  When I click Assign to ME title on the on UnderWriting Approval page
#  Then I should see Proceed Button on the UnderWriting Approval page
  When I should see Supplier Proceed Button and click on the UnderWriting Approval page
  When I click Result button on the UnderWriting Approval page
  And I click Approve button and click Submit button on the page
  When I click Completed Button on the UnderWriting Approval page
  Given logon "environments_2" on tube by inputting system
  When I click UnderWriting and UnderWriting Approval
  Then I should direct to the UnderWriting Approval page
  When I click Supplier Assign to Me button on UnderWriting Approval page
  When I click Assign to ME title on the on UnderWriting Approval page
  When I should see Supplier Proceed Button and click on the UnderWriting Approval page
  When I click Result button on the UnderWriting Approval page
  And I click Approve button and click Submit button on the page
  When I the second click Completed Button on the UnderWriting Approval page
  When I click UnderWriting List button on the page



@test
  Scenario:Buyer The operator initiated Buyer Entity Flow & Buyer Entity Public to grant credit to buyer customers, and the credit was successfully granted, and the limit and rating were obtained
    Given logon "environments_1" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
#    When I click buyer Assign to Me button on UnderWriting Approval page
    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    Then I should see Proceed Button on the UnderWriting Approval page
#    When I changed Rating is BB
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
    When I click Completed Button on the UnderWriting Approval page
    Given logon "environments_2" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
#    When I click buyer Assign to Me button on UnderWriting Approval page
    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    Then I should see Proceed Button on the UnderWriting Approval page
    When I click Result button on the UnderWriting Approval page
    And I click Approve and click Submit button on the page
    When I the second click Completed Button on the UnderWriting Approval page
    When I click UnderWriting List button on the page


#授信限额。
@testReportCreditLimit
  Scenario:1Supplier The operator initiates the supplier's credit, the whole process is approved, the credit is successful, and the limit and rating are obtained
    Given logon "environments_1" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
#    When I click Supplier Assign to Me button on UnderWriting Approval page
    When I click Supplier Test Data Assign to Me button on UnderWriting Approval page
#  When I click buyer Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
#  Then I should see Proceed Button on the UnderWriting Approval page
    When I should see Supplier Proceed Button and click on the UnderWriting Approval page
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
#    When I changed Rating is BB
    When I click Completed Button on the UnderWriting Approval page
    Given logon "environments_2" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
#    When I click Supplier Assign to Me button on UnderWriting Approval page
    When I click Supplier Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    When I should see Supplier Proceed Button and click on the UnderWriting Approval page
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
    When I the second click Completed Button on the UnderWriting Approval page
    When I click UnderWriting List button on the page


@testReportBr
   Scenario:BR signed
    Given Open Supplier Portal URL
    When I input login data and click on the Login Supplier Portal URL
      |pass word   |Company ID|
      |P@ssw0rd_123|1234      |
    When I click Pending Signature button
    And I click confirm Button
    When I login email URL
    When I to sign









