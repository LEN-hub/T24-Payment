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





@test
  Scenario:UAT_supply chain_inner management_repayment_0001UAT_supply chain_inner management_repayment_0001
    Given logon "environments_1" on tube by inputting system
    When I click Operations button
    When I click Repayment button
    Then I should direct to the Repayment Management page
    When I click the Assign to me button of the repayment data
    When I click Assign to ME title on the on Repayment Management page
    When I click Proceed Button on the Repayment Management Page
    Then I should direct to the Repayment Detail page
    When I select Repayment Account No on the page
    And I enter other parameters in the current page

