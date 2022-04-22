@financingRequest
Feature: financingRequest

  Scenario:financingRequest1
    Given login "environments_3" To RequestFinancing
    When login successfully and click RequestFinancing
    Then upload RequestFinancing File
    And  logon "environments_1" on tube by inputting system
    Then click Operations to Review
    And change user To L2 Review
    Then login "environments_2" on tube by inputting system
    And click Operations to Review
    Then login "environments_3" To RequestFinancing
    And click Financing Status

    @test1
    Scenario:A supplier initiates a financing request on the supplier portal, which will occupy the corresponding quota of the supplier and buyer
      Given login "environments_3" To RequestFinancing
      When login successfully and click RequestFinancing
      Then upload RequestFinancing File
      Given logon "environments_1" on tube by inputting system
      When I click more button
      When I should see Quota occupancy




