@paymentService
Feature: receipt and payment service

  Background:
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
  @paymentService01
#本人互转
   #USD->SGD
  Scenario:I have successfully changed us dollars into Singapore dollars
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0001 434   |1101 0001 256|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully


  @paymentService02
  #SGD->USD
  Scenario:I have successfully transferred from Singapore currency to US dollar
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0001 256   |1101 0001 434|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

@paymentService03
      #SGD->SGD
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0001 256   |1101 0001 426|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully


  @paymentService04
    #USD->USD
  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0001 434   |1101 0001 442|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

@paymentService05
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |BANK OF CHINA LIMITED  |TSC1643346550706|11010001426           |Business Expenses   |1101 0000 179 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I will compare all the data on same Currency Payment

@paymentService06
        #境内转账-行内转账时间选择每周一(SGD->USD)
  Scenario:Transfer time within the line is selected every Monday(SGD->USD)
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |BANK OF CHINA LIMITED  |TSC1643346550706|11010001426           |Business Expenses   |1101 0001 256 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I will compare all the data on same Currency Payment

  @paymentService06
      #境内转账-跨行转账时间选择每周一(SGD->SGD)
  Scenario:In-line transfer with in the line is selected every Monday(SGD->SGD)
    When I fill in the transfer information of overseas domestic transfer bank
      |Payee's Bank |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |DBS          |TSC1643346550706|11010003437           |Business Expenses   |1101 0001 256 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I will compare all the data on same Currency Payment

    @paymentService07
      #境内转账-跨行转账时间选择每周一(SGD->USD)
  Scenario:In-line transfer time within the line is selected every Monday(SGD->USD)
    When I fill in the transfer information of overseas domestic transfer bank
      |Payee's Bank |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |UOB          |TSC1643356259982|11010003720           |Business Expenses   |1101 0001 256 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I jump to the successful transfer page
    Then I will compare all the data on same Currency Payment


#境外转账
  @overseasTransfer09
  Scenario:Positive process of overseas transfer(USD--USD)
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0001 434 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency   |
      |USD        |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBS SINGAPORE   |
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

      #境外转账
  @overseasTransfer10
  Scenario:Positive process of overseas transfer(SGD--USD)
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0001 256 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBS SINGAPORE   |
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
    Then I will compare all the data on FX Payment


  @overseasTransfer11
  Scenario:Positive process of overseas transfer(USD--SGD)
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0001 434 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBS SINGAPORE   |
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
    Then I will compare all the data on FX Payment

  @overseasTransfer12
  Scenario:Positive process of overseas transfer(SGD--SGD)
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0001 434 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBS SINGAPORE   |
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

  #多币种
  @MCY01
#本人互转
   #USD->SGD
  Scenario:I have successfully changed us dollars into Singapore dollars-MCY
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 256|USD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in Own FX Payment
    When I compare the amount is normal To Local Payment
    When I compare the data generated by Outgoing Message is correct On Local Payment
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|


  @MCY02
  #SGD->USD
  Scenario:I have successfully transferred from Singapore currency to US dollar-MCY
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 434|SGD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in Own FX Payment
    When I compare the amount is normal To Local Payment
    When I compare the data generated by Outgoing Message is correct On Local Payment
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|


  @MCY03
      #SGD->SGD
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process-MCY
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 426|SGD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|
      |FUNDS.TRANSFER|
    Then I will map the page data



  @MCY04
    #USD->USD
  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow-MCY
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 442|USD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|
      |FUNDS.TRANSFER|
    Then I will map the page data

  @MCY05
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (MCY)_MCY
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |BANK OF CHINA LIMITED  |TSC1643346550706|11010001426           |Business Expenses   |1102 0571 063 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on same Currency Payment
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct

      #境外转账
  @MCY06
  Scenario:Positive process of overseas transfer Bic Is DBS(USD--USD)_MCY
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
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct

      #境外转账
  @MCY07
  Scenario:Positive process of overseas transfer Bic Is DBS(SGD--USD)_MCY
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |USD     |
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
    Then I will compare all the data on FX Payment
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment
    When I compare the amount is normal
    When I compare the data generated by Outgoing Message is correct
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|


  @MCY08
  Scenario:Positive process of overseas transfer Bic Is DBS(USD--SGD)_MCY
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
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
    Then I will compare all the data on FX Payment Different Currency MX Message
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
    When I compare the amount is normal for Different Currency
    When I compare the data generated by Outgoing Message is correct for Different Currency
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|

  @MCY09
  Scenario:Positive process of overseas transfer Bic Is DBS(SGD--SGD)_MCY
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
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
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct

       #境外转账
  @MCY10
  Scenario:Positive process of overseas transfer Bic Is Bank of China(USD--USD)_MCY
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
      |BKCHSGS0CUS     |
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
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct
      #境外转账
  @MCY11
  Scenario:Positive process of overseas transfer Bic Is Bank of China(SGD--USD)_MCY
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
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
    Then I will compare all the data on FX Payment
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment
    When I compare the amount is normal
    When I compare the data generated by Outgoing Message is correct
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|


  @MCY12
  Scenario:Positive process of overseas transfer Bic Is Bank of China(USD--SGD)_MCY
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
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
    Then I will compare all the data on FX Payment Different Currency MX Message
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
    When I compare the amount is normal for Different Currency
    When I compare the data generated by Outgoing Message is correct for Different Currency
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|

  @MCY13
  Scenario:Positive process of overseas transfer Bic Is Bank of China(SGD--SGD)_MCY
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
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
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct


