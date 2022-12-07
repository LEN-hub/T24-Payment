@allReport
Feature: allReport

  @MCY05
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank                      |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |GREEN LINK DIGITAL BANK PTE LTD   |TSC1643346550706|11010001426           |Business Expenses   |1102 0004 223 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on same Currency Payment
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

