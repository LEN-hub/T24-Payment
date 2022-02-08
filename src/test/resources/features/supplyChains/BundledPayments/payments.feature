@payments
Feature:Bundled payments test case

  Scenario:UAT_ Supply chain_ Inner tube_ Create payments_ 0001
    Given logon "environments_1" on tube by inputting system
    When When I hit Operations
    And click Request for Disbursement
    When I click on Assign To Me
    Then I click Submit
    When I click on Review Disbursement
    And  click proceed
    Then Click on the submit APPROVE
    When Confirm Disbursement page