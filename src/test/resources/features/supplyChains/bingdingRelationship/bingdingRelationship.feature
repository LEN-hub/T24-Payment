@bingdingRelationship
Feature: test bingdingRelationship


  @textReprotbangding
  Scenario:Supplier The operator binds the supplier to a buyer relationship that does not exist between a single system, and the binding is successful
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Customers Mapping
    Then I should direct to the Customers Mapping page
    When I click the Create New Supplier Relationship button and Create a New Relationship
    When I click Create New Counter button on the page
    And I should bind a buyer information in his downstream


  @text
  Scenario:Buyer The operator binds a supplier relationship that does not exist between a single system for the buyer's customer, and the binding is successful
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Customers Mapping
    Then I should direct to the Customers Mapping page
    When I click the Create New Buyer Relationship button and Create a New Relationship
    When I click Create New Counter button on the page
    And I should bind a Supplier information in his upstream

