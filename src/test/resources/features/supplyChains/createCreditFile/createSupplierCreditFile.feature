@createSupplierCreditFile
Feature: createSupplierCreditFile

  Scenario:createSupplierCreditFile
    Given logon "environments_1" on tube by inputting system
    When login successfully and click the SCF link to createSupplierCreditFile
    And edit Supplier Credit Profile
    Then submit Supplier Credit Profile
    And to Supplier Credit Profile Review Page