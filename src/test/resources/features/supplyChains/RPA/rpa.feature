@rpaUpload
Feature:Bundled RPA test case
#此脚本需要用到test/emailData.txt，邮箱密码需要注意更新
  @testReportRPA
  Scenario:UAT_ Supply chain_ Inner tube_ Create RPA_ 0001
    Given logon "environments_001" on tube by inputting system
    When I click on the first Customers
    And click ContractManagement
    Then Enter the name of the supplier to filter
    When Upload a file
    Then Jump to the supplier portal to check the RPA

    @test
  Scenario:After the download is successful, you can view the document statement
    Given logon "environments_3" test code
    When I enter login information
    When I click report button


    @setting
    Scenario:When the supplier administrator creates a new user, the new user is a non-Internet banking user. The user receives an email and successfully logs in to the supplier portal according to the email prompt.
      Given logon "environments_3" test code
      When I input login information
      When I click create user button
      |first_new_password|second_new_password|
      |P@ssw0rd_123      |P@ssw0rd_123       |
      Then I jump to the login page
