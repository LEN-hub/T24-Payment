@supplyChainRun
Feature: supply chain run

#  建档-供应商
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully
    Given logon "environments_1" on tube by inputting system
    When open the email browser page
#      And I switch to the SCF page
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
    When I click next Button on the page
    When I entered information on the Tell Us About Your Company page
    Then Check whether to jump to the next page after filling in the content of Company page
    When Fill in the administrator information on the People page and click Next to go to the Next page
#      When I click next Button on the page
    Then Verify whether the director page is displayed
    When Fill in the board information on the current page and click the Next button
    Then Verify whether the Shareholder page is displayed
    When Fill in the user information on the Shareholder page
    Then Verify whether the Beneficial page is displayed
    When Fill in the information on the Beneficial page
    Then Verify whether the Account page is displayed
    When Enter the Account information
      |currency|
      |SGD      |
    Then Check whether the Questionnaire page is displayed
    When Enter information on the Questionnaire page
      |currency         |num    |
      |SGD 0 - 10,000   |1 to 20|
    Then Verify whether the Confirm page is displayed
    When Click the Submit button on the Confirm page
    When End the current browser process
    Given logon "environments_1" on tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver
    Given logon "environments_2" on tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver


#绑定关系
  Scenario:Supplier The operator binds the supplier to a buyer relationship that does not exist between a single system, and the binding is successful
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Customers Mapping
    Then I should direct to the Customers Mapping page
    When I click the Create New Supplier Relationship button and Create a New Relationship
    When I click Create New Counter button on the page
    And I should bind a buyer information in his downstream
    When I close driver

#    产品设置
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 003
    Given logon "environments_001" on tube by inputting system
    When I click product
    When I click on Product List
    And  click Create Product
    When enter the page information
    Then click Submit to submit a new product
    Then Refresh check whether the data is added successfully
    When I click product
    When I click on Quote List
    And  click Create Quote
    When enter the second case information supplier with buyer
      |selectCurr|
      |SGD       |
    Then I click Submit to submit a new product
    When I click product
    When I click ProductProfile
    And click Create ProductProfile
    When enter the second case information supplier and buyer
    Then I click Submit product profile
    And Enter login information
    When I close driver

#创建信用档案
  Scenario:createSupplierCreditFile
    Given logon "environments_1" on tube by inputting system
    When login successfully and click the SCF link to createSupplierCreditFile
    And edit Supplier Credit Profile
    Then submit Supplier Credit Profile
    And to Supplier Credit Profile Review Page
    Then Supplier Credit Profile L1 Review
    And change user To L2 Review
    Given logon "environments_2" on tube by inputting system
    And use User L2 to Supplier Review
    When I close driver

#    授信限额
  Scenario:1Supplier The operator initiates the supplier's credit, the whole process is approved, the credit is successful, and the limit and rating are obtained
    Given logon "environments_1" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
    When I click Supplier Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    When I should see Supplier Proceed Button and click on the UnderWriting Approval page
    When I update Limit for THIS Product
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
    When I click Completed Button on the UnderWriting Approval page
    Given logon "environments_2" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
    When I click Supplier Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    When I should see Supplier Proceed Button and click on the UnderWriting Approval page
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
    When I the second click Completed Button on the UnderWriting Approval page
    When I click UnderWriting List button on the page
    When I close driver


#  BR签署
  Scenario:BR signed
    Given Open Supplier Portal URL
    When I input login data and click on the Login Supplier Portal URL
      |pass word   |Company ID|
      |P@ssw0rd_123|1234      |
    When I click Pending Signature button
    And I click confirm Button
    When I login email URL
    When I to sign
    When I close driver
    When I open email URL
    When I login two email URL
    When I close driver


#   RPA上传
  Scenario:UAT_ Supply chain_ Inner tube_ Create RPA_ 0001
    Given logon "environments_001" on tube by inputting system
    When I click on the first Customers
    And click ContractManagement
    Then Enter the name of the supplier to filter
    When Upload a file
      |fileAddress                                                            |
      |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|
    Then Jump to the supplier portal to check the RPA
    When I close driver


