@allReport
Feature: allReport

#  #PayNow签约
#  @Paynow01
#  Scenario:PayNow Signing Process
#    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    When I execute manage PayNow Profile transaction on the page
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    When I signed on the page successfully
#    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
#    When Click My Task to find data for authorization
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
#  #PayNow解约
#  @Paynow02
#  Scenario:PayNow Signing Off
#    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    When I sign and cancel the transaction on the page
#
#  #PayNow修改
#  @Paynow03
#  Scenario:PayNow Signing Modify
#    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    When I carry out the signing and modification process on the page
#      |AccountNum    |
#      |1101 0002 449|
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    When I signed on the page successfully
#
#  @MCY03
#   #SGD->SGD
#  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process(MCY)
#    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account    |To Account   |currency|
#      |1102 0571 063   |1101 0001 426|SGD     |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#      |WordPath   |
#      |SGD-SGD MCY|
#
#  @PaymentUat05
#    #境内转账-跨行转账时间选择每周一(SGD->SGD)
#  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
#    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |Payee's Bank           |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
#      |BANK OF CHINA LIMITED  |TSC1643346550706|11010001426           |Business Expenses   |1101 0001 256 |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I will compare all the data on same Currency Payment
#      |WordPath                   |
#      |Local Fund Payment SGD-SGD |
#
#  @MCY05
#    #境内转账-行内转账时间选择每周一(SGD->SGD)
#  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)(MCY)
#    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |Payee's Bank                     |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
#      |GREEN LINK DIGITAL BANK PTE LTD  |TSC1643346550706|11010001426           |Business Expenses   |1101 0001 256 |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I will compare all the data on same Currency Payment
#      |WordPath                 |
#      |Local Payment SGD-SGD MCY|

    #境外转账
  @MCY06
  Scenario:Positive process of overseas transfer Bic Is DBS(USD--USD)(MCY)
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency   |
      |USD        |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0VEC     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment MX Message
      |WordPath              |
      |Bic is DBS USD-USD MCY|