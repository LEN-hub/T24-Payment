@testReportForSCF


Feature: test report for scf

  @supplierFullKYC
  Scenario:Create supplier customer profile select: the customer input, the customer input related information, the supplier customer created successfully
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When open the email browser page
#      And I switch to the SCF page
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
#      Given logon "environments_3" test code
#      When I login service agreement window
    When I click agree Service Agreement
    Then I jump to the Tell Us About Your Company page
#       When I click next Button on the page
    When I entered information on the Tell Us About Your Company page Full KYC
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
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver
    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    When Approval in the supply chain system
    Then Switch To the Assign To Me page and perform the corresponding operations
    When I close driver

   #1.simple（核心不存在、非自主、无管理员）
  @simpleKYC01_SIT_01
  Scenario:Simple (core does not exist, non autonomous, no administrator)_SIT
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


     #2.simple（核心不存在、非自主、管理员）
  @simpleAdmin
  Scenario: Simple (non-existent core, non autonomous, administrator)_SIT1
    Given logon "scf_environments_1_tian" on tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window to buyer
      |KYC Mode    |Input by|Customer Type|
      |Simple KYC  |Operator|Buyer        |
    Then I Check to see if you jump to the Authorized Person page
    When Fill in email 1 and email 2 supplier information on the Authorized Person page Simple KYC
    When I fill in Simple KYC customer information on the page
      |Nature of Business   |Id Type |Customer Type|
      |Agriculture & Fishing|Passport|Buyer        |
    When I authorize on the Onboarding Review page
      |Result |Customer Type|
      |Approve|Buyer        |
    When I close driver
    Given logon "scf_environments_2_tian" on tube by inputting system
    When I authorize on the Onboarding Review page
      |Result |Customer Type|
      |Approve|Buyer        |
    When I click Customers and select Onboarding List
    Then I compare Registration Status on the page
      |Customer Type|
      |Buyer        |
    And I click the email icon to send the email
    When open the email browser page
    And I received an email from Green Union Bank on the email page
    When I receive mail in my mailbox on scf uat env
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
    Given logon "scf_environments_2_tian" on sit tube by inputting system
    When I click Customers and select Onboarding List
    Then I compare Approved Status on the page
      |Result  |Customer Type|
      |Approved|Buyer        |
    When I close driver

    #  买方 绑定关系
  Scenario:Buyer The operator binds a supplier relationship that does not exist between a single system for the buyer's customer, and the binding is successful
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click Customers and select Customers Mapping
    Then I should direct to the Customers Mapping page
    When I click the Create New Buyer Relationship button and Create a New Relationship
    When I click Create New Counter button on the page
    And I should bind a Supplier information in his upstream
    When I close driver

  #    产品设置
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 003
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
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
#    And Enter login information
    When I close driver

  #    上传历史单据
  @UploadHistoricalDocuments
  Scenario:Upload historical documents
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click Operations button
    And I click docs List button
    When I upload Historical Documents
    Then I should see the uploaded historical documents
#
#    #创建信用档案
  Scenario:createSupplierCreditFile
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When login successfully and click the SCF link to createSupplierCreditFile
    And edit Supplier Credit Profile
#    Then submit Supplier Credit Profile
    And to Supplier Credit Profile Review Page
    Then Supplier Credit Profile L1 Review
    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
    And use User L2 to Supplier Review
    When I close driver


    #授信限额
  Scenario:1Supplier The operator initiates the supplier's credit, the whole process is approved, the credit is successful, and the limit and rating are obtained
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
    When I click Supplier Test Data Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    When I should see Supplier Proceed Button and click on the UnderWriting Approval page
    When I update Limit for THIS Product
    When I click Result button on the UnderWriting Approval page
    And I click Approve button and click Submit button on the page
    When I click Completed Button on the UnderWriting Approval page
#    SCF新版本 一次审批就ok
#    Given logon "environments_2" on tube by inputting system
#    When I click UnderWriting and UnderWriting Approval
#    Then I should direct to the UnderWriting Approval page
#    When I click Supplier Test Data Assign to Me button on UnderWriting Approval page
#    When I click Assign to ME title on the on UnderWriting Approval page
#    When I should see Supplier Proceed Button and click on the UnderWriting Approval page
#    When I click Result button on the UnderWriting Approval page
#    And I click Approve button and click Submit button on the page
#    When I the second click Completed Button on the UnderWriting Approval page
#    When I click UnderWriting List button on the page
#    When I close driver

#  #   RPA上传
#  Scenario:SIT_ Supply chain_ Inner tube_ Create RPA_ 00011
#    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
#    When I click on the first Customers
#    And click ContractManagement
#    Then Enter the name of the supplier to filter
#
#  #   融资申请
#  Scenario:financingRequest1
#    Given logon "environments_3" test code
#    When I input login information
#    When login successfully and click RequestFinancing
#    Then upload RequestFinancing File
#    And  logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
#    Then click Operations to Review
##    And change user To L2 Review
#    When logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
#    And click Operations to Review
#    Given logon "environments_3" test code
#    When I input login information
#    And click Financing Status
#    When I close driver
#
##
##   放款
#  Scenario:UAT_ Supply chain_ Inner tube_ Create payments_ 0001
#    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
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
##    全部还款
#  Scenario:UAT_supply chain_inner management_repayment_0001UAT_supply chain_inner management_repayment_0001
#    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
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
#
##   买方 信用档案
#  Scenario:createBuyerCreditFile
#    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
#    When login successfully and click the SCF link to createBuyerCreditFile
#    And edit Buyer Credit Profile
##    Then submit Buyer Credit Profile
#    And  to Buyer Credit Profile Review page
#    Then buyer Credit Profile L1 Review
##    And change user To L2 Review
#    Given logon "netSilverEnv_SCF_SIT2" on sit tube by inputting system
#    And use UserL2 to Review
#    When I close driver
#
#
#
##  买方授信限额
#  Scenario:Buyer The operator initiated Buyer Entity Flow & Buyer Entity Public to grant credit to buyer customers, and the credit was successfully granted, and the limit and rating were obtained
#    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
#    When I click UnderWriting and UnderWriting Approval
#    Then I should direct to the UnderWriting Approval page
#    When I click buyer Test Data Assign to Me button on UnderWriting Approval page
#    When I click Assign to ME title on the on UnderWriting Approval page
#    Then I should see Proceed Button on the UnderWriting Approval page
#    When I update Limit for THIS Product
#    When I click Result button on the UnderWriting Approval page
#    And I click Approve button and click Submit button on the page
#    When I click Completed Button on the UnderWriting Approval page
#
