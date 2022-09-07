@T24Payments
Feature: T24 Payment transaction

  #境外转账
  @FxPaymentSGDToUSD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 373 |The expenses shall be borne by each party|
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
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment
    When I compare the amount is normal
    When I compare the data generated by Outgoing Message is correct
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_SIT_Auth|

  @FxPaymentUSDToSGD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 403 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
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
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment Different Currency MX Message
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
    When I compare the amount is normal for Different Currency
    When I compare the data generated by Outgoing Message is correct for Different Currency
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_SIT_Auth|
#    When Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @FxPaymentSGDToSGD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 373 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
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
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct

  @FxPaymentUSDToUSD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 403 |The expenses shall be borne by each party|
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
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct
  #境外转账
  @FxPaymentSGDToUSDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(SGD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 373 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |UOB             |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment
    When I compare the amount is normal
    When I compare the data generated by Outgoing Message is correct
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_SIT_Auth|
#    When Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @FxPaymentUSDToSGDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(USD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 403 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |UOB             |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment Different Currency MX Message
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
    When I compare the amount is normal for Different Currency
    When I compare the data generated by Outgoing Message is correct for Different Currency
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_SIT_Auth|
#    When Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @FxPaymentSGDToSGDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 373 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |UOB             |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct

  @FxPaymentUSDToUSDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(USD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 403 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |UOB             |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct

    #本人互转
  @localPaymentSGDToSGD
  Scenario:Local Payment Data Mapping FX Payment (SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 373   |1101 0000 632|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|
      |FUNDS.TRANSFER|
    Then I will map the page data

  @localPaymentUSDToUSD
  Scenario:Local Payment Data Mapping FX Payment (USD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 403   |1101 0000 411|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|
      |FUNDS.TRANSFER|
    Then I will map the page data

  @localPaymentUSDToSGD
  Scenario:Local Payment Data Mapping FX Payment (USD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 403   |1101 0000 373|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in Own FX Payment
    When I compare the amount is normal To Local Payment
    When I compare the data generated by Outgoing Message is correct On Local Payment
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_SIT_Auth|
#    When Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @localPaymentSGDToUSD
  Scenario:Local Payment Data Mapping FX Payment (SGD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 373   |1101 0000 403|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in Own FX Payment
    When I compare the amount is normal To Local Payment
    When I compare the data generated by Outgoing Message is correct On Local Payment
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |
      |FOREX         |netSilverEnv_Kevin_T24_SIT_Auth|
#    When Use "netSilverEnv_Kevin_T24_SIT_Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @LocalPaymentTestSGDToSGD
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |UOB          |TSC1643346550706|678321687312          |Business Expenses   |1101 0000 373 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on same Currency Payment
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
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
      |Pending and Processed Payments - SIT GLDB|
    Then I do field mapping for Channel and T24 in same currency
    When I compare the amount is normal on Mx Message
    When I compare the data generated by Outgoing Message MX Message is correct


#@LocalPaymentTestSGDToUSD
#    #境内转账-行内转账时间选择每周一(SGD->USD)
#  Scenario:Transfer time within the line is selected every Monday (SGD->USD)
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When I fill in the transfer information of domestic transfer bank
#      |Payee's Bank                    |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010000489           |Business Expenses   |1101 0000 373 |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on same Currency Payment
#    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
#    When I type in the content and click the search button
#      |search content           |windows Title        |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
#    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
#      |search content|
#      |FUNDS.TRANSFER|
#    Then I will map the page data