##   融资申请
#  Scenario:financingRequest1
#    Given logon "environments_3" test code
#    When I input login information
#    When login successfully and click RequestFinancing
#    Then upload RequestFinancing File
#    And  logon "environments_1" on tube by inputting system
#    Then click Operations to Review
#    And change user To L2 Review
#    Then login "environments_2" on tube by inputting system
#    And click Operations to Review
#    Given logon "environments_3" test code
#    When I input login information
#    And click Financing Status
#    When I close driver
#
#
##   放款
#  Scenario:UAT_ Supply chain_ Inner tube_ Create payments_ 0001
#    Given logon "environments_001" on tube by inputting system
#    When When I hit Operations
#    And click Request for Disbursement
#    When I click on Assign To Me
#    Then I click Submit
#    When I click on Review Disbursement
#    And  click proceed
#    Then Click on the submit APPROVE
#    When Confirm Disbursement page
#    When I close driver
#
#
##    还款
#  Scenario:UAT_supply chain_inner management_repayment_0001UAT_supply chain_inner management_repayment_0001
#    Given logon "environments_1" on tube by inputting system
#    When I click Operations button
#    When I click Repayment button
#    Then I should direct to the Repayment Management page
##    When I click the Assign to me button of the repayment data
#    When I click Assign to ME title on the on Repayment Management page
#    When I click Proceed Button on the Repayment Management Page
#    Then I should direct to the Repayment Detail page
#    When I select Repayment Account No on the page
#    And I enter other parameters in the current page
#    When I close driver



#  买方建档一系列流程
#
#  Scenario:Create buyer's customer file selection: operator input, operator input buyer's basic information, no need to review, create buyer's customer successfully
#    Given logon "environments_1" on tube by inputting system
#    When open the email browser page
#    And I switch to the SCF page
#    When I click Customers and select Onboarding List
#    And I click Create Customer and fill in the buyer information in the pop-up window
#    When I close driver
#
##  买方 绑定关系
#  Scenario:Buyer The operator binds a supplier relationship that does not exist between a single system for the buyer's customer, and the binding is successful
#    Given logon "environments_1" on tube by inputting system
#    When I click Customers and select Customers Mapping
#    Then I should direct to the Customers Mapping page
#    When I click the Create New Buyer Relationship button and Create a New Relationship
#    When I click Create New Counter button on the page
#    And I should bind a Supplier information in his upstream
#    When I close driver
#
##   买方 信用档案
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
#
##  买方授信限额
#  Scenario:Buyer The operator initiated Buyer Entity Flow & Buyer Entity Public to grant credit to buyer customers, and the credit was successfully granted, and the limit and rating were obtained
#    Given logon "environments_1" on tube by inputting system
#    When I click UnderWriting and UnderWriting Approval
#    Then I should direct to the UnderWriting Approval page
#    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
#    When I click Assign to ME title on the on UnderWriting Approval page
#    Then I should see Proceed Button on the UnderWriting Approval page
#    When I update Limit for THIS Product
#    When I click Result button on the UnderWriting Approval page
#    And I click Approve button and click Submit button on the page
#    When I click Completed Button on the UnderWriting Approval page
#    Given logon "environments_2" on tube by inputting system
#    When I click UnderWriting and UnderWriting Approval
#    Then I should direct to the UnderWriting Approval page
#    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
#    When I click Assign to ME title on the on UnderWriting Approval page
#    Then I should see Proceed Button on the UnderWriting Approval page
#    When I click Result button on the UnderWriting Approval page
#    And I click Approve and click Submit button on the page
#    When I the second click Completed Button on the UnderWriting Approval page
#    When I click UnderWriting List button on the page
#    When I close driver


#    mvn clean verify `-Dcucumber.options="--tags @supplyChainRun"