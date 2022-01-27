@createSupplierCreditFile
Feature: createSupplierCreditFile

  Scenario:createSupplierCreditFile
    Given logon "environments_1" on tube by inputting system
    When login successfully and click the SCF link to createSupplierCreditFile
    And edit Supplier Credit Profile
    Then submit Supplier Credit Profile
    And to Supplier Credit Profile Review Page
    Then Supplier Credit Profile L1 Review
    And change user To L2 Review
    Then login "environments_2" on tube by inputting system
    And use User L2 to Supplier Review