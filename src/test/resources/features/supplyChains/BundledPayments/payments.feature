@payments
Feature:Bundled payments test case
  @lending
   #此脚本需要用到test.txt
  Scenario:UAT_ Supply chain_ Inner tube_ Create payments_ 0001
    Given logon "environments_001" on tube by inputting system
    When When I hit Operations
    And click Request for Disbursement
    When I click on Assign To Me
    Then I click Submit
    When I click on Review Disbursement
    And  click proceed
    Then Click on the submit APPROVE
    When Confirm Disbursement page
#放款。


  # 捆绑支付。
  Scenario: During the loan, select temporary payment, and the repayment is completed.
    Given logon "environments_1" on tube by inputting system
#    When I click Operations button
#    When I click Repayment button
#    Then I should direct to the Repayment Management page
#    When I click Assign to ME title on the on Repayment Management page
#    When I click Proceed Button on the Repayment Management Page
#    Then I should direct to the Repayment Detail page
#    When I select Repayment Account No on the page
#    And I enter other parameters in the current page
    When I click Operations button
    When click Request for Disbursement
    When I click on Assign To Me
    When I input Adjustment Amout
    Then I click Submit


      # 捆绑支付的多还款
  Scenario: During the loan, select temporary payment, and the repayment is completed.
    Given logon "environments_1" on tube by inputting system
    When I click Operations button
    When I click Repayment button
    Then I should direct to the Repayment Management page
    When I click Assign to ME title on the on Repayment Management page
    When I click Proceed Button on the Repayment Management Page
    Then I should direct to the Repayment Detail page
    When I select Repayment Account No on the page
    And I enter other parameters in the current pageThree
    When I click Operations button
    When click Request for Disbursement
    When I click on Assign To Me
    When I input Adjustment Amout
    Then I click Submit

  @reimbursement
  Scenario:UAT_supply chain_inner management_repayment_0001UAT_supply chain_inner management_repayment_0001
    Given logon "environments_1" on tube by inputting system
    When I click Operations button
    When I click Repayment button
    Then I should direct to the Repayment Management page
#    When I click the Assign to me button of the repayment data
    When I click Assign to ME title on the on Repayment Management page
    When I click Proceed Button on the Repayment Management Page
    Then I should direct to the Repayment Detail page
    When I select Repayment Account No on the page
    And I enter other parameters in the current page

#还款。


#  等额还款。
  @equalRepayment
  Scenario:Due account balance is sufficient, overpayment, resulting in a difference in payment
    Given logon "environments_1" on tube by inputting system
    When I click Operations button
    When I click Repayment button
    Then I should direct to the Repayment Management page
#    When I click the Assign to me button of the repayment data
    When I click Assign to ME title on the on Repayment Management page
    When I click Proceed Button on the Repayment Management Page
    Then I should direct to the Repayment Detail page
    When I select Repayment Account No on the page
    And I enter other parameters in the current pageTwo
    When I click more button
    And I should see Quota occupancy


    #多还款
  @overpayment
  Scenario:Due account balance is sufficient, overpayment, resulting in a difference in payment
    Given logon "environments_1" on tube by inputting system
    When I click Operations button
    When I click Repayment button
    Then I should direct to the Repayment Management page
#    When I click the Assign to me button of the repayment data
    When I click Assign to ME title on the on Repayment Management page
    When I click Proceed Button on the Repayment Management Page
    Then I should direct to the Repayment Detail page
    When I select Repayment Account No on the page
    And I enter other parameters in the current pageThree
    When I click more button
    And I should see Quota occupancy


  #部分还款
  @partialRepayment
  Scenario:Due account balance is sufficient, overpayment, resulting in a difference in partial repayment
    Given logon "environments_1" on tube by inputting system
    When I click Operations button
    When I click ParRepayMent button
    Then I should dirent to the ParRePayMent page
    When I click Assign to ME title on the on ParRePayMent Management page
    When I click Proceed Button on the ParRepayment Management Page
    Then I should direct to the ParRepayment Detail page
    When I select Repayment Account No on the page
    And I enter other parRemeters in the current pageThree
    When I click more button
    And I should see Quota occupancy