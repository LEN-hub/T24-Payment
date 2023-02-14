@Health_Check_SCF_SIT

Feature: Health Check SCF SIT Test Case

#1.Full account供应商建档全流程
  @health_check_supplier_Fulll_KYC_SIT
  Scenario:Full account the whole process of supplier file creation_SIT
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
#    Then Verify whether the Account page is displayed
#    When Enter the Account information
#      |currency |
#      |SGD      |
#    Then Check whether the Questionnaire page is displayed
#    When Enter information on the Questionnaire page
#      |currency         |num    |
#      |SGD 0 - 10,000   |1 to 20|
#    Then Verify whether the Confirm page is displayed
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

   #2.客户端登录成功
  @health_check_Login_Client_SIT
  Scenario:client login success_SIT
    Given logon "environments_SCF_SIT" test code
    When client login success
    |Email Name|
    |p165662w  |

    #3.创建simple kyc模式建档，建档信息补充中上传文件成功
  @Health_Check_supplier_simple_kyc_buyer_SIT
  Scenario:Create a simple kyc mode for filing, and upload the file successfully in the filing information supplement_SIT
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click Customers and select Onboarding List
    And I click Create Customer and fill in the supplier information in the pop-up window
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

    #4.onboarding页面创建客户，点击发送邀请码邮件，邮件接收成功
  @health_check_Send_Email_SIT
  Scenario:Create a customer on the onboarding page, click to send an invitation code email, and the email is received successfully_SIT
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

  #5.线上签署BR成功后，在E-Sign查看BR文件成功
  @health_check_BR_Signature_SIT
  Scenario:After signing BR online successfully, check the BR file in E-Sign successfully_SIT
    Given Open Supplier Portal URL
    When I input login data and click on the Login Supplier Portal URL
      |pass word   |Company ID|
      |P@ssw0rd_123|1234      |
    When I click Pending Signature button
    And I click confirm Button
    When I close driver
    When I open email URL
    When I login email URL
    When I to sign
    When I close driver
    When I open email URL
    When I login two email URL
    When I close driver


   #6.客户端登录成功
  @health_check_Login_Client_Jump_SIT
  Scenario:client login success,page jump success_SIT
    Given logon "environments_SCF_SIT" test code
    When client login success
      |Email Name|
      |0f36m35j  |
    When click Go to Digibank Link
    Then Check page jump success

#    4登录内管端涉及接口-ISSO
  Scenario: Authentication: The SCF user logs in to the process
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click on the first Customers
#    5上传PRA文件
  Scenario: Signing RPA involves the interface - IMS
    Given logon "netSilverEnv_SCF_SIT1" on sit tube by inputting system
    When I click on the first Customers
    And click ContractManagement
    Then Enter the name of the supplier to filter
    When Upload a file
      |fileAddress                                                            |
      |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|

    # 6 成功进入客户端成功,邮箱成功收到验证码邮件
  @health_check_supplier_Fulll_KYC_SIT
  Scenario:testEmail
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
