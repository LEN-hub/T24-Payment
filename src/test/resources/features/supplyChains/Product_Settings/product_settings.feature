@productSettings
Feature: Product Settings test case

  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 0001
    Given logon "environments_1" on tube by inputting system
    When I click product
    When I click on Product List
    And click Create Product
    Then enter the page information
    Then click Submit to submit a new product


  @sun
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 002
    Given logon "environments_1" on tube by inputting system
    When I click product
    When I click on Product List
    And  click Create Product
    When enter the page information
    Then click Submit to submit a new product
    When I click product
    When I click on Quote List
    And  click Create Quote
    When enter the second case information and select supplier "Syngenta India Limited" on this page
    Then I click Submit to submit a new product


  @ClientProfile
  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 003
    Given logon "environments_1" on tube by inputting system
    When I click product
    When I click on Product List
    And  click Create Product
    When enter the page information
    Then click Submit to submit a new product
    When I click product
    When I click on Quote List
    And  click Create Quote
    When enter the second case information and select supplier "Syngenta India Limited" on this page
    Then I click Submit to submit a new product
    When I click product
    When I click ProductProfile
    And click Create ProductProfile
    When Enter page information and select Client Name "Syngenta India Limited" on this page