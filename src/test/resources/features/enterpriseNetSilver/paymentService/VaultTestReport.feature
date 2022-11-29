@paymentService_AccountManager
Feature: receipt and payment service

  @LocalPaymentTestSGDToSGD
    #境内转账-行内转账单币种不授权(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank                     |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |GREEN LINK DIGITAL BANK PTE LTD  |TSC1643346550706|11010002414           |Business Expenses   |1101 0000 438 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    Then I will compare all the data on same Currency Payment
      |WordPath                   |
      |Local Fund Payment SGD-SGD |