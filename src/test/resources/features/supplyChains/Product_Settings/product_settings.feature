@productSettings
Feature: Product Settings test case
  @ProductSet
#    产品设置，注意，三个脚本需要用到test/testBuyer/emailData.txt ，邮箱密码需要更新，因为三个需要关联，执行第三个即可
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 0001
    Given logon "environments_001" on tube by inputting system
    When I click product
    When I click on Product List
    And click Create Product
    When enter the page information
    Then click Submit to submit a new product
    Then Refresh check whether the data is added successfully


  @productQuotation
#    产品报价
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 002
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
      |USD       |
    Then I click Submit to submit a new product


  @testReportProductIntroduction
#    产品简介
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
    When The vendor logs in to the vendor portal to view products
    And Enter login information