#@test00021
#  #SGD->HKD
#  Scenario:I have successfully transferred from one currency to another (Singapore dollar to Hong Kong dollar)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0001 256   |1101 0000 055|10.0   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully


#  #SGD->EUR
#  Scenario:I have successfully transferred from Singapore currency to Euro
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0001 256   |1101 0000 063|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully



#  #CNY->CNY
#  Scenario:Oneself mutual turn with currency mutual turn (CNY) trade flow
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 039   |1101 0000 195|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully

#  #EUR->EUR
#  Scenario:I mutual transfer with currency mutual transfer (euro) transaction process
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |    |1101 0000 063|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #HKD->HKD
#  Scenario:I mutual transfer with currency mutual transfer (HKD) transaction process
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 209   |1101 0000 055|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #SGD->CNY
#  Scenario:I mutual transfer not the same currency mutual transfer (Singapore dollar to RMB) transfer transaction successfully
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0001 256   |1101 0000 039|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#
# #HKD->SGD
#  Scenario:I have successfully changed Hong Kong dollars into Singapore dollars
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 209   |1101 0001 256|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #HKD->EUR
#  Scenario:I have successfully exchanged Hong Kong dollars for euros
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount   |
#      |1101 0000 209   |1101 0000 063|10.1     |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #HKD->USD
#  Scenario:I have changed Hong Kong dollars into US dollars successfully
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount   |
#      |1101 0000 209   |1101 0001 434|10.1     |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #HKD->CNY
#  Scenario:I have changed Hong Kong dollars into CNY successfully
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 209   |1101 0000 195|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #USD->CNY
#  Scenario:I have successfully changed dollars into CNY
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 047   |1101 0000 195|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
# #USD->EUR
#  Scenario:I have succeeded in exchanging dollars for euros
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 047   |1101 0000 063|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully

# #USD->HKD
#  Scenario:I have successfully changed us dollars into Hong Kong dollars
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 047   |1101 0000 055|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#  @paymentService123
#  #EUR->CNY
#  Scenario:I have successfully converted Euro dollars into CNY
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount |
#      |1101 0000 217   |1101 0000 195|10.1   |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #EUR->HKD
#  Scenario:I have successfully changed Euro dollars into Hong Kong dollars
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 217   |1101 0000 055|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #EUR->SGD
#  Scenario:I have successfully changed Euro dollars into Singapore dollars
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 217   |1101 0000 322|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #EUR->USD
#  Scenario:I have successfully exchanged euro dollars for US dollars
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 217   |1101 0001 434|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#   #CNY->HKD
#  Scenario:I have changed RMB into Hong Kong dollars successfully
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 039   |1101 0000 055|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #CNY->USD
#  Scenario:I have successfully changed RMB into US dollars
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 039   |1101 0001 434|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #CNY->SGD
#  Scenario:I have successfully changed RMB into Singapore currency
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 039   |1101 0000 322|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully
#
#  #CNY->EUR
#  Scenario:I have successfully changed CNY into euros
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I will complete the inter-bank transfer on the page
#      |From Account  |To Account  |amount|
#      |1101 0000 039   |1101 0000 063|10.1  |
#    Then I check to see if the page jumps
#    When I verify the page information and click the Next button
#    Then My account has been transferred successfully


