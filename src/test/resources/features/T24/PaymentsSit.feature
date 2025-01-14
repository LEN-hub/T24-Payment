@T24Payments_SIT
Feature: T24 Payment transaction

  #境外转账
  @Payment_Overseas_Transfer_SGD-USD_SIT
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->USD)_SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges |
      |1101 000 470  |OUR                      |
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0DOD     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment
      |WordPath          |
      |Bic is DBS SGD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-USD|
    Then I do field mapping for Channel and T24 in FX Payment
      |WordPath          |
      |Bic is DBS SGD-USD|
    When I compare the amount is normal
      |WordPath          |
      |Bic is DBS SGD-USD|
    When I compare the data generated by Outgoing Message is correct
      |WordPath          |Name              |
      |Bic is DBS SGD-USD|Bic is DBS SGD-USD|



  @Payment_Overseas_Transfer_USD-SGD_SIT
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges |
      |1101 0000 489 |SHA                      |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0DOD     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment Different Currency MX Message
      |WordPath          |
      |Bic is DBS USD-SGD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS USD-SGD|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
      |WordPath          |
      |Bic is DBS USD-SGD|
    When I compare the amount is normal for Different Currency
      |WordPath          |
      |Bic is DBS USD-SGD|
    When I compare the data generated by Outgoing Message is correct for Different Currency
      |WordPath          |Name              |
      |Bic is DBS USD-SGD|Bic is DBS USD-SGD|
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |WordPath          |
      |FOREX         |T24-automation-SIT-login-Auth  |Bic is DBS USD-SGD|
    When I view the exchange rate in the Payment Order RFQ Rate Audit menu On Oversea Payment MX
      |WordPath          |
      |Bic is DBS USD-SGD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS USD-SGD |
