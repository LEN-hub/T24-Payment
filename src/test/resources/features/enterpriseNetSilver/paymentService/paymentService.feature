@paymentService
Feature: receipt and payment service

  #SDG->HKD
  Scenario:I have successfully transferred from one currency to another (Singapore dollar to Hong Kong dollar)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 704   |1101 0003 836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->USD
  Scenario:I have successfully transferred from Singapore currency to US dollar
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
    |rollOutAccount  |intoAccount  |amount|
    |1101 0003 704   |1101 0003 828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->EUR
  Scenario:I have successfully transferred from Singapore currency to Euro
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 704   |1101 0003 844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->SDG
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 704   |1101 0003 526|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #CNY->CNY
  Scenario:Oneself mutual turn with currency mutual turn (CNY) trade flow
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 712   |1101 0003 801|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #USD->USD
  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 720   |1101 0003 828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->EUR
  Scenario:I mutual transfer with currency mutual transfer (euro) transaction process
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 747   |1101 0003 844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #HKD->HKD
  Scenario:I mutual transfer with currency mutual transfer (HKD) transaction process
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 739   |1101 0003 836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #SDG->CNY
  Scenario:I mutual transfer not the same currency mutual transfer (Singapore dollar to RMB) transfer transaction successfully
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 704   |1101 0003 712|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully


 #HKD->SDG
  Scenario:I have successfully changed Hong Kong dollars into Singapore dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 739   |1101 0003 704|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #HKD->EUR
  Scenario:I have successfully exchanged Hong Kong dollars for euros
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 739   |1101 0003 844|1     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #HKD->USD
  Scenario:I have changed Hong Kong dollars into US dollars successfully
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 739   |1101 0003 828|1     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #HKD->CNY
  Scenario:I have changed Hong Kong dollars into CNY successfully
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 739   |1101 0003 801|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #USD->CNY
  Scenario:I have successfully changed dollars into CNY
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 720   |1101 0003 801|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

 #USD->EUR
  Scenario:I have succeeded in exchanging dollars for euros
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 720   |1101 0003 844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

 #USD->SDG
  Scenario:I have successfully changed us dollars into Singapore dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 720   |1101 0003 526|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

 #USD->HKD
  Scenario:I have successfully changed us dollars into Hong Kong dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 720   |1101 0003 836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->CNY
  Scenario:I have successfully converted Euro dollars into CNY
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 747   |1101 0003 801|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->HKD
  Scenario:I have successfully changed Euro dollars into Hong Kong dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 747   |1101 0003 836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->SDG
  Scenario:I have successfully changed Euro dollars into Singapore dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 747   |1101 0003 526|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #EUR->USD
  Scenario:I have successfully exchanged euro dollars for US dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 747   |1101 0003 828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

   #CNY->HKD
  Scenario:I have changed RMB into Hong Kong dollars successfully
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 712   |1101 0003 836|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #CNY->USD
  Scenario:I have successfully changed RMB into US dollars
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 712   |1101 0003 828|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #CNY->SDG
  Scenario:I have successfully changed RMB into Singapore currency
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 712   |1101 0003 526|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  #CNY->EUR
  Scenario:I have successfully changed CNY into euros
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |rollOutAccount  |intoAccount  |amount|
      |1101 0003 712   |1101 0003 844|0.1   |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

#境内转账-行内转账时间选择每周一(SDG->SDG)
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

#时间选择每周(SDG->SDG)
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

#时间选择每月(SDG->SDG)
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


    #选择每季度并且不写周期(SDG->SDG)
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

    #境内转账-行内转账时间选择每周一(SDG->CNY)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|

    #时间选择每周(SDG->CNY)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
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
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|

#时间选择每月(SDG->CNY)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
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
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|

    #选择每季度并且不写周期(SDG->CNY)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|


    #境内转账-行内转账时间选择每周一(SDG->USD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|

    #时间选择每周(SDG->USD)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
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
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|

#时间选择每月(SDG->USD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
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
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|


  #选择每季度并且不写周期(SDG->USD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|

    #境内转账-行内转账时间选择每周一(SDG->EUR)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|

    #时间选择每周(SDG->EUR)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
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
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|

#时间选择每月(SDG->EUR)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
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
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|


  #选择每季度并且不写周期(SDG->EUR)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|


    #境内转账-行内转账时间选择每周一(SDG->HKD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|

    #时间选择每周(SDG->HKD)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
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
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|

#时间选择每月(SDG->HKD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
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
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|


  #选择每季度并且不写周期(SDG->HKD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|


    #境内转账-跨行转账时间选择每周一(SDG->SDG)
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

#时间选择每周(SDG->SDG)
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

#时间选择每月(SDG->SDG)
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


    #时间选择每季度(SDG->SDG)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
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

   #境内转账-跨行转账时间选择每周一(SDG->CNY)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|

#时间选择每周(SDG->CNY)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
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
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|

#时间选择每月(SDG->CNY)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
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
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|


    #时间选择每季度(SDG->CNY)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356258424|11010003712      |0.10             |Business Expenses|

  #境内转账-跨行转账时间选择每周一(SDG->USD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|

#时间选择每周(SDG->USD)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
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
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|

#时间选择每月(SDG->USD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
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
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|


    #时间选择每季度(SDG->USD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC1643356259982|11010003720      |0.10             |Business Expenses|

   #境内转账-跨行转账时间选择每周一(SDG->EUR)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|