##时间选择每周(SGD->SGD)
#  Scenario:Intra-line transfer time is selected weekly (SGD->SGD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#
##时间选择每月(SGD->SGD)
#  Scenario:Intra-line transfer time per month (SGD->SGD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#
#
    #选择每季度并且不写周期(SGD->SGD)
  Scenario:In-line transfer time is selected quarterly (SGD->SGD)
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
    When I select date on the domestic transfer bank page
      |trasferOutDate|selectDate   |
      |2025-01-01    |Quarterly    |
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

#    #境内转账-行内转账时间选择每周一(SGD->CNY)
#  Scenario:Transfer time within the line is selected every Monday(SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
#    #时间选择每周(SGD->CNY)
#  Scenario:Intra-line transfer time is selected weekly (SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
##时间选择每月(SGD->CNY)
#  Scenario:Intra-line transfer time per month (SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
#    #选择每季度并且不写周期(SGD->CNY)
#  Scenario:In-line transfer time is selected quarterly (SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
#


#    #时间选择每周(SGD->USD)
#  Scenario:Intra-line transfer time is selected weekly (SGD->USD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#
##时间选择每月(SGD->USD)
#  Scenario:Intra-line transfer time per month (SGD->USD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#
#
#  #选择每季度并且不写周期(SGD->USD)
#  Scenario:In-line transfer time is selected quarterly (SGD->USD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#
#    #境内转账-行内转账时间选择每周一(SGD->EUR)
#  Scenario:Transfer time within the line is selected every Monday(SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
#    #时间选择每周(SGD->EUR)
#  Scenario:Intra-line transfer time is selected weekly (SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
##时间选择每月(SGD->EUR)
#  Scenario:Intra-line transfer time per month (SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
#
#  #选择每季度并且不写周期(SGD->EUR)
#  Scenario:In-line transfer time is selected quarterly (SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
#
#    #境内转账-行内转账时间选择每周一(SGD->HKD)
#  Scenario:Transfer time within the line is selected every Monday(SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
#    #时间选择每周(SGD->HKD)
#  Scenario:Intra-line transfer time is selected weekly (SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
##时间选择每月(SGD->HKD)
#  Scenario:Intra-line transfer time per month (SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
#
#  #选择每季度并且不写周期(SGD->HKD)
#  Scenario:In-line transfer time is selected quarterly (SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
#