#    When Use "T24-automation-SIT-login-Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @Payment_Overseas_Transfer_SGD-SGD_SIT
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges|
      |1101 0000 470 |SHA                     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0DOD     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is DBS SGD-SGD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-SGD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS SGD-SGD |

  @Payment_Overseas_Transfer_USD-USD_SIT
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->USD)
    Given logon "INB-automation-SIT-login2" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges|
      |1101 0000 489 |BEN                     |
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
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is DBS USD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS USD-USD |

  #境外转账
  @FxPaymentSGDToUSDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(SGD->USD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 438 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |INNOMY40XXX     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment
      |WordPath          |
      |Bic is UOB SGD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is UOB SGD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is UOB SGD-USD|
    Then I do field mapping for Channel and T24 in FX Payment
      |WordPath          |
      |Bic is UOB SGD-USD|
    When I compare the amount is normal
      |WordPath          |
      |Bic is UOB SGD-USD|
    When I compare the data generated by Outgoing Message is correct
      |WordPath          |Name              |
      |Bic is UOB SGD-USD|Bic is UOB SGD-USD|
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |Name              |
      |FOREX         |T24-automation-SIT-login-Auth|Bic is UOB SGD-USD|
#    When Use "T24-automation-SIT-login-Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @FxPaymentUSDToSGDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(USD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 489 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |INNOMY40XXX     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment Different Currency MX Message
      |WordPath          |
      |Bic is UOB USD-SGD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is UOB USD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is UOB USD-SGD|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
      |WordPath          |
      |Bic is UOB USD-SGD|
    When I compare the amount is normal for Different Currency
      |WordPath          |
      |Bic is UOB USD-SGD|
    When I compare the data generated by Outgoing Message is correct for Different Currency
      |WordPath          |Name              |
      |Bic is UOB USD-SGD|Bic is UOB USD-SGD|
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |WordPath          |
      |FOREX         |T24-automation-SIT-login-Auth|Bic is UOB USD-SGD|
#    When Use "T24-automation-SIT-login-Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @FxPaymentUSDToSGDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(SGD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 438 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |INNOMY40XXX     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is UOB SGD-SGD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is UOB SGD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is UOB SGD-SGD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is UOB SGD-SGD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is UOB SGD-SGD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is UOB SGD-SGD|Bic is UOB SGD-SGD|

  @FxPaymentUSDToUSDBicIsUOB
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is UOB(USD->USD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0000 489 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |INNOMY40XXX     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is UOB USD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is UOB USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is UOB USD-USD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is UOB USD-USD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is UOB USD-USD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |WordPath          |
      |Bic is UOB USD-USD|Bic is UOB USD-USD|

    #本人互转
  @Payment_Own_Transfer_SGD-SGD_SIT
  Scenario:Local Payment Data Mapping FX Payment (SGD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 470   |1101 0000 438|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath|
      |SGD-SGD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath|
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|SGD-SGD |
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath|
      |FUNDS.TRANSFER|SGD-SGD |
    Then I will map the page data
      |WordPath|
      |SGD-SGD |
    When I check the deduction amount on the Find Account page On Local Payment
      |windows Title            |WordPath|
      |AA Arrangement - SIT GLDB|SGD-SGD |

  @Payment_Own_Transfer_USD-USD_SIT
  Scenario:Local Payment Data Mapping FX Payment (USD->USD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 489   |1101 0000 608|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath|
      |USD-USD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath|
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-USD |
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath|
      |FUNDS.TRANSFER|USD-USD |
    Then I will map the page data
      |WordPath|
      |USD-USD |
    When I check the deduction amount on the Find Account page On Local Payment
      |windows Title            |WordPath|
      |AA Arrangement - SIT GLDB|USD-USD |


  @Payment_Own_Transfer_USD-SGD_SIT
  Scenario:Local Payment Data Mapping FX Payment (USD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 489   |1101 0000 470|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
      |WordPath|
      |USD-SGD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |WordPath|
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-SGD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |WordPath|
      |Pending and Processed Payments - SIT GLDB|USD-SGD |
    Then I do field mapping for Channel and T24 in Own FX Payment
      |WordPath|
      |USD-SGD |
    When I compare the amount is normal To Local Payment
      |WordPath|
      |USD-SGD |
    When I compare the data generated by Outgoing Message is correct On Local Payment
      |Name                      |
      |Internal Transfer USD-SGD |
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |WordPath|
      |FOREX         |T24-automation-SIT-login-Auth  |USD-SGD |
    When I view the exchange rate in the Payment Order RFQ Rate Audit menu On Local Payment
      |WordPath|
      |USD-SGD |
    When I check the deduction amount on the Find Account page On Local Payment
      |windows Title            |WordPath|
      |AA Arrangement - SIT GLDB|USD-SGD |
#    When Use "T24-automation-SIT-login-Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @Payment_Own_Transfer_SGD-USD_SIT
  Scenario:Local Payment Data Mapping FX Payment (SGD->USD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 438   |1101 0000 489|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
      |WordPath                  |
      |Internal Transfer SGD-USD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |WordPath                  |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Internal Transfer SGD-USD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |WordPath                  |
      |Pending and Processed Payments - SIT GLDB|Internal Transfer SGD-USD |
    Then I do field mapping for Channel and T24 in Own FX Payment
      |WordPath                  |
      |Internal Transfer SGD-USD |
    When I compare the amount is normal To Local Payment
      |WordPath                  |
      |Internal Transfer SGD-USD |
    When I compare the data generated by Outgoing Message is correct On Local Payment
      |WordPath                  |
      |Internal Transfer SGD-USD |
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |WordPath                  |
      |FOREX         |T24-automation-SIT-login-Auth|Internal Transfer SGD-USD |
#    When Use "T24-automation-SIT-login-Auth" to log in to T24 environment
#    When I enter the Unauthorized Forex Deals Menu page to authorize the operation

  @Payment_Local_Fund_Transfer_MEPS/FAST/PayNow_SIT
    #境内转账-跨行转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
      |BANK OF CHINA LIMITED  |TSC1643346550706|678321687312          |Business Expenses   |1101 0000 438 |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on same Currency Payment
      |WordPath                   |
      |Local Fund Payment SGD-SGD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Fund Payment SGD-SGD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                   |
      |Pending and Processed Payments - SIT GLDB|Local Fund Payment SGD-SGD |
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                   |
      |Local Fund Payment SGD-SGD |
    When I compare the amount is normal on Mx Message
      |WordPath                   |
      |Local Fund Payment SGD-SGD |
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath                   |Name                       |
      |Local Fund Payment SGD-SGD |Local Fund Payment SGD-SGD |


#@LocalPaymentTestSGDToUSD
#    #境内转账-行内转账时间选择每周一(SGD->USD)
#  Scenario:Transfer time within the line is selected every Monday (SGD->USD)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I fill in the transfer information of domestic transfer bank
#      |Payee's Bank                    |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |
#      |Green Link Digital Bank Pte. Ltd|TSC1643346550706|11010000489           |Business Expenses   |1101 0000 438 |
#    When I click next button on the domestic transfer bank page
#    Then I verify the information on the next page
#    When I click Next to go to the verification page
#    When If the transfer failure window pops up I will click the continue button
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on same Currency Payment
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button
#      |search content           |windows Title        |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|
#    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
#      |search content|
#      |FUNDS.TRANSFER|
#    Then I will map the page data

  #PayNow签约
  @Paynow01
  Scenario:PayNow Signing Process
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I execute manage PayNow Profile transaction on the page
    When Vkey authorization for Payment transactions in the SIT environment
#    Given logon "INB-automation-SIT-login2" in SIT environment and bypass Vkey
#    When Click My Task to find data for authorization
#    When Vkey authorization for Payment transactions in the SIT environment

  #PayNow解约
  @Paynow02
  Scenario:PayNow Signing Off
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I sign and cancel the transaction on the page
    When Vkey authorization for Payment transactions in the SIT environment

  #PayNow修改
  @Paynow03
  Scenario:PayNow Signing Modify
    Given logon "INB-automation-SIT-login2" in SIT environment and bypass Vkey
    When I carry out the signing and modification process on the page
      |AccountNu    |
      |1101 0002 449|
    Then I close driver