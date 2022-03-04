@productSettings
Feature: Product Settings test case
  @sun01
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 0001
    Given logon "environments_1" on tube by inputting system
    When I click product
    When I click on Product List
    And click Create Product
    When enter the page information
    Then click Submit to submit a new product
    Then Refresh check whether the data is added successfully


  @sun02
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 002
    Given logon "environments_1" on tube by inputting system
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
    Then I click Submit to submit a new product


  @ClientProfile
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 003
    Given logon "environments_1" on tube by inputting system
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
    Then I click Submit to submit a new product
    When I click product
    When I click ProductProfile
    And click Create ProductProfile
    When enter the second case information supplier and buyer
    Then I click Submit product profile
    When The vendor logs in to the vendor portal to view products
    And Enter login information