#时间选择每周(SDG->EUR)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
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
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|

#时间选择每月(SDG->EUR)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
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
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|


    #时间选择每季度(SDG->EUR)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335629908 |11010003747      |0.10             |Business Expenses|


 #境内转账-跨行转账时间选择每周一(SDG->HKD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|


#时间选择每周(SDG->HKD)
  Scenario:Positive process of intra-bank transfer in Singapore Currency (OTP verification, no authorization, core processing, monthly cycle transfer)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
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
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|


#时间选择每月(SDG->HKD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
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
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|


    #时间选择每季度(SDG->HKD)
  Scenario:Positive process of intra-bank transfer from New currency to new currency (OTP verification, authorization)
    Given Closing the Browser driver
    When logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of overseas domestic transfer bank
      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |
      |Green Link Digital Bank Pte. Ltd|TSC164335621223 |11010003739      |0.1              |Business Expenses|
    When I selected the date on the domestic transfer bank page not after twenty-nine
      |selectDate|
      |Quarterly |
    When I choose Periods to fill in the information for the in-country transfer
      |periods|
      |1      |
    When I click next button on the domestic transfer bank page
    When If the transfer failure window pops up I will click the continue button
    Then I verify the information on the next page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
    When I click Next to go to the verification page
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I check the details on the transfer success details page
      |account name    |receiving account|transfer amount  |transfer purpose |
      |TSC164335621223 |11010003739      |0.10             |Business Expenses|

    #境外转账
  @overseasTransfer
  Scenario:Positive process of overseas transfer(SGD--USD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense         |expenseEnglish                             |
      |1102 0006 552|SGD          |50         |所有费用由汇款人承担|All expenses shall be borne by the remitter|
    And I choose the payment currency
      |selectAccBth|
      |USD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I checked the details on the successful overseas transfer details page
      |selectAccount|sendPaymentAccount|
      |11020006552  |11020009098       |



  @overseasTransfer01
  Scenario:Positive process of overseas transfer(USD--SGD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense   |expenseEnglish                           |
      |1102 0006 552|SGD          |60         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |110200083204      |luckys   |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I checked the details on the successful overseas transfer details page
      |selectAccount|sendPaymentAccount|
      |11020006552  |110200083204       |


  @overseasTransfer02
  Scenario:Positive process of overseas transfer(CNY--SGD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|CNY          |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  @overseasTransfer03
  Scenario:Positive process of overseas transfer(EUR--SGD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|EUR          |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

  @overseasTransfer04
  Scenario:Positive process of overseas transfer(HKD--SGD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|HKD          |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now



  @overseasTransfer05
  Scenario:Positive process of overseas transfer(SGD--SGD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|SGD         |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now



#
  @overseasTransfer06
  Scenario:Positive process of overseas transfer(CNY--CNY)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|CNY          |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |CNY         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  @overseasTransfer07
  Scenario:Positive process of overseas transfer(EUR--EUR)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|EUR         |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |EUR         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now

  @overseasTransfer08
  Scenario:Positive process of overseas transfer(HKD--HKD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense  |expenseEnglish                           |
      |1102 0006 552|HKD          |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |HKD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now

#
  @overseasTransfer09
  Scenario:Positive process of overseas transfer(USD--USD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense   |expenseEnglish                          |
      |1102 0006 552|USD          |50         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |USD        |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |11020009098       |luckys |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I checked the details on the successful overseas transfer details page
      |selectAccount|sendPaymentAccount|
      |11020006552  |11020009098       |


  @overseasTransfer10
#    保存模板
  Scenario:Positive process of overseas transfer(SGD--USD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense         |expenseEnglish                             |
      |1102 0006 552|USD          |50         |所有费用由汇款人承担|All expenses shall be borne by the remitter|
    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |110200083204       |lucky    |CITIBANK USA  |countries|UNITED STATES |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Commission              |
    When I click save content to template
      |templateName|collectingBank      |
      |SGD-USD     |BILL BANK LUXEMBOURG|
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I checked the details on the successful overseas transfer details page
      |selectAccount|sendPaymentAccount|
      |11020006552  |110200083204       |

  @overseasTransfer11
#    贸易融资
  Scenario:Positive process of overseas transfer(USD--SGD)
    Given Closing the Browser driver
    When logon "netSilverEnv_sun" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |selectAccount|payeeCurrency|enterAmount|expense   |expenseEnglish                           |
      |1102 0006 552|SGD          |60         |费用各自承担|The expenses shall be borne by each party|

    And I choose the payment currency
      |selectAccBth|
      |SGD         |
    When I enter the payee information
      |sendPaymentAccount|namePayee|collectingBank|payeeAdd |payeeCountries|remittancePostscriptContent|
      |110200083204      |luckys   |CITIBANK USA  |countries|CHINA         |ok                         |
    When I choose the nature of payment
      |selectPaymentAttributeCd|
      |Trade Services          |
    When I chose trade finance, the transportation route chose nautical
      |transportMethod|shipNm|shipNo|shipmentAddR|trafficAddR|goodInvolved|
      |航海            |lucky |001   |china       |china      |ok          |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I checked the details on the successful overseas transfer details page
      |selectAccount|sendPaymentAccount|
      |11020006552  |110200083204      |