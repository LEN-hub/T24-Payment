@paymentService
Feature: receipt and payment service

  #SDG->HKD
  Scenario:I have successfully transferred from one currency to another (Singapore dollar to Hong Kong dollar)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003704   |11010003836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->USD
  Scenario:I have successfully transferred from Singapore currency to US dollar
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
    |rollOutAccount|intoAccount|amount|
    |11010003704   |11010003828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->EUR
  Scenario:I have successfully transferred from Singapore currency to Euro
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003704   |11010003844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->SDG
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003704   |11010003526|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #CNY->CNY
  Scenario:Oneself mutual turn with currency mutual turn (CNY) trade flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003712   |11010003801|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #USD->USD
  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003720   |11010003828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->EUR
  Scenario:I mutual transfer with currency mutual transfer (euro) transaction process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003747   |11010003844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #HKD->HKD
  Scenario:I mutual transfer with currency mutual transfer (HKD) transaction process
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003739   |11010003836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

#境外转账-行内转账时间选择每周一
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
    |account name    |receiving account|transfer amount  |transfer purpose |
    |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    |account name    |receiving account|transfer amount  |transfer purpose |
    |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|

#时间选择每周
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I select date on the domestic transfer bank page
      |selectDate|
      |Weekly    |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
  Then I jump to the successful transfer page
  Then I check the details on the transfer success details page
    |account name    |receiving account|transfer amount  |transfer purpose |
    |TSC1643346550706|11010003437      |0.10             |Business Expenses|

#时间选择每月
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Monthly   |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|


#选择每季度并且不写周期
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|


    #境外转账-跨行转账时间选择每周一
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|

#时间选择每周
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I select date on the domestic transfer bank page
      |selectDate|
      |Weekly    |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|

#时间选择每月
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Monthly   |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
