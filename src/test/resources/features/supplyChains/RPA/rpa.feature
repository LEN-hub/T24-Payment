@rpaUpload
Feature:Bundled RPA test case
#此脚本需要用到test/emailData.txt
  Scenario:UAT_ Supply chain_ Inner tube_ Create RPA_ 0001
    Given logon "environments_001" on tube by inputting system
    When I click on the first Customers
    And click ContractManagement
    Then Enter the name of the supplier to filter
    When Upload a file
    Then Jump to the supplier portal to check the RPA



