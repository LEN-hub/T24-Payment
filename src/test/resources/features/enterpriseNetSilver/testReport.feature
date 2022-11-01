@testReport
Feature: e-Statement


  @PaymentUat123
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |DBS          |TSC1643346550706|11010003437           |Business Expenses   |1101 0001 256 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on same Currency Payment