#境内跨行
##时间选择每周(SGD->SGD)
#  Scenario:Inter-bank transfer time is selected every week(SGD->SGD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#
##时间选择每月(SGD->SGD)
#  Scenario:Inter-bank transfer time per month (SGD->SGD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#
#
#    #时间选择每季度(SGD->SGD)
#  Scenario:Inter-bank transfer time is selected quarterly(SGD->SGD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#    |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#    |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643346550706|11010003437      |0.10             |Business Expenses|
#
#   #境内转账-跨行转账时间选择每周一(SGD->CNY)
#  Scenario:In-line transfer time within the line is selected every Monday(SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
##时间选择每周(SGD->CNY)
#  Scenario:Inter-bank transfer time is selected every week(SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
##时间选择每月(SGD->CNY)
#  Scenario:Inter-bank transfer time per month (SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
#
#    #时间选择每季度(SGD->CNY)
#  Scenario:Inter-bank transfer time is selected quarterly(SGD->CNY)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356258424|11010003712      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356258424|11010003712      |0.10             |Business Expenses|
#
#
#
##时间选择每周(SGD->USD)
#  Scenario:Inter-bank transfer time is selected every week(SGD->USD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#
##时间选择每月(SGD->USD)
#  Scenario:Inter-bank transfer time per month (SGD->USD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#
#
#    #时间选择每季度(SGD->USD)
#  Scenario:Inter-bank transfer time is selected quarterly(SGD->USD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643356259982|11010003720      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC1643356259982|11010003720      |0.10             |Business Expenses|
#
#   #境内转账-跨行转账时间选择每周一(SGD->EUR)
#  Scenario:In-line transfer time within the line is selected every Monday(SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
##时间选择每周(SGD->EUR)
#  Scenario:Inter-bank transfer time is selected every week(SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
##时间选择每月(SGD->EUR)
#  Scenario:Inter-bank transfer time per month (SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
#
#    #时间选择每季度(SGD->EUR)
#  Scenario:Inter-bank transfer time is selected quarterly(SGD->EUR)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC164335629908 |11010003747      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#    Then I check the details on the transfer success details page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335629908 |11010003747      |0.10             |Business Expenses|
#
#@Manager123321
# #境内转账-跨行转账时间选择每周一(SGD->HKD)
#  Scenario:In-line transfer time within the line is selected every Monday(SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
#
##时间选择每周(SGD->HKD)
#  Scenario:Inter-bank transfer time is selected every week(SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate|
#      |2025-01-01    |Weekly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
#
##时间选择每月(SGD->HKD)
#  Scenario:Inter-bank transfer time per month (SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate |
#      |2025-01-01    |Monthly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page
#
#
#    #时间选择每季度(SGD->HKD)
#  Scenario:Inter-bank transfer time is selected quarterly(SGD->HKD)
#    Given logon "netSilverEnv_Kevin" on enterprise net silver
#    When I fill in the transfer information of overseas domestic transfer bank
#      |bank name                       |account name    |receiving account|transfer amount  |transfer purpose |payment information|
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010003437      |0.1              |Business Expenses|1101 0001 256      |
#    When I select date on the domestic transfer bank page
#      |trasferOutDate|selectDate   |
#      |2025-01-01    |Quarterly    |
#    When I choose Periods to fill in the information for the in-country transfer
#      |periods|
#      |1      |
#    When I click next button on the domestic transfer bank page
#    When If the transfer failure window pops up I will click the continue button
#    Then I verify the information on the next page
#      |account name    |receiving account|transfer amount  |transfer purpose |
#      |TSC164335621223 |11010003739      |0.10             |Business Expenses|
#    When I click Next to go to the verification page
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I jump to the successful transfer page


#
#
#  @overseasTransfer02
#  Scenario:Positive process of overseas transfer(CNY--SGD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense  |
#      |1101 0001 434|CNY          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |SGD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204      |luckys   |
#    When I click on the receiving bank drop down box
#    When I click the recipient bank is Singapore
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |110200083204      |
#
#
#  @overseasTransfer03
##    目前有问题，未解决
#  Scenario:Positive process of overseas transfer(EUR--SGD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment amount and the cost commitment
#      |selectAccount|enterAmount|expense                                  |
#      |1101 0004 395|50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |SGD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204      |luckys   |
#    When I click on the receiving bank drop down box
#    When I click the recipient bank is Singapore
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11010004395  |110200083204       |
#
#  @overseasTransfer04
#  Scenario:Positive process of overseas transfer(HKD--SGD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1102 0006 749|HKD          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |SGD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204      |luckys   |
#    When I click on the receiving bank drop down box
#    When I click the recipient bank is Singapore
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006749  |11020009098      |
#
#
#


#
#  @overseasTransfer06
#  Scenario:Positive process of overseas transfer(CNY--CNY)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense  |
#      |1101 0001 434|CNY          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |CNY         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204      |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |110200083204      |
#
#  @overseasTransfer07
#  Scenario:Positive process of overseas transfer(EUR--EUR)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment amount and the cost commitment
#      |selectAccount|enterAmount|expense                                  |
#      |1101 0004 395|50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |EUR         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11010004395  |11020009098      |
#
#  @overseasTransfer08
#  Scenario:Positive process of overseas transfer(HKD--HKD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1102 0006 749|HKD          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |HKD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006749  |11020009098      |
#

