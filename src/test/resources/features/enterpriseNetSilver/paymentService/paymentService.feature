@paymentService
Feature: receipt and payment service

  #SDG->HKD
  Scenario:I have successfully transferred from one currency to another (Singapore dollar to Hong Kong dollar)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003704   |11010003836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->USD
  Scenario:I have successfully transferred from Singapore currency to US dollar
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
    |rollOutAccount|intoAccount|amount|
    |11010003704   |11010003828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->EUR
  Scenario:I have successfully transferred from Singapore currency to Euro
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003704   |11010003844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->SDG
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003704   |11010003526|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #CNY->CNY
  Scenario:Oneself mutual turn with currency mutual turn (CNY) trade flow
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003712   |11010003801|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #USD->USD
  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003720   |11010003828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->EUR
  Scenario:I mutual transfer with currency mutual transfer (euro) transaction process
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003747   |11010003844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #HKD->HKD
  Scenario:I mutual transfer with currency mutual transfer (HKD) transaction process
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount|intoAccount|amount|
      |11010003739   |11010003836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

#境内转账-行内转账时间选择每周一
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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
  @ext
#时间选择每月
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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


    #境内转账-跨行转账时间选择每周一
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
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


    #境外转账
  @overseasTransfer
  Scenario:Positive process of overseas transfer(SGD--USD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |SGD          |50         |
    And I choose the payment currency
      |selectAccBth|
      |USD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense         |selectPaymentAttributeCd|
      |所有费用由汇款人承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now


  @overseasTransfer01
  Scenario:Positive process of overseas transfer(USD--SGD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |USD          |60         |
    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
       |expense   |selectPaymentAttributeCd|
       |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now


  @overseasTransfer02
  Scenario:Positive process of overseas transfer(CNY--SGD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |CNY          |50         |
    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now

  @overseasTransfer03
  Scenario:Positive process of overseas transfer(EUR--SGD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |EUR          |50         |
    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now

  @overseasTransfer04
  Scenario:Positive process of overseas transfer(HKD--SGD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |HKD          |50         |
    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now

  @overseasTransfer05
  Scenario:Positive process of overseas transfer(SGD--SGD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |SGD          |50         |
    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now


#
  @overseasTransfer06
  Scenario:Positive process of overseas transfer(CNY--CNY)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |CNY          |50         |
    And I choose the payment currency
      |selectAccBth|
      |CNY         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
  @overseasTransfer07
  Scenario:Positive process of overseas transfer(EUR--EUR)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |EUR          |50         |
    And I choose the payment currency
      |selectAccBth|
      |EUR         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
  @overseasTransfer08
  Scenario:Positive process of overseas transfer(HKD--HKD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |HKD          |50         |
    And I choose the payment currency
      |selectAccBth|
      |HKD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#
  @overseasTransfer09
  Scenario:Positive process of overseas transfer(USD--USD)
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I choose the payment account payment currency and payment amount
      |selectAccount|payeeCurrency|enterAmount|
      |11020006552  |USD          |50         |
    And I choose the payment currency
      |selectAccBth|
      |USD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the party to bear the expenses and the nature of payment
      |expense   |selectPaymentAttributeCd|
      |费用各自承担|Commission              |
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given logon second "Level2AuthorizedAccount" on enterprise net silver
    When I click My Tasks button on the logon page
    Then I should direct to the Awaiting authorization page
    When I click on the first piece of data to authorize
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now