#
#
#  @overseasTransfer10
##    保存模板
#  Scenario:Positive process of overseas transfer(SGD--USD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense         |
#      |1101 0001 434|USD          |50         |所有费用由汇款人承担|
#    And I choose the payment currency
#      |selectAccBth|
#      |SGD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I click save content to template
#      |templateName|collectingBank      |
#      |SGD-USD     |BILL BANK LUXEMBOURG|
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |110200083204       |
#
#  @overseasTransfer11
##    贸易融资
#  Scenario:Positive2 process of overseas transfer(USD--SGD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|SGD          |60         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |SGD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |110200083204       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Trade Services          |
#    When I chose trade finance, the transportation route chose nautical
#      |transportMethod|shipNm|shipNo|shipmentAddR|trafficAddR|goodInvolved|
#      |航海            |lucky |001   |china       |china      |ok          |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |110200083204      |
#
#  @overseasTransfer12
#  Scenario:Positive process of overseas transfer(CNY--USD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|CNY          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |USD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11020009098       |
#
#
#  @overseasTransfer13
#  Scenario:Positive process of overseas transfer(USD--CNY)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|USD          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |USD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11020009098       |
#
#  @overseasTransfer14
#  Scenario:Positive process of overseas transfer(SGD--CNY)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|SGD          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |CNY        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11020009098       |
#
#  @overseasTransfer15
#  Scenario:Positive process of overseas transfer(HKD--CNY)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1102 0006 749|HKD          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |CNY        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006749  |11020009098       |
#
#  @overseasTransfer16
#  Scenario:Positive process of overseas transfer(HKD--USD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1102 0006 749|HKD          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |USD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020009098       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006749  |11020009098       |
#
#
#  @overseasTransfer17
#  Scenario:Positive process of overseas transfer(USD--HKD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|USD          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |HKD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020006749       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11020006749       |
#
#  @overseasTransfer18
#  Scenario:Positive process of overseas transfer(CNY--HKD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1102 0006 749|CNY          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |HKD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11010004395       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006749  |11010004395       |
#
#  @overseasTransfer19
#  Scenario:Positive process of overseas transfer(EUR--HKD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment amount and the cost commitment
#      |selectAccount|enterAmount|expense                                  |
#      |1101 0004 395|50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |HKD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020006749       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11010004395  |11020006749       |
#
#  @overseasTransfer20
#  Scenario:Positive process of overseas transfer(HKD--EUR)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1102 0006 749|HKD          |50         |The expenses shall be borne by each party|
#
#    And I choose the payment currency
#      |selectAccBth|
#      |EUR         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11010004395       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006749  |11010004395       |
#
#  @overseasTransfer21
#  Scenario:Positive process of overseas transfer(EUR--CNY)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment amount and the cost commitment
#      |selectAccount|enterAmount|expense                                  |
#      |1101 0004 395|50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |CNY        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020006749       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11010004395  |11020006749       |
#
#  @overseasTransfer22
#  Scenario:Positive process of overseas transfer(EUR--USD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment amount and the cost commitment
#      |selectAccount|enterAmount|expense                                  |
#      |1101 0004 395|50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |USD        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11020006749       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11010004395  |11020006749       |
#
#  @overseasTransfer23
#  Scenario:Positive process of overseas transfer(CNY--EUR)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|CNY          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |EUR        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11010004395       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11010004395       |
#
#  @overseasTransfer24
#  Scenario:Positive process of overseas transfer(USD--EUR)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|USD          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |EUR        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11010004395       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11010004395       |
#
#  @overseasTransfer25
#  Scenario:Positive process of overseas transfer(SGD--HKD)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|SGD          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |HKD         |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11010004395       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11010004395       |
#
#
#  @overseasTransfer26
#  Scenario:Positive process of overseas transfer(SGD--EUR)
#    Given logon "netSilverEnv_sun" on enterprise net silver
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |selectAccount|payeeCurrency|enterAmount|expense                                  |
#      |1101 0001 434|SGD          |50         |The expenses shall be borne by each party|
#    And I choose the payment currency
#      |selectAccBth|
#      |EUR        |
#    When I enter the payee information
#      |sendPaymentAccount|namePayee|
#      |11010004395       |lucky    |
#    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |collectingBank|
#      |CITIBANK USA  |
#    When I choose the recipient country
#      |payeeAdd |payeeCountries|remittancePostscriptContent|
#      |countries|UNITED STATES |ok                         |
#    When I choose the nature of payment
#      |selectPaymentAttributeCd|
#      |Commission              |
#    When I choose to submit the transfer information
#    Then TC code is then required for Vkey authentication
#    When I get the TC code and click Next
#    When I typed TC Code and click Authenticate Now
#    Then I checked the details on the successful overseas transfer details page
#      |selectAccount|sendPaymentAccount|
#      |11020006552  |11010004395       |
